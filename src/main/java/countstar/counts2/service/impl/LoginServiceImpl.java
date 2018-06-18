package countstar.counts2.service.impl;

import com.aliyuncs.exceptions.ClientException;
import countstar.counts2.dao.UserDAO.requesterDAO;
import countstar.counts2.dao.UserDAO.workerDAO;
import countstar.counts2.dao.UserDAO.adminDAO;
import countstar.counts2.model.Admin;
import countstar.counts2.model.Requester;
import countstar.counts2.model.Worker;
import countstar.counts2.service.serv.LoginService;
import countstar.counts2.tools.smsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service(value = "LoginServiceImpl")
public class LoginServiceImpl implements LoginService {

    private smsUtils sms=new smsUtils();
    @Autowired
    private adminDAO adminDAO;
    private requesterDAO requesterDAO;
    private workerDAO workerDAO;



    //实现向手机发送验证码//
    @Override
    public Map<String, Object> sendSms(String phNum,int identity) throws ClientException {
        Map<String,Object> result=new HashMap<>();
        boolean isExist=false;
        if(identity==1){
            if(requesterDAO.isExist(phNum)==1){
                isExist=true;
            }
        }else{
            if(workerDAO.isExist(phNum)==1){
                isExist=true;
            }
        }
        if(isExist){
            result.put("isExist",true);
            result.put("verCode","xxxxxx");
        }else{
            sms.sendSms(phNum);
            result.put("verCode",sms.getCode());
            result.put("isExist",false);
        }
        return result;
    }
    //实现不同种类用户的登录
    @Override
    public String login(String phNum, String psw,int identity) {
        String result = null;
        switch (identity) {
            case 0:
                if (adminDAO.isExist(phNum) == 1) {
                    Admin admin = adminDAO.getAdminByPhNum(phNum);
                    String realPsw = admin.getPsw();
                    if (realPsw.equals(psw)) {
                        return admin.toString();
                    } else {
                        return "手机号或密码不正确";
                    }
                }
                break;
            case 1:
                if (requesterDAO.isExist(phNum) == 1) {
                    Requester requester = requesterDAO.getRequesterByPhNum(phNum);
                    String realPsw = requester.getPsw();
                    if (realPsw.equals(psw)) {
                        return requester.toString();
                    } else {
                        return "手机号或密码不正确";
                    }
                }
                break;
            case 2:
                if (workerDAO.isExist(psw) == 1) {
                    Worker worker = workerDAO.getWorkerByPhNum(phNum);
                    String realPsw = worker.getPsw();
                    if (realPsw.equals(psw)) {
                        return worker.toString();
                    } else {
                        return "手机号或密码不正确";
                    }
                }
                break;

        }
        return result;
    }
     //实现不同种类用户的注册
    @Override
    public String register(String phNum, String psw, int identity) {
        if(identity==1){
            Requester requester=new Requester(phNum,psw);
            requesterDAO.insertR(requester);
        }else{
            Worker worker=new Worker(phNum,psw);
            workerDAO.insertW(worker);
        }
        return "success";
    }


}

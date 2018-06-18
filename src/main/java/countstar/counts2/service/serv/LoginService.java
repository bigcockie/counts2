package countstar.counts2.service.serv;

import com.aliyuncs.exceptions.ClientException;

import java.util.Map;

public interface LoginService {
    Map<String,Object> sendSms(String phNum,int identity) throws ClientException;//传入电话号码发送验证码
    String login(String phNum,String psw,int identity);//传入电话号码和密码进行登录
    String register(String phNum, String psw, int identity);//输入手机号进行验证
}

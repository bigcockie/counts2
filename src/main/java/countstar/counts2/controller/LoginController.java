package countstar.counts2.controller;
import com.aliyuncs.exceptions.ClientException;
import countstar.counts2.service.serv.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;


/**
 * Created by Intellij IDEA.
 *
 * @Author Cruck
 * @Date 2018/05/04
 * @Comment
 */
@RestController
public class LoginController {
    private Logger log = LoggerFactory.getLogger(LoginController.class);
    @Resource(name = "LoginServiceImpl")
    private LoginService loginService;
    /**
     * 获取登录信息
     * @param req
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam Map<String, Object> req) {
        String phNum=req.get("phNum").toString();
        String psw=req.get("psw").toString();
        int identity=Integer.parseInt(req.get("identity").toString());
        log.debug("The method is ending");
        return loginService.login(phNum,psw,identity);
    }
    /**
     * 发送验证码
     * @param req
     * @return
     */
    @RequestMapping(value = "/sendSms", method = RequestMethod.GET)
    public Map<String,Object> sendSms(@RequestParam Map<String, Object> req) throws ClientException {
        String phNum=req.get("phNum").toString();
        int identity=Integer.parseInt(req.get("identity").toString());
        return loginService.sendSms(phNum,identity);
    }

    /**
     * 用户注册
     * @param req
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(@RequestParam Map<String, Object> req) {
        String phNum=req.get("phNum").toString();
        String psw=req.get("psw").toString();
        int identity=Integer.parseInt(req.get("identity").toString());
        return loginService.register(phNum,psw,identity);
    }
}

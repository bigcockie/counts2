package countstar.counts2.tools;
import com.aliyuncs.DefaultAcsClient;
 import com.aliyuncs.IAcsClient;
 import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
 import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
 import com.aliyuncs.exceptions.ClientException;
 import com.aliyuncs.http.MethodType;
 import com.aliyuncs.profile.DefaultProfile;
 import com.aliyuncs.profile.IClientProfile;
public class smsUtils {
     private String code="";
     public String getCode(){
                 return code; }
     public void setCode(){//每次调用生成一个6位的随机验证码
         for(int i=0;i<6;i++) {
             code += (int) (Math.random()*10);
         }
            }
             //短信API产品名称
            static final String product="Dysmsapi";
             //短信API产品域名
            static final String domain="dysmsapi.aliyuncs.com";
           static final String accessKeyId = "LTAIDVCOsTnzHnlw";
           static final String accessKeySecret = "eJKXK6cEAaerePZlpeUtHSlgjRP56C";

             public  SendSmsResponse sendSms(String telphone) throws ClientException{
                 //设置超时时间
                 System.setProperty("sun.net.client.defaultConnectTimeout", "60000");
                 System.setProperty("sun.net.client.defaultReadTimeout", "60000");
                //初始化ascClient
                 IClientProfile profile=DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
                 DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou",product, domain);
                 IAcsClient acsClient=new DefaultAcsClient(profile);

                 //组装请求对象
                 SendSmsRequest request=new SendSmsRequest();
                 //使用post提交
                 request.setMethod(MethodType.POST);
                 //待发送的手机号
                 request.setPhoneNumbers(telphone);
               //短信签名
                 request.setSignName("星云众包");
                 //短信模板ID
                 request.setTemplateCode("SMS_136380444");
                 //验证码
                 smsUtils sms = new smsUtils();
                 sms.setCode();
                 code=sms.getCode();
                 request.setTemplateParam("{\"code\":\""+code+"\"}");
                 SendSmsResponse response=acsClient.getAcsResponse(request);
                 if(response.getCode() != null && response.getCode().equals("OK")) {
                   }
                 return response;
             }
 }


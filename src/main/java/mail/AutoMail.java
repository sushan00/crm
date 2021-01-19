package mail;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import base.ReadProperties;

public class AutoMail {
    public static void main(String[] args) throws IOException {
        System.out.println("中文");
        MailInfo mailInfo = new MailInfo();
        String sendTo[] = readMail("sendto");
        String cclist[] = readMail("cc");

        String filename = "mail.properties";
        mailInfo.setMailServerHost(base.ReadProperties.getprop(filename, "MailServerHost"));
        mailInfo.setMailServerPort(base.ReadProperties.getprop(filename, "MailServerPort"));
        mailInfo.setValidate(true);
        mailInfo.setUsername(base.ReadProperties.getprop(filename, "Username"));
        mailInfo.setPassword(base.ReadProperties.getprop(filename, "Password"));// 您的邮箱密码
        mailInfo.setFromAddress(base.ReadProperties.getprop(filename, "FromAddress"));
        mailInfo.setToAddress(sendTo);
        mailInfo.setSubject(base.ReadProperties.getprop(filename, "Subject"));
        mailInfo.setCcAddress(cclist);

        String mailcontent = ReadHtml.readString("./target/surefire-reports/html/overview.html");
        String cssvalue = ReadHtml.readString("./target/surefire-reports/html/reportng.css");
        String changestr = "<style type=\"text/css\">h1 {display : inline}" + cssvalue + "</style>";
        mailcontent = mailcontent.replace("<link href=\"reportng.css\" rel=\"stylesheet\" type=\"text/css\" />", changestr);
        String logostr = "<h1 style=\"color:red ; font-size:30px;font-family: '楷体','楷体_GB2312';\">自动化星球为您报告</h1>";
        mailcontent = mailcontent.replace("<h1>Test Results Report</h1>", logostr);
        mailInfo.setContent(mailcontent);
        SendMail.sendHtmlMail(mailInfo);// 发送html格式邮件

    }

    public static String[] readMail(String mailtype) throws IOException {
        int i = 0;
        Properties props = ReadProperties.getprops(mailtype + ".properties");
        String[] mailto = new String[props.size()];
        for (Enumeration<Object> enu = props.elements(); enu.hasMoreElements();) {
            String key = (String) enu.nextElement();
            mailto[i] = key;
            i++;
        }
        return mailto;
    }


}

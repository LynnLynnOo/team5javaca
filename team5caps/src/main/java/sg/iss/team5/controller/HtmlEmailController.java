package sg.iss.team5.controller;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
 
import sg.iss.team5.mail.MyConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class HtmlEmailController {
 
    @Autowired
    public JavaMailSender emailSender;
 
    @ResponseBody
    @RequestMapping("/admin/sendHtmlEmail")
    public String sendHtmlEmail() throws MessagingException {
 
        MimeMessage message = emailSender.createMimeMessage();
 
        boolean multipart = true;
         
        MimeMessageHelper helper = new MimeMessageHelper(message, multipart, "utf-8");
         
        String htmlMsg = "<h3>Dear Student,</h3><p>This is a kind reminder that you have not registered for any courses. Please kindly register for a minimum of one subject before the end of registration period.</p> <p>Warm Regards,</p><p>The Team 5 Admin Team</p>"
                +"<img src='https://myaces.nus.edu.sg/passfail/images/pf_banner2008.gif'>";
         
        message.setContent(htmlMsg, "text/html");
         
        helper.setTo(MyConstants.FRIEND_EMAIL);
         
        helper.setSubject("Reminder for Subject Registration");
         
     
        this.emailSender.send(message);
 
        return "Email Sent!";
    }
 
}
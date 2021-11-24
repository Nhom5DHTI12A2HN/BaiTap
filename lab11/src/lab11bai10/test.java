/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab11bai10;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author LENOVO
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MessagingException, UnsupportedEncodingException {

        final String fromEmail = "thai27testmailapi@gmail.com";
        final String password = "Thai27passmailapi";
        final String toEmail = "vietthai272000@gmail.com";
        final String subject = "Java Example Test";
        final String body = "Hello Admin";

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(fromEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
        message.setSubject(subject);
         
        BodyPart messageBodyPart1 = new MimeBodyPart();
        messageBodyPart1.setText(body);
        // phan 2 chua tap tin txt
        MimeBodyPart messageBodyPart2 = new MimeBodyPart();
        // Duong dan den file cua ban
        String filePath = "test.txt";
        DataSource source1 = new FileDataSource(filePath);
        messageBodyPart2.setDataHandler(new DataHandler(source1));
        messageBodyPart2.setFileName(filePath);
        // phan 3 chua tap tin image
        MimeBodyPart messageBodyPart3 = new MimeBodyPart();
        // Duong dan den file cua ban
        String imagePath = "Capture.JPG";
        DataSource source2 = new FileDataSource(imagePath);
        messageBodyPart3.setDataHandler(new DataHandler(source2));
        messageBodyPart3.setFileName(imagePath);
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart1);
        multipart.addBodyPart(messageBodyPart2);
        multipart.addBodyPart(messageBodyPart3);
        message.setContent(multipart);
        Transport.send(message);
        System.out.println("Gui mail thanh cong");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Readmail;


import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

/**
 *
 * @author LENOVO
 */
public class readmail {
     // main function. Project run starts from main function...
   public static void main(String[] args) {

      //Set mail properties and configure accordingly
      String hostval = "pop.gmail.com";
      String mailStrProt = "pop3";
      String uname = "thai27nhanmailapi@gmail.com";
      String pwd = "Thai27passmailapi";
    // Calling checkMail method to check received emails
      checkMail(hostval, mailStrProt, uname, pwd);
   }
   public static void checkMail(String hostval, String mailStrProt, String uname,String pwd) 
   {
      try {
      //Set property values
      Properties propvals = new Properties();
      propvals.put("mail.pop3.host", hostval);
      propvals.put("mail.pop3.port", "995");
      propvals.put("mail.pop3.starttls.enable", "true");
      Session emailSessionObj = Session.getDefaultInstance(propvals);  
      //Create POP3 store object and connect with the server
      Store store = emailSessionObj.getStore("pop3s");
      store.connect(hostval, uname, pwd);
      //Create folder object and open it in read-only mode
       Folder emailFolder = store.getFolder("Inbox");

      emailFolder.open(Folder.READ_ONLY);

      //Fetch messages from the folder and print in a loop
      Message[] messages = emailFolder.getMessages();

      for (int i = 0, n = messages.length; i < n; i++) {
         Message message = messages[i];
         Object obj = message.getContent();
         Multipart mp = (Multipart)obj;
         BodyPart bp = mp.getBodyPart(0);
         System.out.println("------------------Email đến------------------");
         System.out.println("");
         System.out.println("  Người gửi: " + message.getFrom()[0]);
         System.out.println("  Tiêu đề: " + message.getSubject());
         System.out.println("  Nội dung: " + bp.getContent().toString());
         System.out.println("");
         System.out.println("---------------------------------------------");
      }
      //Now close all the objects
      emailFolder.close(false);
      store.close();
      } catch (NoSuchProviderException exp) {
         exp.printStackTrace();
      } catch (MessagingException exp) {
         exp.printStackTrace();
      } catch (Exception exp) {
         exp.printStackTrace();
      }
   }
    
}


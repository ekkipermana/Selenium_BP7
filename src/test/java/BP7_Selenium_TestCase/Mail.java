package BP7_Selenium_TestCase;

import org.testng.log4testng.Logger;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Mail {

    public static void main(String[] args) {

        // Create object of Property file
        Properties props = new Properties();

        // this will set host of server- you can change based on your requirement
        props.put("mail.smtp.host", "smtp.mailtrap.io");

        // set the port of socket factory
        props.put("mail.smtp.socketFactory.port", "2525");

        // set socket factory
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

        // set the authentication to true
        props.put("mail.smtp.auth", "true");

        // set the port of SMTP server
        props.put("mail.smtp.port", "2525");

        // This will handle the complete authentication
        Session session = Session.getDefaultInstance(props,

                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication("12230bf37979a3", "84ee631f1bcb64");

                    }

                });

        try {

            // Create object of MimeMessage class
            Message message = new MimeMessage(session);

            // Set the from address
            message.setFrom(new InternetAddress("ekki.permana66@gmail.com"));

            // Set the recipient address
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("SekolahQABPA7@gmail.com"));

            // Add the subject link
            message.setSubject("Report Selenium OrangeHRM BP7 Ekki Permana 23 Juli 2021");

            // Create object to add multimedia type content
            BodyPart messageBodyPart1 = new MimeBodyPart();

            // Set the body of email
            messageBodyPart1.setText("Report SekolahQA BP7");



            // Create another object to add another content
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            // Mention the file which you want to send
            String filename = "test-output/emailable-report.html";

            // Create data source and pass the filename
            DataSource source = new FileDataSource(filename);

            // set the handler
            messageBodyPart2.setDataHandler(new DataHandler(source));

            // set the file
            messageBodyPart2.setFileName(filename);

            // Create object of MimeMultipart class
            Multipart multipart = new MimeMultipart();

            // add body part 1
            multipart.addBodyPart(messageBodyPart2);

            // add body part 2
            multipart.addBodyPart(messageBodyPart1);

            // set the content
            message.setContent(multipart);

            // finally send the email
            Transport.send(message);

            System.out.println("=====Email Sent=====");

        } catch (MessagingException e) {

            throw new RuntimeException(e);

        }

    }

}
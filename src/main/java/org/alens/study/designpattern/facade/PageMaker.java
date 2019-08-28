package org.alens.study.designpattern.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties mailProp = Database.getProperties("C:/mailData");
            String userName = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + userName + "'s page!");
            writer.paragraph("欢迎来到" + userName + "的主页！");
            writer.paragraph("等待你的邮件哦");
            writer.mailto(mailAddr, userName);
            writer.close();

            System.out.println(fileName + " is created for " + mailAddr + " (" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package org.alens.study.designpattern.prototype;

public class Main {

    private static final String STRONG_MESSAGE = "strong message";
    private static final String WARN_MESSAGE = "warn message box";

    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');

        manager.register(STRONG_MESSAGE, upen);
        manager.register(WARN_MESSAGE, mbox);

        Product p1 = manager.create(STRONG_MESSAGE);
        p1.use("Hello world");
        Product p2 = manager.create(WARN_MESSAGE);
        p2.use("Hello world");

    }

}

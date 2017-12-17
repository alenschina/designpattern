package org.alens.study.designpattern.templatemethod;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('A');
        AbstractDisplay stringDisplay = new StringDisplay("Hello world");

        charDisplay.display();
        stringDisplay.display();
    }
}

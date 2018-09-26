package org.alens.study.designpattern.bridge;

public class Main {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImpl("hello world"));
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("hello world"));

        d1.display();
        d2.display();
        d2.multiDisplay(5);
    }

}

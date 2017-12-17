package org.alens.study.designpattern.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 are same with EQUALS");
        }
        if (!obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 are not same with EQUALS");
        }
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 are same with ==");
        }
        if (obj1 != obj2) {
            System.out.println("obj1 and obj2 are not same with ==");
        }
    }
}

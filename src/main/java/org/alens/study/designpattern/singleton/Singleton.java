package org.alens.study.designpattern.singleton;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Create a singleton");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

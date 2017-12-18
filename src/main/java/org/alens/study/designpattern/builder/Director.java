package org.alens.study.designpattern.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("From morning to afternoon");
        builder.makeItems(new String[]{
                "Good morning",
                "Good afternoon"
        });
        builder.makeString("From night");
        builder.makeItems(new String[]{
                "Good night",
                "Good bye"
        });
        builder.close();
    }
}

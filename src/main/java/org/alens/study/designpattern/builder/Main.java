package org.alens.study.designpattern.builder;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(0);
        }
        if ("plain".equals(args[0])) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if ("html".equals(args[0])) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + " created success.");
        } else {
            System.exit(0);
        }
    }

}

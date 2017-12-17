package org.alens.study.designpattern.prototype;

public class MessageBox extends Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int width = s.getBytes().length;
        printLine(width);
        System.out.println(decochar + " " + s + " " + decochar);
        printLine(width);
        System.out.println("");
    }

    private void printLine(int width) {
        for (int i = 0; i < width + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

}

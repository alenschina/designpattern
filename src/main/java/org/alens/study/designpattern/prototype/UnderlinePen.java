package org.alens.study.designpattern.prototype;

public class UnderlinePen extends Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int width = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        printUnderLine(width);
    }

    private void printUnderLine(int width) {
        System.out.print(" ");
        for (int i = 0; i < width; i++) {
            System.out.print(ulchar);
        }
        System.out.print(" ");
        System.out.println("");
    }
}

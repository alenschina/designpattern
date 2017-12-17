package org.alens.study.designpattern.factorymethod.idcard;

import org.alens.study.designpattern.factorymethod.framework.Product;

public class IDCard extends Product {

    private String owner;

    private int serial;

    IDCard(String owner, int serial) {
        this.owner = owner;
        this.serial = serial;
        System.out.println("create card for " + owner + "(" + serial + ")");
    }

    @Override
    public void use() {
        System.out.println(owner + ": use this card (" + serial + ")");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}

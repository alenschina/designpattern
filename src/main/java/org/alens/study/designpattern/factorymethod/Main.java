package org.alens.study.designpattern.factorymethod;

import org.alens.study.designpattern.factorymethod.framework.Factory;
import org.alens.study.designpattern.factorymethod.framework.Product;
import org.alens.study.designpattern.factorymethod.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product idCard = factory.create("Aaron");
        idCard.use();

    }
}

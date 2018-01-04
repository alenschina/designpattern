package org.alens.study.designpattern.factorymethod;

import org.alens.study.designpattern.factorymethod.framework.Factory;
import org.alens.study.designpattern.factorymethod.framework.Product;
import org.alens.study.designpattern.factorymethod.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product idCard1 = factory.create("Aaron");
        Product idCard2 = factory.create("Tom");
        Product idCard3 = factory.create("Becky");

        idCard1.use();
        idCard2.use();
        idCard3.use();

    }
}

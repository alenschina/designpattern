package org.alens.study.designpattern.factorymethod.idcard;

import org.alens.study.designpattern.factorymethod.framework.Factory;
import org.alens.study.designpattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    public int serial = 1000;
    private Map owners = new HashMap();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    public void registerProduct(Product idCard) {
        owners.put(((IDCard) idCard).getOwner(), ((IDCard) idCard).getSerial());
    }

    public Map getOwners() {
        return owners;
    }
}

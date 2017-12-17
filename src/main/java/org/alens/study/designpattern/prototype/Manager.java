package org.alens.study.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map showcase = new HashMap<>();

    public void register(String protoName, Product proto) {
        this.showcase.put(protoName, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) this.showcase.get(protoName);
        return p.createClone();
    }
}

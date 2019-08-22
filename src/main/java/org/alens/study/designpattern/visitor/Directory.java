package org.alens.study.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    public Iterator iterator() {
        return directory.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

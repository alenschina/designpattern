package org.alens.study.designpattern.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir;

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String originDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
        currentDir = originDir;
    }
}

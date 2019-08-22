package org.alens.study.designpattern.visitor;

public interface Element {
    void accept(Visitor v);
}

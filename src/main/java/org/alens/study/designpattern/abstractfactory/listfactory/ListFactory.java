package org.alens.study.designpattern.abstractfactory.listfactory;

import org.alens.study.designpattern.abstractfactory.factory.Factory;
import org.alens.study.designpattern.abstractfactory.factory.Link;
import org.alens.study.designpattern.abstractfactory.factory.Page;
import org.alens.study.designpattern.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
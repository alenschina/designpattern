package org.alens.study.designpattern.abstractfactory.listfactory;

import org.alens.study.designpattern.abstractfactory.factory.Item;
import org.alens.study.designpattern.abstractfactory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n=");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}

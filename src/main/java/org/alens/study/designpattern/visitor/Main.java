package org.alens.study.designpattern.visitor;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);

            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));

            rootDir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries");
            Directory aaron = new Directory("aaron");
            Directory tom = new Directory("tom");
            Directory lucy = new Directory("lucy");

            usrDir.add(aaron);
            usrDir.add(tom);
            usrDir.add(lucy);

            aaron.add(new File("a.html", 100));
            tom.add(new File("b.txt", 400));
            tom.add(new File("c.xml", 200));
            lucy.add(new File("d.csv", 800));

            rootDir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }

    }
}

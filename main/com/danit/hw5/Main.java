package com.danit.hw5;

public class Main {
    public static void main(String[] args) {
        String[][] s = {{"asd"}, {"asdasd"}};
        Human m = new Human("asd", "asd", 2, 2, s);
        Human f = new Human("s", "s", 1, 1, s);
        Family a = new Family(f, m);
        Human c = new Human("1", "s", 1, 1, s);
        Human c2 = new Human("2", "s", 1, 1, s);
        Human c3 = new Human("3", "s", 1, 1, s);
        a.addChild(c);
        a.addChild(c2);
        a.addChild(c3);
//        a.deleteChild(1);
        a.deleteChild(c2);
        System.out.println(a);

    }
}

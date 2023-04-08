package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List <String> ln = new LinkedList<>();
        ln.add("GO");
        ln.add("123E");
        ln.add("true");
        ln.add("G555");
        System.out.println("Первоначальный: " + ln);
        Collections.reverse(ln);
        System.out.println("\nРазвернутый: " + ln);
    }
}

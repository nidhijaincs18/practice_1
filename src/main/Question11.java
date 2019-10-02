package main;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch = s.next().charAt(0);

    }
}

class Ques11 {
    private String str;
    private char ch;

    public Ques11(String str, char ch) {
        this.str = str;
        this.ch = ch;
    }

    public String getStr() {
        return str;
    }

    public char getCh() {
        return ch;
    }
}
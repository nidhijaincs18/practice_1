package main;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
    }
}

class Ques3 {
    private String str;

    public Ques3(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String vowel() {
        String s = getStr();
        s = s.replaceAll("[AaEeIiOoUu]", "*");
        return s;
    }
}
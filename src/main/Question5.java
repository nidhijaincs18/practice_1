package main;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String substr = s.nextLine();
    }
}

class Ques5 {
    private String str;
    private String substr;

    public Ques5(String str, String substr) {
        this.str = str;
        this.substr = substr;
    }

    public String getStr() {
        return str;
    }

    public String getSubstrtr() {
        return substr;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setSubstr(String substr) {
        this.substr = substr;
    }
}
package main;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String substr = s.nextLine();
        Ques5 q = new Ques5(str, substr);
        System.out.println(q.subString());
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

    public String getSubstr() {
        return substr;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setSubstr(String substr) {
        this.substr = substr;
    }

    public String subString() {
        String s = getStr().toLowerCase();
        String st = "";
        for (int i = 0; i < getSubstr().length(); i++) {
            st += "-";
        }
        s = s.replaceAll(getSubstr().toLowerCase(), st);
        return s;
    }
}
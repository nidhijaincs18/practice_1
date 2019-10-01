package main;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Ques6 q = new Ques6(str);
        System.out.println(q.ucase());
    }
}

class Ques6 {
    private String str;

    public Ques6(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String ucase() {
        return getStr().toUpperCase();
    }

}
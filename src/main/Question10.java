package main;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch = s.next().charAt(0);
        Ques10 q = new Ques10(str, ch);
        System.out.println(q.index());
    }
}

class Ques10 {
    private char ch;
    private String str;

    public Ques10(String str, char ch) {
        this.ch = ch;
        this.str = str;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int index() {
        int index1 = getStr().indexOf(getCh());
        return index1;
    }


}
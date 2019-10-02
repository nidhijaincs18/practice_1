package main;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch = s.next().charAt(0);
        Ques11 q = new Ques11(str, ch);
        System.out.println(q.index());
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

    public void setStr(String str) {
        this.str = str;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public String index() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getStr().length(); i++) {
            if (getStr().charAt(i) == getCh()) {
                sb.append(i + "\n");
            }
        }
        return sb.toString();
    }
}
package main;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index = Integer.parseInt(s.nextLine());
        String str = s.nextLine();
    }
}

class Ques2 {
    private String str;
    private int index;

    public Ques2(String str, int index) {
        this.str = str;
        this.index = index;
    }

    public String getStr() {
        return str;
    }

    public int getIndex() {
        return index;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String subStr() {
        return getStr().substring(getIndex());
    }
}

package com.company;

public class Main {

    public static void main(String[] args)
    {

    }

    public String stringTimes(String str, int n)
    {
        int i = 0;
        String result = "";

        while (i < n)
        {
            i += 1;
            result += str;
        }

        return result;
    }

}

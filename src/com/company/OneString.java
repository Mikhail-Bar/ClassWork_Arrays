package com.company;

public class OneString {
    public static void main(String[] args) {
        /*
        int n = 1;
        for (int i = 0; i < 8; i++){
            String left = String.format("%d * %d = ", n, n);
            System.out.printf("%30s%d%n",left,  (long)n*n);
            n=(n *10)+1;
        }*/
        String c = "5";
        String s = "";
        for (int i=0; i < 18; i++){
            s+=c;

            String left = String.format("%s * %s = ", c, s);
            System.out.printf("%40s%d%n",left , (long)Long.parseLong(s)*5);

        }
    }
}

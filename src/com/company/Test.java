package com.company;

public class Test {
    public static void main(String[] args) {
int x =1, a = 1, sum = 0;
        while(x < 1000000) {
            if (x % a == 0) {
                sum += a;
            } a++;
            if (x == sum && x==a ) {System.out.println(x + " perferct");
                x++;
                sum = 0;
                a = 1;
            }
            if(x<=a){x++;a=1;sum=0;}
        }
    }
}

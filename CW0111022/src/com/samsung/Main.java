package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = 0;
        int sum = 0;
        while(n<100) {
            n++;
            if(n==71) continue;
            System.out.println(n);
        }
        /*do{
            System.out.println(n);
            n++;
        } while(n<100);*/

   /* while(n>=0) {
        n=sc.nextInt();
        k++;
    }
        System.out.println(k);
    } */
        int n;
        do {
            n = sc.nextInt();
            k++;
        } while (n >= 0);
        System.out.println(k);

        /*while(n%5!=0) {
            if(n>10) sum=sum+n;
            n=sc.nextInt();
        }
        System.out.println(sum);*/
    }
}

package com.samsung;

public class Main {
    public static void main(String[] args) {
        /*int m=9;
        for(int i=0; i<100; ++i) {
            System.out.println(i);
        }
        for(double i=0; i<100; i=i+0.5) {
            System.out.println(i);
        }
        for(; ; ) {
            m++;
            System.out.println(1);
            if(m>100) break;
        }*/
        /*int[] array=new int[100];
        array[9]=9;
        for(int i=0; i<10; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)Math.random()*100;
            System.out.print(array[i]+ " ");
        }

        int[] a, b;
        int a1[], b;*/
        int[] array=new int[10];
        double res=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i]+ " ");
            res=res+array[i];
        }
        res=res/array.length;
        System.out.print("\n" + res);
    }
}

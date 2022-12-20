package com.samsung;

//import com.samsung.Monstr;

public class Main {
    static class Test {
        static int a;

        public Test(int a) {
            this.a = a;
            //if (a == 0) System.out.println("Hello");
        }

 static {
            System.out.println("Hello");
 }

    }

    public static void main(String[] args) {
        Test.a = 0;
    }
}


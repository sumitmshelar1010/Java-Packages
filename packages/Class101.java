package MainPackage.packages;
//IMPORT CLASS201 FROM PACKAGE NAME "MainPackage.packages1" ==>> import MainPackage.packages1.*;
// By importing whole package we can access all classes and interfaces in that class except subclass

import MainPackage.packages1.*;
import MainPackage.packages1.Class301;

public class Class101 {
    public void m1(){
        int a =10;
        System.out.println(a);
    }


    public static void main(String[] args) {
        Class101 c1 = new Class101();
        c1.m1();
        Class201 c2 = new Class201();
        c2.m4();
        Class301 c3 = new Class301();
        c3.m3();

    }
}

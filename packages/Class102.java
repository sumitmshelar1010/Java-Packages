package MainPackage.packages;
// BY IMPORTING SPECIFIC CLASS FROM ANOTHER PACKAGE, WE CAN GET ACCESS OF THAT PARTICULAR CLASS ONLY

import MainPackage.packages1.Class201; // we can access that class only
public class Class102 {
    public void m4(){
        int d =40;
        System.out.println(d);
    }

    public static void main(String[] args) {
        Class102 c4=new Class102();
        c4.m4();
        Class201 c5 =new Class201();
        c5.m4();
    }
}

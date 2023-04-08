package MainPackage.packages;

// WE WANT TO IMPORT CLASS 301 FROM "MainPackage.packages1" BUT WE HAVE SIMILAR NAMES OF CLASSES
// IN THAT SITUATION WE HAVE TO USE "FULLY QUALIFIED NAME"

public class Class301 {
    public void m3(){
        int g =500;
        System.out.println(g);
    }

    public static void main(String[] args) {
        Class301 c6 =  new Class301();
        c6.m3();
        MainPackage.packages1.Class301 c7 = new MainPackage.packages1.Class301();// FULLY QUALIFIED NAME
        c7.m3();
    }
    }


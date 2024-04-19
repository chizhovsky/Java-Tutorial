package packages;

import newpackage.TheNewPackage;

public class Packages {
    public static void main(String[] args) {
        TheSamePackage theSamePackage = new TheSamePackage();
        TheNewPackage theNewPackage = new TheNewPackage();
        System.out.println(theSamePackage);
        System.out.println(theNewPackage);
    }
}

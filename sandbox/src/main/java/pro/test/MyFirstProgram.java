package pro.test;

import java.security.cert.CertPathValidatorException;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("John");
        hello("Bob");
        hello("Lucy");
        hello("Ben");
          // Object//
        Square s = new Square(5);

        System.out.println("Distance of the square side " + s.l + " = " + s.area());
         // object //
        Rectangle r = new Rectangle(4, 6);

        System.out.println("Distance of the Rectangle with side " + r.a + " and " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }


}
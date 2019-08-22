package pro.test;

import java.security.cert.CertPathValidatorException;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("John");
        hello("Bob");
        hello("Lucy");
        hello("Ben");

        Square s = new Square();
        s.l = 5;
        System.out.println("Distance of the square side " + s.l + " = " + area(s));

        Rectangle r = new Rectangle();
        r.a = 4;
        r.b = 6;
        System.out.println("Distance of the Rectangle with side " + r.a + " and " + r.b + " = " + area(r));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area(Square s) {
        return s.l * s.l;
    }
    public static double area(Rectangle r) {
        return r.a * r.b;
    }

}
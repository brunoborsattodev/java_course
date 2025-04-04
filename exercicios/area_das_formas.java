package exercicios;

import java.util.Scanner;

public class area_das_formas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTri, areaCircle, areaTrap, areaQuad, areaRet;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTri = A * C / 2;
        areaCircle =  3.14159 * Math.pow(C, 2);
        areaTrap = (A + B) * C / 2;
        areaQuad = Math.pow(B , 2);
        areaRet = A * B;


        System.out.println("TRIANGULO: " + areaTri);
        System.out.println("CIRCULO: " + areaCircle);
        System.out.println("TRAPEZIO: " + areaTrap);
        System.out.println("QUADRADO: " + areaQuad);
        System.out.println("RETÂNGULO: " + areaRet);


        sc.close();
    }
}

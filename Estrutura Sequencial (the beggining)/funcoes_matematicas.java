package com.mycompany.projeto_teste;
//usando Netbeans no lab da UFRN 
import java.util.Scanner;

public class Projeto_teste {
    public static void main(String[] args) {
        double x, y, z;
        double A, B, C;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("valor de x: ");
        x = sc.nextDouble();
        
        System.out.println("valor de y: ");
        y = sc.nextDouble();
        
        System.out.println("valor de z: ");
        z = sc.nextDouble();
        
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        
        System.out.printf("Raiz quadrada de %f = %.2f\n", x, A);
        System.out.printf("Raiz quadrada de %f = %.2f\n", y, B);
        System.out.println("Raiz quadrada de " + z + " = " + C);
        
        A = Math.pow(x, y);
        B = Math.pow(y, 2.0);
        C = Math.pow(z, 2.0);
        
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(y + " elevado ao quadrado = " + B);
        System.out.println(z + " elevado ao quadrado = " + C);
        
        A = Math.abs(y);
        B = Math.abs(z);
        
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
        sc.close();
    }
}

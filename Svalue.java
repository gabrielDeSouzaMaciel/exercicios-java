/*Escreva um programa que leia um valor inteiro e positivo N e imprima o valor de S. Considere
que: S = 1 + 1/(1!) + 1/(2!) + 1/(3!) + 1 /(N!) */

import java.util.Scanner;
public class Svalue{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int N;
        System.out.println("N: ");
        N = ler.nextInt();
        int N2;

        int temp = N;
        N = N2;
        N2 = temp;


        int i = 1;


        double S = 0;

        for (int i = 0; i < N; i++){
            while (i > 0){
            i *= N2;
            N2 = N2 - 1;
            S += 1/i;
        }
        }
    }
}
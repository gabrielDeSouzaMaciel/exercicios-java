/*

Faça um programa para calcular a média aritmética de duas
notas. Também calcule e apresente a nota ponderada,
considerando peso 2 e 3, respectivamente

*/

public class Media {
    public static void main (String[] args){
        double a = 7, b = 9;
        double mAri = (a+b)/2;
        double mPon = ((a*2)+(b*3))/5;
        System.out.println("Media Aritmetica: "+mAri);
        System.out.println("Media Ponderada: "+mPon);
    }
}

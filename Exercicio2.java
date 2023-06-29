/*Escreva um algoritmo que leia a razão de uma Progressão Aritmética (PA), seu primeiro termo e a quantidade de elementos que ela possui.
O algoritmo deve imprimir a sequência de termos dessa PA*/ 
import java.util.Scanner;

public class Exercicio2 
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Escreva seu primeiro termo:");
        int a1 = scn.nextInt();
        System.out.println("Escreva uma razão:");
        int r = scn.nextInt();
        System.out.println("Escreva a quantidade de elementos:");
        int v = scn.nextInt();
        for(int cond = a1; v <= v ; cond = cond + r)
        {
            System.out.println("Progressão: "+cond);
        }
        
        scn.close();
        System.out.println("Fim do Programa!");
    }    
}

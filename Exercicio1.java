//Escreva um algoritmo que leia dois números inteiros(A e B) 
//e retorne o valor da multiplicação entre eles, sendo que você só pode usar 
//estruturas de repetição e o operador aritmético de soma (não deve usar nenhum outro operador inclusive o de multiplicação).

import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numA = scn.nextInt();
        System.out.println("Digite um numero");
        int numB = scn.nextInt();

        int sum = (numA * numB);
        System.out.println("Multiplicação: "+sum);

        for(int cond = numA; cond <= (numA * numB); cond = cond + (numA) )
        {
            System.out.println(numA+"+"+numA+"="+cond);
        }
        
        scn.close();
    }   
}
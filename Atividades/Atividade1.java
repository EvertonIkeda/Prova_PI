package Atividades;

import java.util.Scanner;

public class Atividade1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior=0, menor=0;
        int num[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um valor: ");
            num[i] = sc.nextInt();
        }
        
        maior = num[0];
        menor = num[0];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (num[j] > maior) {
                    maior = num[i];
                }
                if (num[j] < menor) {
                    menor = num[i];
                }
            }
        }
        
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}
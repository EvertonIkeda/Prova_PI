package Atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massa;
        int tempo=0;
        int horas[] = new int[3];
        
        System.out.println("Informe a massa inicial do material em gramas: ");
        massa = sc.nextDouble();
        
        System.out.println("A massa inicial é " + massa + "g.");
        
        while (massa >= 0.5) {
            tempo = tempo + 50;
            massa = massa / 2;
        }
        
        horas[0] = tempo / 3600;
        horas[1] = (tempo - (horas[0] * 3600))/60;
        horas[2] = tempo - (horas[0] * 3600) - (horas[1] * 60);
        
        System.out.println("A massa final é " + massa + "g.");
        System.out.println("O tempo necessário para alcançar uma massa inferior a 0,5 gramas é de " + horas[0] + "h " + horas[1] + "m " + horas[2] + "s.");
    }
}
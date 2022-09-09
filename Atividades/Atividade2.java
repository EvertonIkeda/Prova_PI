package Atividades;

public class Atividade2 {
    public static void main(String[] args) {
    	
        double salario=1000, aumento=0.015;
        double salario_ano[] = new double[26];
        
        salario = salario * (aumento + 1);
        
        for (int i = 1997; i < 2023; i++) {
            aumento = aumento * 2;
            salario = salario * (aumento + 1);
            salario_ano[i-1997] = salario;
        }
        
        System.out.printf("O salário do funcionário em 2022 é R$%.2f", salario_ano[25]);
    }
}
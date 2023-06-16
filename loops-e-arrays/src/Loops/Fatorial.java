package Loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int numero;
        
        System.out.println("Digite o número para calcular o fatorial: ");
        numero = scan.nextInt();

        for(fatorial = 1 ; numero >= 1 ; numero--){
            fatorial = fatorial * numero;

        }
        System.out.println("O fatorial do número é " + fatorial);
    }
}

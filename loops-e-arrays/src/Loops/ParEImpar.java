package Loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int repeticao = 0;
        int numero;
        int impares = 0, pares = 0;
        
        System.out.println("Digite a quantidade de números que serão digitados: ");
        contador = scan.nextInt();

        do{
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            repeticao++;

            if (numero % 2 == 0 ) impares++;
            else pares++;
            
        } while (repeticao<contador);

            System.out.println("A quantidade de números pares digitados é: " + pares);
            System.out.println("A quantidade de números impares digitados é: " + impares);

    }
}

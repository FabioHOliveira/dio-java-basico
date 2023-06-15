package Loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;
        int i = 0;

        while(i < 5){
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            i++;
            media += numero;
            if (numero > maior) maior = numero;
        } 
        
        media = media / i;

        System.out.println("O maior numero e: " + maior); 
        System.out.println("A media e: " + media);     

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconvert;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author groov
 */
public class DecimalBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        try {

            System.out.print("Digite um número: ");
            numero = entrada.nextInt();

            while (numero < 0) {

            }

            System.out.println(numero + " Em binário é: " + decimalBinario(numero));

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String decimalBinario(int numero) {
        Stack Pilha = new Stack();
        String numBinario = " ";
        int resto;
        while (numero < 0) {
            System.out.println("Erro! valor negativo, digite um valor positivo.");
            break;
        }
        while (numero > 0) {

            resto = numero % 2;
            Pilha.push(resto);
            numero /= 2;

        }
        while (!Pilha.isEmpty()) {
            numBinario += Pilha.pop();

        }
        return numBinario;
    }

}

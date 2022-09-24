
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Lista8ATV1 {
    
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
       
        int matriz[][] = new int[4][4];
        int maior10 = 0;

        for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
           System.out.print("Insira a posição [" + i + "][" + j + "]: ");
               matriz[i][j] = teclado.nextInt();
               if (matriz[i][j] > 10) {
                   maior10 += 1;

               }

           }

        }
       System.out.println("A matriz possui " + maior10 + " valores maiores do que Dez.");

   }

}
    

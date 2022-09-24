/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Lista8ATV3 {
    
     public static void main(String[] args) {
       int[][] array = new int[4][4];
         for (int i=0;i<4;i++){
           for (int j=0;j<4;j++){
                   
                   array[i][j]=i*j;
               }
           }
           for (int x=0;x<4;x++){
           for (int y=0;y<4;y++){
                   System.out.print("\t"+array[x][y]);
               }
           }  
   }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Lenovo X1
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Semana_2_clase {

    public Semana_2_clase() {
    }
   
    Scanner sc = new Scanner(System.in);
    
    public void quiz2 (int n){
        for (int i = 1; i <= n ; i++) {
            
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" "); 
            }
        
            for (int k = 1; k <=(2*i-1); k++) {
                System.out.print("*"); 
            }
             
            System.out.println("");
        }
        
    System.out.print(" ");
    }
   
    
    public void ejercicioA(int n){
        
        for(int i = 12; i > n; i--){
            for(int j = i; j > n; j--){
                System.out.print("*");
            }
            System.out.println("");
            }
    }
        
        /**
           for (int i = 12; i >= n ; i--) {
            
            for (int j = 12; j > n; j--) {
                System.out.print(" "); 
            }
        
            for (int k = 12; k <=(2*i); k++) {
                System.out.print("*"); 
            }
             
            System.out.println("");
        } */
    
        
    
  
       public void ejercicioB(int n){   
   
 
    for (int i = 1; i <= n; i++) {             
        for (int j = 1; j <= n; j++) {        
            
            if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("* ");
            } else {
                System.out.print("  ");        
            }
        }
        System.out.println();                
    }
}
    
    public int random(){
    
    return (int)(Math.random()*1000)+1;
    }
    
      
      public void ejercicioC(int n){
         
         
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int k = 0; k < n - i; k++) System.out.print("*");
            System.out.println();
        }
    }
     
       public void ejercicioD(){  
       
       int [] numeros = new int [10];
        Scanner sc = new Scanner(System.in);
           for (int i = 0; i < numeros.length; i++) {
               System.out.println("Digite un numero al azar.");
           numeros [i] = sc.nextInt();  
              
               
           
           } System.out.println("Arreglo desordenado");
               for (int j = 0; j < numeros.length ; j++) {
               System.out.print(numeros[j] + ",");
               }
             System.out.println();
             Arrays.sort(numeros);
             System.out.println ("Arreglo ordenado");
             for (int i = 0; i < numeros.length; i++) {
               System.out.print (numeros[i] + ","+"\n"); 
           }
       }
      
        public void ejercicioE(){
           
            int [] numeros = new int [100];
            Random random = new Random ();
            
            for (int i = 0; i < numeros.length; i++) {
                numeros[i]= random();
              
            }
           
              
            Arrays.sort(numeros);
           
            for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
       
            
            
            }      
                }
        
         public void tablero() {
              char[][] tablero = new char[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                tablero[i][j] = ' ';

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) tablero[i][j] = 'N';

        for (int i = 5; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) tablero[i][j] = 'R';

        System.out.println("\nTablero");
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print((char)('A'+i) + " ");
            for (int j = 0; j < 8; j++) System.out.print(tablero[i][j] + " ");
            System.out.println();

             
         
         
        }    
          
         }
         
       public void quiz3(){
         for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 9; j++) {
               
                if (i == 0 || i == 4 || j == 0 || j == 8 || (i == 2 && j == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
       }  

} 
       
      
      
      
       
      //Arreglos
      //int [] numeros= new int  [10]; asi se declara un arreglo.
      // numeros [0] = "  "; Esto es por asi decirlo el predeterminado de un arreglo. 
         //Scanner sc = new Scanner (System.in); para poder hacer que se agreguen cualquier numero.
      
  
    
 




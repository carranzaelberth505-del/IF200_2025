/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Lenovo X1
 */
import java.util.Scanner;
public class practexam {

    public practexam() {
    }
    
    public void practexam48(){
        Scanner sc=new Scanner(System.in); 
        String fecha;
        System.out.println("Ingrese la fecha de hoooy");
        fecha =sc.nextLine();
        
        String dia = fecha.substring(0,2);
        String mes= fecha.substring(3,5);
        String año=fecha.substring(4,10);
        
        int numdia=Integer.parseInt(dia);
        numdia ++;
        System.out.println("el dia del otrooo dia es:" +numdia);
                
               
        
    }

    public void ejem(){
       double num1=0;
       double num=0;
       
     double max= Math.max(3, 4);
     double min= Math.min(3, 4);
      double product = Math.pow(4, 7);
         System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Multiplicacion exacta: " + product);
      
    }

}

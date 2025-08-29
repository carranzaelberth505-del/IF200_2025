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
import java.util.List;
import java.util.ArrayList;



public class Lab1 {

    
    

    public Lab1() {
    }
    
    
    
     public void Ejercicio1(){
      Scanner sc = new Scanner(System.in); 
      int num1 = 0;
      System.out.println("Digite el numero: ");
        num1 = sc.nextInt();
      
      if (num1%2 ==0 ){
      System.out.println("El numero ingresado es par: ");
      }
      else{
      System.out.println("El numero ingresado es impar: ");
      }

}
    public void Ejercicio2(){
        Scanner sc = new Scanner(System.in); 
        int numab = 0;
        System.out.println("Digite el numero: ");
        numab = sc.nextInt();
        if (numab < 0){
            numab = -numab;
        } else {
            numab = numab;
  }
  System.out.println("El valor absoluto es: " + numab);
  
  }
    
     public void ejercicio3(){
         int  suma=0;
         int num=3;
         
         while (num<=99){
             System.out.println(" " + num);
             suma = suma+num;
             num=num +3;
           
         }
      System.out.println("La suma del numero es:"+suma);
     }
    
   public void ejercicio4(){ 
      System.out.println("");
       int [] numeros = new int [3];
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
       
    
     
  public void Ejercicio5(){
      Scanner sc = new Scanner(System.in);
      
      int num1 = 0;
      int num2 = 0;
      int result = 0;
      
      System.out.println("Digite el primer numero: ");
      num1=sc.nextInt();
      
      System.out.println("Digite el segundo numero: ");
      num2=sc.nextInt();
      
      if (num1 == num2){
      
      result = num1*num2;
      
      System.out.println("El resultado de la multiplicacion es: " + result);
      }
      else if (num1 > num2){
              
      result = num1 - num2;
      
      System.out.println("El resultado de la resta es: " + result);
              
              }
      else{
      
      result = num2 + num1;
              
       System.out.println("El resultado de la suma es: " + result);
      }
  
  } 
  
  

    public  void Ejercicio6(){
    Scanner sc = new Scanner(System.in);
    boolean huboDiez = false;
    int nota;

    do {
        System.out.print("Ingrese una nota (0 a 10) o -1 para terminar: ");
        nota = sc.nextInt();

        if (nota == 10) {
            huboDiez = true;
        }

    } while (nota != -1);

    if (huboDiez) {
        System.out.println("Sí hubo una nota con valor 10.");
    } else {
        System.out.println("No hubo ninguna nota con valor 10.");
    }

    sc.close();
}
    
    public void ejercicio7_Pulsaciones(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su sexo (F/M)");
        String sexo = sc.nextLine(); 
        
        System.out.println("Ingrese su edad (años)");
        double edad = sc.nextInt();
         sc.nextLine();
        double pulsaciones; 
        
        if (sexo.equalsIgnoreCase("F")) {
            
            
            pulsaciones = (220 - edad)/10;
        } else {
            pulsaciones = (210 - edad)/10;
        }
        
        System.out.println("El numero de pulsaciones es de: " + pulsaciones);
    }
    
    public void Ejercicio8() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el salario mensual: ");
    double salario = sc.nextDouble();

    System.out.print("Ingrese los años de antigüedad: ");
    int antiguedad = sc.nextInt();

    double utilidad;

    if (antiguedad < 1) {
        utilidad = salario * 0.05;
    } else if (antiguedad >= 1 && antiguedad < 2) {
        utilidad = salario * 0.07;
    } else if (antiguedad >= 2 && antiguedad < 5) {
        utilidad = salario * 0.10;
    } else if (antiguedad >= 5 && antiguedad < 10) {
        utilidad = salario * 0.15;
    } else {
        utilidad = salario * 0.20;
    }

    System.out.println("La utilidad a recibir es: " + utilidad);
    sc.close();
}
    
    public void ejercicio9(){
     Scanner sc = new Scanner(System.in);
     int suma = 0;
     System.out.println("Dame el numero papi: ");
     int numero= sc.nextInt();
     
         for (int i = 1; i <= numero; i++) {
             int auxiliar = numero%i;
             if (auxiliar==0){
                 suma = suma + 1;
                 
             }
            
             
         }
        
     
        if(suma==2){
        System.out.println("El numero si es primo papi");
        } 
        
        else{
            System.out.println("El numero NO es primo papi");
          
        }
         
     }

    public void Ejercicio10() {
    Scanner sc = new Scanner(System.in);

    final double precioUnitario = 11000;
    System.out.print("Ingrese la cantidad de computadoras a comprar: ");
    int cantidad = sc.nextInt();

    double precioTotal = cantidad * precioUnitario;
    double descuento;

    if (cantidad < 5) {
        descuento = precioTotal * 0.10;
    } else if (cantidad >= 5 && cantidad < 10) {
        descuento = precioTotal * 0.20;
    } else {
        descuento = precioTotal * 0.40;
    }

    double totalPagar = precioTotal - descuento;

    System.out.println("Cantidad de computadoras: " + cantidad);
    System.out.println("Precio total sin descuento: $" + precioTotal);
    System.out.println("Monto descontado: $" + descuento);
    System.out.println("Monto total a pagar: $" + totalPagar);

    sc.close();
}


    
     public void ejercicio11_generarPrimos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número (>= 2)");
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("No hay numeros primos que sean menores que 2");
        }
        
        //generar un lista con List
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
                
            }
            if (esPrimo) primos.add(i); 
        
        }
       
        System.out.println("Numeros primos entre 2 y"+ n +"son:"+primos);
        
   }
    
    
   public void ejercicio12(){
       Scanner sc = new Scanner(System.in);
       int base,altura,area;
       
       System.out.println("ingrese la base guapo");
       base = sc.nextInt();
       
       System.out.println("ingrese la altura princesa xd");
       altura = sc.nextInt();
       
       area= (base*altura)/2;
       
       System.out.println("El valor del area es: " + area);
   } 
  
  
   
   
}

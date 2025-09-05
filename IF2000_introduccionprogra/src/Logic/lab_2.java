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
public class lab_2 {
    public lab_2(){
        
    }
     Scanner sc = new Scanner(System.in);
    public void ejercicio13(){
        int suma=0;
        for (int i = 2; i <= 1000; i++) {
            suma+=i; 
        
        }
      
        System.out.println("  La suma de los numeros impares de 2 a 1000 es: " + suma);
    
    }
    
    public void ejercicio_14(){
        
        int gradosCelsius = 0;
        int gradosFaren = 0;
        
        System.out.println("Ingrese la temperatura en grados celsius: ");
        gradosCelsius = sc.nextInt();
        
        gradosFaren = 9 / 5 * (gradosCelsius + 32);
        
        System.out.println("La temperatura en grados Fahrenheit es de: " + gradosFaren); 
    
    }
    
    public void ejercicio15(int x, int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * x;
        }
        System.out.println("La potencia de " + x + " elevado a " + n + " es: " + resultado);

    }
    
    public void ejercicio16(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero 1 al 12: ");
        int numero = sc.nextInt();
        
        String mes;
        switch (numero){
        case 1: mes = "Enero"; break; 
        case 2: mes = "Febrero"; break; 
        case 3: mes = "Marzo"; break; 
        case 4: mes = "Abril"; break; 
        case 5: mes = "Mayo"; break; 
        case 6: mes = "Junio"; break; 
        case 7: mes = "Julio"; break; 
        case 8: mes = "Agosto"; break; 
        case 9: mes = "Septiembre"; break; 
        case 10: mes = "Octubre"; break; 
        case 11: mes = "Noviembre"; break; 
        case 12: mes = "Diciembre"; break; 
        
        default: mes = ("Número invalido. Debe ser del 1 al 12.");
    }
        System.out.println("El mes de ese numero es: " + mes);
        
        
    }
    
    public void ejercicio17(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero (x): ");
        int x = sc.nextInt();

        double resultado;
//inicia la oeperacion de F(x)
        if (x > 0) {
            resultado = x + 5;
        } else if (x < 0) {
            resultado = x * x; // x^2, en java en ves de x^2, se utiliza x * x, de esa manera se puede realizar la operacion.
        } else {
            resultado = 1;
        }

        System.out.println("El resultado de F(x) es: " + resultado);
    
    }
    
    public void ejercicio18(){
        double ladoA = 0;
        double ladoB = 0;
        double baseC = 0;
        double perimetro = 0;
        double area = 0;
        
        System.out.println("Ingrese la medida del lado izquierdo: ");
        ladoA = sc.nextDouble();
        
        System.out.println("Ingrese la medida del lado derecho: ");
        ladoB = sc.nextDouble();
        
        System.out.println("Iingrese la medida de la base: ");
        baseC = sc.nextDouble();
        
        perimetro = (ladoA + ladoB + baseC) / 2;
        
        area = Math.sqrt(perimetro * ( perimetro - ladoA) * ( perimetro - ladoB) * ( perimetro - baseC));
        
        //System.out.println("El perimetro es de: " + perimetro);
        System.out.println("El area es de: " + area);
        }
    
    
    
    public void ejercicio19(){
     Scanner sc = new Scanner(System.in);
        
        System.out.println(" Ingrese el valor de A (un numero)");
        int A = sc.nextInt();
        
        System.out.println("Ingrese el valor de B (un numero)");
        int B = sc.nextInt(); 
        System.out.println("Antes del intercambio el valor de A es: "+ A + " Y el valor de B es: "+ B);
               
        //Con la variable TEMP se realiza el intercambio de valores.
        int TEMP;
        TEMP = A;
                A = B;
                B = TEMP;
        System.out.println("Ahora, los valores de A y B intercamciados son: ");
        System.out.println("El valor de A, ahora es: "+ A +" Y el valor B, ahora es: "+ B);
    }
    
        public void Ejercicio_20() {
        long suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += (long) i * i;
        }
        System.out.println("La suma de los cuadrados de los 100 primeros números naturales es: " + suma);
    }
    
    public int sumaCuadradosHasta(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        } return suma;
    

    }
    
    public void ejercicio21(){
        int K=0;
        int suma=0;
        System.out.println("ingrese el valor de K");
         K= sc.nextInt();
         
         for (int i = 1; i < K; i++) {
            suma+=i;
        }
      System.out.println("La suma de los numeros inferiores a " + K + " es:" + suma);
    }
    
    public void ejercicio22(){
          Scanner sc = new Scanner(System.in);
         int num = 1;
         int suma = 0;
         double promedio = 0;
         double contador = 0;
    
        while(num !=0){
            System.out.println("22) Ingrese un numero positivo o ingrese 0 para detener el ciclo" );
            num = sc.nextInt();
            if(num > 0){
            suma+= num;
            contador += 1;
            }
        }
        if(contador != 0){
        promedio = (double) suma / contador;
        System.out.print("El promedio de todos los numeros es de: " + promedio);
        } 
    }
  
    
   public void ejercicio23(){
      int numeros = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int contNumeros = 0;
        int sumaTotal = 0;
        
        while (contNumeros < 10){
        System.out.print("Ingrese un numero: " );
        numeros = sc.nextInt();
        contNumeros += 1;
        
        if(numeros % 2 == 0){
        sumaPares += numeros;
        contadorPares += 1;
        } else{
        sumaImpares += numeros;
        contadorImpares += 1;
        }
        
        }
        sumaTotal = sumaPares + sumaImpares ;
        System.out.println("De los 10 numeros " + contadorPares + " son pares.");
        System.out.println("La suma de estos es de: " +sumaPares);
        
        System.out.println("De los 10 numeros " + contadorImpares + " son impares");
        System.out.println("La suma de los numeros impares es de: " +sumaImpares);
        System.out.println("La suma total es de: " + sumaTotal);
    
    }



    
    public void ejercicio24(){
      int par=0;
      int impar=0;
        for (int i = 1; i <= 200; i++) {
         if(i%2==0){
             par+=i;
         } 
        
         else{
          impar+=i;
         }
          
        
        }
    System.out.println("La suma de los numeros pares de 1 a 200 es: " + par);
    System.out.println("La suma de los impares de 1 a 200 es: " + impar);
    }
   
    public void ejercicio25(){
    int num = 0;
    int valorCuadrado = 0;
    int sumaCuadrados = 0;
    
        for (num = 1; num <= 100; num++) {
            valorCuadrado = num * num;
            sumaCuadrados += valorCuadrado;
        }
        
        System.out.println("La suma de los cuadrados de los numeros naturales hasta el 100 es de: " + sumaCuadrados);
    

    }   
    
    public void ejercicio_26(){
        
        int num = 0;
        int resultFact = 1;
                
        System.out.print("Ingrese el numero a factorizar: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            resultFact *= i;
        }
        
        System.out.println("El resultado es" + resultFact);
    }

    
    
    public void ejercicio27(){
     int num=0;
     int menor= 0;
     int mayor= 0;
     
        System.out.println("Ingresa el numero:");
        num = sc.nextInt();
        menor = num;
        mayor = num;
    
        for (int i = 0; i < 10; i++) {
            System.out.println("ingresa el numero");
            num = sc.nextInt();
            
         if (num>mayor){
            mayor=num;
         } if(num<menor){
            menor=num;
         }
       
        }
     
       System.out.println("El numero mayor es: " + mayor);
       System.out.println("El numero menor es: " + menor);
    } 


}

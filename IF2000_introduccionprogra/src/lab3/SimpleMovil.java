/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Lenovo X1
 */
public class SimpleMovil {
  // Sinpe.java

 
    
    // Método muy básico para transferir dinero de una cuenta a otra
    public void transfer(Acount from, Acount to, double amount) {
        
        // Verifica que el monto sea positivo
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return;
        }

        // Revisa que la cuenta de origen tenga suficiente dinero
        if (from.getBalance() < amount) {
            System.out.println("Not enough balance in origin account.");
            return;
        }

        // Hace el retiro y el depósito
        from.whitdraw(amount);
        to.deposit(amount);

        // Mensaje de confirmación
        System.out.println("Transfer of " + amount + 
                           " from " + from.getPhone() + 
                           " to " + to.getPhone() + " completed.");
    }
}
  


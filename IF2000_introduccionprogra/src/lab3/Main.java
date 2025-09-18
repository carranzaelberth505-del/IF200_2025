
package lab3;

/**
 *
 * @author Lenovo X1
 */ 
 import lab3.*;
import java.time.LocalDate;
 import java.time.LocalDate;
public class Main {
  

    public static void main(String[] args) {
 


  

        // === Create clients ===
        Client client1 = new Client("101", "Alice", "8888-8888", "San José");
        Client client2 = new Client("102", "Bob",   "9999-9999", "Heredia");

        // === Create banks ===
        Bank bankA = new Bank("Banco Nacional");
        Bank bankB = new Bank("Banco de Costa Rica");

        // === Create accounts ===
        SavingAccaunt savings1 = new SavingAccaunt(
                LocalDate.now().toString(), 
                12,                         
                03,                        
                "SA-001",                   
                2000,                       
                client1);

        CheckingAccount check1 = new CheckingAccount("","CA-001",800,client2
        );

        // Register accounts in their banks
        bankA.addAccount(savings1);
        bankB.addAccount(check1);

        // === Create log book to track movements ===
        LogBook log = new LogBook();

        // Deposit into savings
        savings1.deposit(500);
        log.addEvent("Deposit to savings", savings1);

        // Apply interest to savings
        savings1.calculateInterest();
        log.addEvent("Monthly interest applied", savings1);

        // Transfer money via SINPE from savings1 to checking1
        Bank.sinpe(savings1, check1, 700, bankA, bankB);
        log.addEvent("SINPE Transfer From Savings", savings1);
        log.addEvent("SINPE Transfer To Checking", check1);

        // Show final balances
        System.out.println("\n--- FINAL BALANCES ---");
        System.out.println(savings1);
        System.out.println(check1);

        // Show all logged events
        System.out.println("\n--- LOG BOOK ---");
        log,showEvents();
    }
}


    
 





    


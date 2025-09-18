/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Lenovo X1
 */import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Acount> accounts;   // lista de cuentas de este banco

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>(); // inicialización correcta
    }

    public String getName() {
        return name;
    }

    public void addAccount(Acount account) {
        accounts.add(account);
    }

    public boolean hasAccount(Acount account) {
        return accounts.contains(account);
    }

    /**
     * Transferencia SINPE muy simple entre dos bancos
     */
    public static void sinpe(Acount from, Acount to,
                             double amount, Bank bankFrom, Bank bankTo) {
        if (bankFrom.hasAccount(from) && bankTo.hasAccount(to)) {
            if (from.getBalance() >= amount) {
                from.whitdraw(amount);  // usa el método con tu nombre actual
                to.deposit(amount);
                System.out.println("SINPE Transfer completed: " + amount);
            } else {
                System.out.println("Insufficient funds for transfer");
            }
        } else {
            System.out.println("Invalid accounts for transfer");
        }
    }
}

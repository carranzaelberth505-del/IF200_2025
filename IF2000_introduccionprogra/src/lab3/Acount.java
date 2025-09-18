/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Lenovo X1
 */
public   abstract class Acount {

    
    private String AcountNumbe;
    private double balance;
    private Person client;

    public Acount() {
    }
    
    public Acount(String AcountNumbe,double balance,Person client) {
        this.AcountNumbe= AcountNumbe;
        this.balance=balance;
        this.client=client;  
    }

    public String getAcountNumbe() {
        return AcountNumbe;
    }

    public void setAcountNumbe(String AcountNumbe) {
        this.AcountNumbe = AcountNumbe;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }
   public abstract void deposit(double amount);
   public abstract void whitdraw(double amount);
   public abstract double interesCalculation();
   
   public String toString(){
       String result="\nBANK ACCOUNT INFORMATION:" 
       +"\n------------------------------------------"
       + "\nAccount number :" + this.getAcountNumbe()
       + "\nBalance:" +  this.getBalance()  
       + "\nAccount owner" + this.getClient().toString();
        return result;       
   }

    void setBank(Bank aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getBank() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getPhone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
} 


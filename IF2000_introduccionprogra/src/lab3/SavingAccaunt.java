/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Lenovo X1
 */
public class SavingAccaunt extends Acount{
    
   private String initialeDay;
   private int month;
   private float interest;

    public SavingAccaunt(String initialeDay, int month, float interest) {
        this.initialeDay = initialeDay;
        this.month = month;
        this.interest = interest;
    }

    public SavingAccaunt(String initialeDay, int month, float interest, String AcountNumbe, double balance, Person client) {
        super(AcountNumbe, balance, client);
        this.initialeDay = initialeDay;
        this.month = month;
        this.interest = interest;
    }

    public String getInitialeDay() {
        return initialeDay;
    }

    public void setInitialeDay(String initialeDay) {
        this.initialeDay = initialeDay;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

   
   
   @Override
    public void deposit(double amount) {
       super.setBalance(this.getBalance()+ amount);
    }

    @Override
    public void whitdraw(double amount) {
      if(amount<=this.getBalance())
        super.setBalance(this.getBalance()-amount);
      else System.out.println("Sorry you dont have money poor");
    }

    @Override
    public double interesCalculation() {
       double total;
       total=this.getMonth()*super.getBalance()*this.getInterest();
        super.setBalance(super.getBalance() + total);
       return 0;
    
    }

    @Override
    public String toString() {
String result = "\nAccount Type: SAVING ACCOUNT"
  + "\n------------------------------"
  + "\n Initial date of account: " + this.getInitialeDay()+ "\n Months of saving: " + this.getMonth() +"\n Interest: " + this.getInterest() + "\n Gained Interest: " + (this.getMonth()
     *super.getBalance()/100 + this.getInterest() )
        +"\n Balance after interest:" + this.getBalance() + (this.getMonth() * 
        super.getBalance()/100);
   return super.toString()+result;
    }
   
    
}


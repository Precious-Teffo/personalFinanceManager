/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HC
 */
public class Expense {
   private String name;
    private double amount;
    private String category;
    
    public Expense(String name, double amount){
        this.name=name;
        this.amount=amount;
        this.category=category;
        
   }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    } 
    public static void main(String[] args){
        Expense expense=new Expense("Rent",1500.0);
        
        System.out.println("Expense Name:" + expense.getExpenseName());
        System.out.println("Expense Amount:" +expense.getExpenseAmount());
    }

    private String getExpenseName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getExpenseAmount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

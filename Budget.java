/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HC
 */
public class Budget {
    
    private String name;
    private double amount;
    private String category;
    
    public Budget(double amount){
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
        Budget budget=new Budget(1000.0);
        
        
        
        System.out.println("Budget Amount:" + budget.getBudgetAmount());
    }

    private String getBudgetAmount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

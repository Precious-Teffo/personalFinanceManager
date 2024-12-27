/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HC
 */
public class Investment {
    private String name;
    private double amount;
    private String type;
    private int getInvestmentReturn;
    
    public Investment(String name, int amount){
        this.name=name;
        this.amount=amount;
        this.type=type;
        
   }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return type;
    }
    public static void main(String[] args){
        Investment investment=new Investment("Stocks",10000);
        
        System.out.println("Investment Name:" +investment.getInvestmentName());
        System.out.println("Investment Amount" + investment.getInvestmentAmount());
        System.out.println("Investment return" +investment.getInvestmentReturn*100 +"%");
    }

    private String getInvestmentName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getInvestmentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

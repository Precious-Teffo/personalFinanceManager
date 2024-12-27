
import java.awt.Frame;
import javax.swing.JFrame;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HC
 */
public class Reporting {
    public static void main(String[] args){
        //Create a pie chart
        DefaultPieDataset dataset=new  DefaultPieDataset();
        
        dataset.setValue("Expenses",60);
        dataset.setValue("Investment",20);
        dataset.setValue("Savings",20);
        
       JFreeChart chart= ChartFactory.createPieChart("Financial Allocation",dataset,true,true,false);
       
       //Display the chart
       ChartPanel chartPanel=new  ChartPanel(chart);
       JFrame frame=new JFrame("Financial Reporting");
     
       frame.pack();
       frame.setVisible(true);
    }
}

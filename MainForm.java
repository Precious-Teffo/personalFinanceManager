
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HC
 */
public class MainForm extends javax.swing.JFrame {
    private JTextField budgetNameField;
    private JTextField budgetAmountField;
    private JTextField expenseNameField;
    private JTextField expenseAmountField;
    private JTextField  investmentNameField;
    private JTextField investmentAmountField;
    
    private JTable budgetTable;
    private JTable expenseTable;
    private JTable investment;
    
    private JButton addBudgetButton;
    private JButton editBudgetButton;
    private JButton deleteBudgetButton;
    private JButton addExpenseButton;
    private JButton editExpenseButton;
    private JButton deleteExpenseButton;
    private JButton addInvestmentButton;
    private JButton editInvestmentButton;
    private JButton deleteInvestmentButton;
    
    public MainForm() {
        //Create menu bar
        JMenuBar menuBar=new JMenuBar();
        
        //Create menus
        JMenu fileMenu=new JMenu("file");
        JMenu budgetMenu=new JMenu("Budget");
        JMenu expenseMenu=new JMenu("Expense");
        JMenu investmentMenu= new JMenu("Investment");
        JMenu reportMenu=new JMenu("Report");
        
        //Create menu items
        JMenuItem newFileItem= new JMenuItem("new");
        JMenuItem openFileItem =new JMenuItem("open");
        JMenuItem saveFileItem=new JMenuItem("save");
        JMenuItem exitFileItem=new JMenuItem("Exit");
        
        JMenuItem addBudgetItem = new JMenuItem("Add Budget");
        JMenuItem editBudgetItem=new JMenuItem("Edit Budget");
        JMenuItem deleteBudgetItem=new JMenuItem("Delete Budget");
        
        JMenuItem addExpenseItem = new JMenuItem("Add Expense");
        JMenuItem editExpenseItem=new JMenuItem("Edit Expense");
        JMenuItem deleteExpenseItem=new JMenuItem("Delete Expense");
        
        JMenuItem addInvestmentItem = new JMenuItem("Add Investment");
        JMenuItem editInvestmentItem=new JMenuItem("Edit Investment");
        JMenuItem deleteInvestmentItem=new JMenuItem("Delete Investment");
        
        
        JMenuItem generateReportItem=new JMenuItem("Generate Report");
        
        //Add menu items to menu
        fileMenu.add(newFileItem);
        fileMenu.add(openFileItem);
        fileMenu.add(saveFileItem);
        fileMenu.add(exitFileItem);
        
        budgetMenu.add(addBudgetItem);
        budgetMenu.add(editBudgetItem);
        budgetMenu.add(deleteBudgetItem);
        
        expenseMenu.add(addExpenseItem);
        expenseMenu.add(editExpenseItem);
        expenseMenu.add(deleteExpenseItem);
        
        investmentMenu.add(addInvestmentItem);
        investmentMenu.add(editInvestmentItem);
        investmentMenu.add(deleteInvestmentItem);
        
      reportMenu.add(generateReportItem);
      
      //Add menus to menu
      menuBar.add(fileMenu);
      menuBar.add(budgetMenu);
      menuBar.add(expenseMenu);
      menuBar.add(investmentMenu);
      menuBar.add(reportMenu);
      
      //Create panels
      JPanel budgetPanel=new JPanel();
      budgetPanel.setBorder(BudgetFactory.createTitleBorder("Budget"));
      
      budgetPanel.setLayout(new GridLayout(0,2));
      
      budgetNameField=new JTextField();
      budgetAmountField=new JTextField();
      addBudgetButton=new JButton("Add Budget");
      editBudgetButton=new JButton("Edit Budget");
      deleteBudgetButton=new JButton("Delete Budget");
      
      budgetPanel.add(new JLabel("Budget name:"));
      budgetPanel.add(budgetNameField);
      budgetPanel.add(budgetAmountField);
      budgetPanel.add(addBudgetButton);
      budgetPanel.add(editBudgetButton);
      budgetPanel.add(deleteBudgetButton);
      
      JPanel expensePanel=new JPanel();
      expensePanel.setBorder(BudgetFactory.createTitleBorder("Expense"));
      
      expensePanel.setLayout(new GridLayout(0,2));
      
      expenseNameField=new JTextField();
      expenseAmountField=new JTextField();
      addExpenseButton=new JButton("Add Expense");
      editExpenseButton=new JButton("Edit Expense");
      deleteExpenseButton=new JButton("Delete Expense");
      
      expensePanel.add(new JLabel("Expense name:"));
     expensePanel.add(expenseNameField);
      expensePanel.add(expenseAmountField);
     expensePanel.add(addExpenseButton);
      expensePanel.add(editExpenseButton);
    expensePanel.add(deleteExpenseButton);
    
    JPanel investmentPanel=new JPanel();
      investmentPanel.setBorder(BudgetFactory.createTitleBorder("Investment"));
      
      investmentPanel.setLayout(new GridLayout(0,2));
      
      investmentNameField=new JTextField();
      investmentAmountField=new JTextField();
      addInvestmentButton=new JButton("Add Expense");
      editInvestmentButton=new JButton("Edit Expense");
      deleteInvestmentButton=new JButton("Delete Expense");
      
      investmentPanel.add(new JLabel("Investment name:"));
     investmentPanel.add(investmentNameField);
      investmentPanel.add(investmentAmountField);
     investmentPanel.add(addInvestmentButton);
      investmentPanel.add(editInvestmentButton);
    investmentPanel.add(deleteInvestmentButton);
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

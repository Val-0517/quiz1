/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;
/**
 *
 * @author rvale
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
        int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de empleados"));
        double SEM = 0.0925;
        double IVM = 0.00508;
        double totalSEM= 0;
        double totalIVM=0;
        
        for (int i = 0; i < numEmpleados; i++) {
            int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
            
            double montoSEM= salario*SEM;
            double montoIVM = salario*IVM;
            
            totalSEM+=montoSEM;
            totalIVM+=montoIVM;
            
        }
        
         double  pagoT= totalSEM+totalIVM;
         JOptionPane.showMessageDialog(null,"La empresa debera abonar a la CCSS el monto de "+pagoT+"por concepto de IVM y SEM");
        
        
    }
            

    
    
    
    
    
    
    
    
    
    
    
    


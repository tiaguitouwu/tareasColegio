/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author TERCEROS TM
 */
public class numeritos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=Integer.parseInt(JOptionPane.showInputDialog("Con que tipo de número desea trabajar? // 1:Entero 2:Real"));
        if(op==1){
            numeroEntero numerito=new numeroEntero();
            int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
            int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el otro número"));
            numerito.setN(n2);
            numerito.setNumber(n);
            int op2=Integer.parseInt(JOptionPane.showInputDialog("Que operación desea realizar?\n //1.Suma 2.Resta 3.Multiplicación 4.Dividición"));
            switch(op2){
                case 1:
                    numerito.sumar();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerito.getNumber());
                    break;
                case 2:
                    numerito.restar();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerito.getNumber());
                    break;
                case 3:
                    numerito.multiplicar();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerito.getNumber());
                    break;
                case 4:
                    numerito.dividir();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerito.getNumber());
                    break;
            
            
            }
        }
        if(op==2){
            numeroReal numerita=new numeroReal();
            double nn=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número"));
            double n22=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el otro número"));
            numerita.setN(n22);
            numerita.setNumber(nn);
            int op2=Integer.parseInt(JOptionPane.showInputDialog("Que operación desea realizar? \n //1.Suma 2.Resta 3.Multiplicación 4.Dividición"));
            switch(op2){
                case 1:
                    numerita.sumar();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerita.getNumber());
                    break;
                case 2:
                    numerita.restar();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerita.getNumber());
                    break;
                case 3:
                    numerita.multiplicar();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerita.getNumber());
                    break;
                case 4:
                    numerita.dividir();
                    JOptionPane.showMessageDialog(null, "El resultado es "+numerita.getNumber());
                    break;
            
            
            }
        }
    }
    
}

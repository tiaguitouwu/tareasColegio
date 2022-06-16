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
public class deportivo implements flexin, nombre {
    double superficie;
    String nombrecito;
    int oficinas;
    @Override
    public int tipoInstalacion(){
        int instala=(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de instalación")));
        return instala;
    }

    @Override
    public String nombrecito() {
        nombrecito=JOptionPane.showInputDialog("Ingrese el nombre del edificio");
        return nombrecito;
    }
    @Override
    public double superficie() {
        superficie=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la superficie"));
        return superficie;
    }
    public int oficinas(){
        oficinas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de oficinas"));
        return oficinas;
    }
    
}

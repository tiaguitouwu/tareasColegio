/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TERCEROS TM
 */
public class deportivoTonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double superficie;
        String nombrecito;
        int oficinas;
        deportivo a=new deportivo();
        int tipo=a.tipoInstalacion();
        switch(tipo){
            case 1:
                superficie=a.superficie();
                System.out.print("La superficie del edifio es "+superficie);
                break;
            case 2:
                superficie=a.superficie();
                nombrecito=a.nombrecito();
                System.out.println("El nombre del polideportivo es "+nombrecito+" y su superficie es "+superficie);
                break;
            case 3:
                superficie=a.superficie();
                oficinas=a.oficinas();
                System.out.println("La superficie del edificio de ofinas es "+superficie+" y tiene "+oficinas+" oficinas");
                break;
        }
    }
    
}

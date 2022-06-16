/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TERCEROS TM
 */
public class numeroReal extends numero {
    private double number;
    private double n;
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }
    public double getN() {
        return n;
    }
    public void setN(double n) {
        this.n = n;
    }
    @Override
    public void sumar(){
        number=number+n;
    }
    public void restar(){
        number=number-n;
    }
    public void multiplicar(){
        number=number*n;
    }
    public void dividir(){
        number=number/n;
    }
}

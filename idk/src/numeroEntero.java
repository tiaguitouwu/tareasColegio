/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TERCEROS TM
 */
public class numeroEntero extends numero {
    private int number;
    private int n;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
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

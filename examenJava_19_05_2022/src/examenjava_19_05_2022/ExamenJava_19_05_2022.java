
package examenjava_19_05_2022;

import javax.swing.JOptionPane;

abstract class Guerrero{
    String nombre;
    int edad,fuerza;
    boolean herido,muerto;

    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isHerido() {
        return herido;
    }
    public void setHerido(boolean herido) {
        this.herido = herido;
    }
    public boolean isMuerto() {
        return muerto;
    }
    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }
    protected boolean comprobarEdad(int edad){
        boolean a=false;
        if(edad>=15 && edad<=60){
            a=true;
        }
        return a;
    };
    protected boolean comprobarFuerza(int fuerza){
        boolean a=false;
        if(fuerza>=1 && fuerza<=10){
            a=true;
        }
        return a;
    }

    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        this.edad = edad;
        this.fuerza = fuerza;
        if(edad<15 && edad>60){
            this.edad=25;
        }
        if(fuerza<1 && fuerza>10){
            this.fuerza=5;
        }
    }
    public Guerrero() {
    }
    public abstract boolean retirarse();
    
}
class Troyano extends Guerrero{

    public Troyano(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }
    
    @Override
    public boolean retirarse() {
        return false;
    }
    

}
class Griego extends Guerrero{
    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }
    
    @Override
    public boolean retirarse() {
        boolean a=false;
        
        int com=JOptionPane.showConfirmDialog(null,"Desea retirarse?");
        if(com==0){
            a=true;
        }
        
        return a;
    }

}
public class ExamenJava_19_05_2022 {
    public static void main(String[] args) {
        int confir;
        Troyano guerreroTroya=new Troyano("Julio",10,0);
        if(guerreroTroya.comprobarEdad(guerreroTroya.getEdad()) &&
           guerreroTroya.comprobarFuerza(guerreroTroya.getFuerza())
          ){
          
        }else{
            guerreroTroya.setEdad(25);
            guerreroTroya.setFuerza(5);
        }
        System.out.println("Troya");
        System.out.println(guerreroTroya.getNombre());
        System.out.println(guerreroTroya.getEdad()+"");
        System.out.println(guerreroTroya.getFuerza()+"");
        
        Griego guerreroGrecia=new Griego("Marco",15,10);
        if(guerreroGrecia.comprobarEdad(guerreroGrecia.getEdad()) &&
           guerreroGrecia.comprobarFuerza(guerreroGrecia.getFuerza())
          ){
          
        }else{
            guerreroGrecia.setEdad(25);
            guerreroGrecia.setFuerza(5);
        }
        System.out.println("Grecia");
        System.out.println(guerreroGrecia.getNombre());
        System.out.println(guerreroGrecia.getEdad()+"");
        System.out.println(guerreroGrecia.getFuerza()+"");
        confir=JOptionPane.showConfirmDialog(null,"Está herido?");
        if(confir==0){
            if(guerreroGrecia.retirarse()){
                System.out.println("Retiradaaa");
            }else{
                System.out.println("QUE SIGA EL BAILE!!");
            }
            
        }
        
    }
    
}



class Mueble{
    public String nombre;
    public int numero;
    //public abstract void a();
    //public abstract void b();
    public void c(){
        System.out.println("AJDFB");
    }
    public void g(){
        System.out.println("akdbfkaf");
    }
    
    Mueble(String nombre){
        this.nombre=nombre;
        this.numero=0;
    }
}

interface Numerable{
    public abstract int establecerNumero(int numero);
    public abstract int devolverNumero();
    public void incrementarNumero();
}

class ave extends Mueble implements Numerable{
    public ave(String nombre, int numero) {
        super(nombre);
        this.numero=numero;
    }

    @Override
    public int establecerNumero(int numero) {
        this.numero=numero;
        return numero;
    }

    @Override
    public int devolverNumero() {
        return numero;
    }

    @Override
    public void incrementarNumero() {
        this.numero=numero+1;
    }

    public String getNombre() {
        return nombre;
    }

    




}
 class interfazAbstracta {
    public static void main(String[] args) {
      //ave a=new ave("PEDRO JULIAN",7) {};
      //System.out.println(a.getNombre()+" "+a.devolverNumero());
      //a.incrementarNumero();
      //System.out.println(a.devolverNumero());
      //System.out.println(a.nombre);
      Mueble a= new Mueble("yes"){};
      a.a();
    }
    
}

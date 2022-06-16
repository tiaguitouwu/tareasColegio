
package hospital;


import modelo.conexion;
import modelo.departamento;
class env{
    
}

public class Hospital {


    public static void main(String[] args) {
        departamento dep=new departamento();
       /* dep.setDep_nro(1000);
        dep.setLocal("yo");
        dep.setNombre("ctn");
        dep.insertarDep(); */
        dep.ejecutarConsulta();
    }
    
}

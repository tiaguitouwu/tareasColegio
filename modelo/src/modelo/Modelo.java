
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class conexion {
    private String contra;
    private String usuario;
    private String base;
    private String host;
    private Connection con;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public conexxion() {
        this.contra = "";
        this.usuario = "root";
        this.base = "cuarta_clase";
        this.host = "127.0.0.1";
    }
    
    
    
    public Connection getConexion(){
        try{
        
            String url="jdbc:mysql//"+host+"/"+base;
            Class.forName("com.mysql.cj.jdbc.Drive");
            con=DriverManager.getConnection(url, usuario, contra);
            System.out.println("Conectado éxitosamente!!");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexión");
            e.printStackTrace();
        
        }
        return con;
    }
    
    
}

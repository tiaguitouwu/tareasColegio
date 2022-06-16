/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TERCEROS TM
 */
public class departamento extends conexion{
    private int dep_nro;
    private String nombre;
    private String local;
    private Statement query;

    public int getDep_nro() {
        return dep_nro;
    }

    public void setDep_nro(int dep_nro) {
        this.dep_nro = dep_nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public departamento(){
    
    
    }
    public void ejecutarConsulta() {
    try {
   String SQL = "SELECT * FROM dept";
   Statement stmt = getConexion().createStatement();
   ResultSet rs = stmt.executeQuery(SQL);

   while (rs.next()) {
   System.out.println(rs.getString("Dept_No") + ", " + rs.getString("DNombre")+ ", " + rs.getString("Loc"));
}
  
  rs.close();
  stmt.close();
}catch (Exception e) {
  e.printStackTrace();
}
}

    public void insertarDep(){
        try{
            String sql="insert into dept values("+this.dep_nro+",'"+this.nombre+"','"+this.local+"')";
            query=getConexion().createStatement();
            query.executeUpdate(sql);
            System.out.println("Todo viento!");
        }catch(SQLException e){
            System.out.println("Todo mal!");
            e.printStackTrace();
        }
    }

}

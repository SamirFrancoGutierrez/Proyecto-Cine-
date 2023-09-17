
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VentaDAO {
    Connection cn;
    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
   public int  RigistrarVenta(Venta v){
       String sql="INSERT INTO ventas(dni,apellido,cliente,cat_peli,nombre_peli,total_compra,fecha) VALUES (?,?,?,?,?,?,?)";
       try {
           cn = con.getConnection();
           ps = cn.prepareStatement(sql);
           ps.setInt(1, v.getDni());
           ps.setString(2, v.getApellido());
           ps.setString(3, v.getCliente());
           ps.setString(4, v.getCategoriapeli());
           ps.setString(5, v.getNompeli());
           ps.setDouble(6, v.getTpago());
           ps.setString(7, v.getFecha());

            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
       
   } 
    
     public int IdVenta(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM ventas";
        try {
            cn = con.getConnection();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
}

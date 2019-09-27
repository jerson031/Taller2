/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import DAO.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class VendedorDAO {
    
     private Conexion con;

    public VendedorDAO() {
        con = new Conexion();
    }

    public void inserVentas(Ventas pr) {
        
        
        Connection accesoBD = con.getConexion();
        try {
          
            String sql = "INSERT INTO venta (sucursal,monto,fecha ,id_vendedor)"
                    + "VALUES ('" + pr.getSucursal() + "'," + pr.getMonto() + ",'" + pr.getFecha() + "'," +  " 3 )";
            
            Statement st = accesoBD.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {

            System.out.println("ERROR al insertar la producto ");

            e.printStackTrace();

        }
    }
    
    
}
    
    
    
    
    
    
    


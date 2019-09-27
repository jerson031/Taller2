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

public class VentasDao {
    private Conexion con;

    public VentasDao() {
        con = new Conexion();
    }
    
    public ArrayList<Vendedor> getVendedores() {

        ArrayList<Vendedor> ids = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM vendedor ";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {

              String nombre = resultados.getString("nombre");
              String apellido = resultados.getString("apellido");
               
                ids.add(new Vendedor(nombre,apellido));
            }
            accesoBD.close();
            return ids;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }
    }
    
    
    


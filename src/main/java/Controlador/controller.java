/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ventas;


public class controller {
   
     private boolean MayorVenta(){
         Ventas v = new Ventas();
        if(v.getMonto()<=v.getMonto()){
            return true;
        }else{
            return false;
        }
    }
    private boolean MayorMes(){
         Ventas v = new Ventas();
        if(v.getFecha().equals(v)){
            return true;
        }else{
            return false;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Ventas {
   
    private String sucursal;
    private int monto;
    private String fecha;
    private int idVendedor;

    public Ventas(String sucursal, int monto, String fecha) {
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Ventas(String sucursal, int monto, String fecha, int idVendedor) {
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
        this.idVendedor = idVendedor;
    }

    public Ventas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    
    
}

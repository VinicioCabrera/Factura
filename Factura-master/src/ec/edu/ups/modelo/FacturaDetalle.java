/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Eduardo Ayora
 */
public class FacturaDetalle {
    
    private int codigo;
    private int precio;
    private int cantidad;
    private double subtotal;
    private Producto producto;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigo, int precio, int cantidad, double subtotal, Producto producto) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FacturaDetalle other = (FacturaDetalle) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
    
}

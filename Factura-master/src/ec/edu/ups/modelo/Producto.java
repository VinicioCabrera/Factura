/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author Eduardo Ayora
 */
public class Producto {
    
    private int codigoProducto;
    private String nombre;
    private double precio;
    private String detalle; 

    public Producto() {
    }

    public Producto(int codigo, String nombre, int precio, String marca, String detalle) {
        this.codigoProducto = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.detalle = detalle;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigo) {
        this.codigoProducto = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }



    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.codigoProducto;
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
        final Producto other = (Producto) obj;
        if (this.codigoProducto != other.codigoProducto) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

package com.example.vistasproyecto.modelos;

public class ModeloDetalle {
    //linda
    //declaracion de variables del modelo:
    private int id_detalle, cantidad, id_producto, id_factura;
    private String numero_serie;
    private double precio_prod;

    //constructor vacio:

    public ModeloDetalle() {
    }


    //getters y setters para poder acceder a los metodos:

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public double getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(double precio_prod) {
        this.precio_prod = precio_prod;
    }
}

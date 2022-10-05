package com.example.vistasproyecto.modelos;

public class ModeloFacturacion {
    //linda
    //declaracion de variables:
    private int id_facturacion, cantidad, id_cajero, id_cliente, id_puntos;
    private String fecha, nit, longitud_facturacion, latitud_facturacion;
    private double monto_facturacion;

    //constructor vacio:

    public ModeloFacturacion() {
    }


    //construimos getters y setters para cada variable:

    public int getId_facturacion() {
        return id_facturacion;
    }

    public void setId_facturacion(int id_facturacion) {
        this.id_facturacion = id_facturacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_cajero() {
        return id_cajero;
    }

    public void setId_cajero(int id_cajero) {
        this.id_cajero = id_cajero;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_puntos() {
        return id_puntos;
    }

    public void setId_puntos(int id_puntos) {
        this.id_puntos = id_puntos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getLongitud_facturacion() {
        return longitud_facturacion;
    }

    public void setLongitud_facturacion(String longitud_facturacion) {
        this.longitud_facturacion = longitud_facturacion;
    }

    public String getLatitud_facturacion() {
        return latitud_facturacion;
    }

    public void setLatitud_facturacion(String latitud_facturacion) {
        this.latitud_facturacion = latitud_facturacion;
    }

    public double getMonto_facturacion() {
        return monto_facturacion;
    }

    public void setMonto_facturacion(double monto_facturacion) {
        this.monto_facturacion = monto_facturacion;
    }
}

package com.example.vistasproyecto.modelos;

public class ModeloEstado {
    //linda
    //declaramos variables
    private int id_estado;
    private String descripcion_estado;

    //constructor vacio

    public ModeloEstado() {
    }

    //getters y setters.

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getDescripcion_estado() {
        return descripcion_estado;
    }

    public void setDescripcion_estado(String descripcion_estado) {
        this.descripcion_estado = descripcion_estado;
    }
}

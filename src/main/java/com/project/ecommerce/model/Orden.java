package com.project.ecommerce.model;

import lombok.Data;

import java.util.Date;
@Data
public class Orden {
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;

    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    public Orden() {
    }
}

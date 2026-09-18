package com.example.demo.model;

import java.time.LocalDateTime;

public class Favorito {
    private Long id;
    private Long productoId;
    private String notaPersonal;
    private LocalDateTime fechaAgregado;

    // Constructores
    public Favorito() {}

    public Favorito(Long productoId, String notaPersonal) {
        this.productoId = productoId;
        this.notaPersonal = notaPersonal;
        this.fechaAgregado = LocalDateTime.now();
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getProductoId() { return productoId; }
    public void setProductoId(Long productoId) { this.productoId = productoId; }
    
    public String getNotaPersonal() { return notaPersonal; }
    public void setNotaPersonal(String notaPersonal) { this.notaPersonal = notaPersonal; }
    
    public LocalDateTime getFechaAgregado() { return fechaAgregado; }
    public void setFechaAgregado(LocalDateTime fechaAgregado) { this.fechaAgregado = fechaAgregado; }
}

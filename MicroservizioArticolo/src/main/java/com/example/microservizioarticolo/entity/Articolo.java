package com.example.microservizioarticolo.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Articolo {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeArticolo;

    private String prezzo;

    private Long idRecensione;

    private String testoRecensione;

    public String getNomeArticolo() {
        return nomeArticolo;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public String getTestoRecensione(){
        return this.testoRecensione;
    }

    public void setIdRecensione(Long idRecensione){
        this.idRecensione=idRecensione;
    }

    public void setTestoRecensione(String testoRecensione){
        this.testoRecensione=testoRecensione;
    }

}
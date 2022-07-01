package com.example.microservizioarticolo.articoloDto;

public class ArticoloDto {

    private String nomeArticolo;

    private String prezzo;

    private String testoRecensione;

    public void setNomeArticolo(String nomeArticolo) {
        this.nomeArticolo = nomeArticolo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public void setTestoRecensione(String testoRecensione) {
    }

    public String getNomeArticolo(){
        return this.nomeArticolo;
    }

    public String getPrezzo(){
        return this.prezzo;
    }

    public String getTestoRecensione(){
        return this.testoRecensione;
    }
}

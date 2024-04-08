package com.example2.demo2;

public class Saluto {
    private String nome;
    private String regione;
    private final String saluto;

    public Saluto(String nome, String regione) {
        this.nome = nome;
        this.regione = regione;
        this.saluto = "Ciao "+ nome + ", com'è il tempo in " + regione + "?";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegione() {
        return regione;
    }
    public void setRegione(String regione) {
        this.regione = regione;
    }
    public String getSaluto() {
        return saluto;
    }
}

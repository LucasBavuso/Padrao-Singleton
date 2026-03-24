package com.example;

public class Criptografia {

    private Criptografia() {};
    private static Criptografia instance = new Criptografia();
    public static Criptografia getInstance() {
        return instance;
    }

    private String chave;
    private String algoritimo;

    public String getChaveMestra() {
        return chave;
    }

    public void setChaveMestra(String chave) {
        this.chave = chave;
    }

    public String getAlgoritimo() {
        return algoritimo;
    }

    public void setAlgoritimo(String algoritimo) {
        this.algoritimo = algoritimo;
    }
}
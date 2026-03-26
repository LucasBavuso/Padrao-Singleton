package com.example;

public class Criptografia {

    private Criptografia() {};
    private static Criptografia instance = new Criptografia();
    public static Criptografia getInstance() {
        return instance;
    }

    private String chave;
    private String Algoritmo;

    public String getChaveMestra() {
        return chave;
    }

    public void setChaveMestra(String chave) {
        this.chave = chave;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String Algoritmo) {
        this.algoritmo = algoritmo;
    }
}

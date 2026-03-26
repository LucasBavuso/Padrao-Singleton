package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CriptografiaTest {

    @Test
    public void deveRetornarAlgoritmo() {
        Criptografia.getInstance().setAlgoritmo("AES/CBC/PKCS5Padding");
        assertEquals("AES/CBC/PKCS5Padding", Criptografia.getInstance().getAlgoritmo());
    }

    @Test
    public void deveRetornarChaveMestra() {
        Criptografia.getInstance().setChaveMestra("603deb1015ca71be2b73aef0857d77811f352c073b61");
        assertEquals("603deb1015ca71be2b73aef0857d77811f352c073b61", Criptografia.getInstance().getChaveMestra());
    }

}

package com.caramelup.calculadora.Calculadora;

public enum Operacao {

    ADICAO(" + "),
    SUBTRACAO(" - "),
    MULTIPLICACAO(" × "),
    DIVISAO(" ÷ "),
    PORCENTAGEM(" % ");

    private String texto = "";

    Operacao(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}

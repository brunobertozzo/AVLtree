package com.company;

/**
 *
 * @author Bruno Bertozzo
 */
public class Noh {
    private int chave;
    private int balanceamento;
    private int altura;
    private Noh esquerda;
    private Noh direita;
    private Noh pai;

    public Noh(int chave, Noh pai) {
        this.chave = chave;
        this.pai = pai;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Noh getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Noh esquerda) {
        this.esquerda = esquerda;
    }

    public Noh getDireita() {
        return direita;
    }

    public void setDireita(Noh direita) {
        this.direita = direita;
    }

    public Noh getPai() {
        return pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }


}

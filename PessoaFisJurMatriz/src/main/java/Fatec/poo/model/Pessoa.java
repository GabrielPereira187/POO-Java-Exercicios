/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec.poo.model;

public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totCompras;
    private PedidoCompra pedcomp;

    public PedidoCompra getPedcomp() {
        return pedcomp;
    }

    public void setPedcomp(PedidoCompra pedcomp) {
        this.pedcomp = pedcomp;
    }

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotCompras() {
        return totCompras;
    }


    public void addCompras(double val){
        totCompras += val;
    }
    
    abstract public double calcBonus(int valAnoAtual);
    
}

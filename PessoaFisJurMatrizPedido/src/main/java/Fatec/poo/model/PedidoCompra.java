/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec.poo.model;

/**
 *
 * @author gdeba
 */
public class PedidoCompra {
    private int codigo;
    private String dataPedido;
    private double valorPedido;
    private Pessoa pessoa;
    
    public PedidoCompra(int codigo) {
        this.codigo = codigo;
    }
    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}

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
    private Pessoa pessoas[];
    private int numPessoas;
    public PedidoCompra(int codigo) {
        this.codigo = codigo;
        pessoas = new Pessoa[3];
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
    
    public void addPessoas(Pessoa p){
        pessoas[numPessoas] = p;
        numPessoas++;
    }
    
    
    public void listarFuncionarios(Pessoa pessoas[]){
        System.out.println("Codigo: " + codigo);
        System.out.println("Valor do pedido: " + valorPedido);
        System.out.println("Data de Pedido: " + dataPedido);
        for(int x = 0; x < numPessoas;x++){
            if(pessoas[x] instanceof PessoaFisica){
                            System.out.println("Tipo de pessoa: Física");
                            System.out.println("CPF: " + ((PessoaFisica)pessoas[x]).getCpf());
                            System.out.println("Nome: " + ((PessoaFisica)pessoas[x]).getNome());
                            System.out.println("Ano de Inscricão: " + ((PessoaFisica)pessoas[x]).getAnoInscricao());
                            System.out.println("Valor de bônus: " + ((PessoaFisica)pessoas[x]).calcBonus(2021));
                        }
                        if(pessoas[x] instanceof PessoaJuridica){
                            System.out.println("Tipo de pessoa: Juridica");
                            System.out.println("CPF: " + ((PessoaJuridica)pessoas[x]).getCgc());
                            System.out.println("Nome: " + ((PessoaJuridica)pessoas[x]).getNome());
                            System.out.println("Ano de Inscricão: " + ((PessoaJuridica)pessoas[x]).getAnoInscricao());
                            System.out.println("Valor de bônus: " + ((PessoaJuridica)pessoas[x]).calcBonus(2021));
                        }
        }
        System.out.println("===============================================");
    }

    public int getCodigo() {
        return codigo;
    }
}

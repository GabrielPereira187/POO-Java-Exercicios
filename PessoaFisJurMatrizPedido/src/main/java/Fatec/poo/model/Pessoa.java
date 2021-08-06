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
    private PedidoCompra pedcomp[];
    private int numPed;

    

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        PedidoCompra[] pedcomp = new PedidoCompra[10];
        numPed = 0;
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
    
    
    public void listarFuncionarios(Pessoa pessoas[]){
        for(int x = 0; x < pessoas.length;x++){
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
    
    public void addPedidos(PedidoCompra pc){
        pedcomp[numPed] = pc;
        numPed++;
    }
    
}

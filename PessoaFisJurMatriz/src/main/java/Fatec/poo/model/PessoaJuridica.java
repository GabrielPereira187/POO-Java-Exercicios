/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec.poo.model;

public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String cgc, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }

    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }
    @Override
    public double calcBonus(int valAnoAtual) {
        return (taxaIncentivo / 100 * getTotCompras()) * (valAnoAtual - getAnoInscricao());
    }
    
    
}

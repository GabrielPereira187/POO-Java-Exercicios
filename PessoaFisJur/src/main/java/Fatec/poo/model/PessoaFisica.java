/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec.poo.model;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private double base;

    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
    @Override
    public double calcBonus(int valAnoAtual) {
        double bonus = 0;
        if(getTotCompras() > 12000){
            bonus = (valAnoAtual - getAnoInscricao()) * base;
        }
        return bonus;
    }
    
}

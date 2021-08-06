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
public class Operacoes {
    public int pesquisa(Pessoa pessoas[], String num){
        int i;
        for(i = 0; i < pessoas.length;i++){
            if(pessoas[i] instanceof PessoaFisica){
                if(num.equals(((PessoaFisica)pessoas[i]).getCpf())){
                    return i;
                }
            }
            if(pessoas[i] instanceof PessoaJuridica){
                if(num.equals(((PessoaJuridica)pessoas[i]).getCgc())){
                    return i;
                }
            }
        }
        return -100;
    }
}

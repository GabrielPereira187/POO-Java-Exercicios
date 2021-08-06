/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pessoafisjurmatriz;

import Fatec.poo.model.Pessoa;
import Fatec.poo.model.PessoaFisica;
import Fatec.poo.model.PessoaJuridica;
import java.util.Scanner;

/**
 *
 * @author gdeba
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        Pessoa pessoas[] = new Pessoa[3];
        
        String nome,cpf,cgc;
        int anoInscricao, anoAtual = 2021,i = 0,op;
        double valor,base,totalCompras,taxaIncentivo;
        
        while(true){
            System.out.println("1-Cadastrar Pessoa Física\n2-Cadastrar Pessoa Jurídica\n3-Listar Bônus\n4-Fim\n\n\nDigite a opção:");
            op = entrada.nextInt();
            switch(op){
                case 1:
                    System.out.println("Digite o cpf do cliente:");
                    cpf = entrada.next();
                    System.out.println("Nome do cliente: ");
                    nome = entrada.next();
                    System.out.println("Ano de inscrição: ");
                    anoInscricao = entrada.nextInt();
                    pessoas[i] = new PessoaFisica(cpf,nome,anoInscricao);
                    System.out.println("Defina o valor de base:");
                    base = entrada.nextDouble();
                    ((PessoaFisica)pessoas[i]).setBase(base);
                    System.out.println("Total de compras:");
                    totalCompras = entrada.nextDouble();
                    pessoas[i].addCompras(totalCompras);
                    i++;
                    break;
                case 2:
                    System.out.println("Digite o cgc do cliente:");
                    cgc = entrada.next();
                    System.out.println("Nome do cliente: ");
                    nome = entrada.next();
                    System.out.println("Ano de inscrição: ");
                    anoInscricao = entrada.nextInt();
                    pessoas[i] = new PessoaJuridica(cgc,nome,anoInscricao);
                    System.out.println("Defina o valor de taxa de incentivo:");
                    taxaIncentivo = entrada.nextDouble();
                    ((PessoaJuridica)pessoas[i]).setTaxaIncentivo(taxaIncentivo);
                    System.out.println("Total de compras:");
                    totalCompras = entrada.nextDouble();
                    pessoas[i].addCompras(totalCompras);
                    i++;
                    break;
                case 3:
                    for(x = 0; x < i;x++){
                        if(pessoas[x] instanceof PessoaFisica){
                            System.out.println("Tipo de pessoa: Física");
                            System.out.println("CPF: " + ((PessoaFisica)pessoas[x]).getCpf());
                            System.out.println("Nome: " + ((PessoaFisica)pessoas[x]).getNome());
                            System.out.println("Ano de Inscricão: " + ((PessoaFisica)pessoas[x]).getAnoInscricao());
                            System.out.println("Valor de bônus: " + ((PessoaFisica)pessoas[x]).calcBonus(anoAtual));
                        }
                        if(pessoas[x] instanceof PessoaJuridica){
                            System.out.println("Tipo de pessoa: Juridica");
                            System.out.println("CPF: " + ((PessoaJuridica)pessoas[x]).getCgc());
                            System.out.println("Nome: " + ((PessoaJuridica)pessoas[x]).getNome());
                            System.out.println("Ano de Inscricão: " + ((PessoaJuridica)pessoas[x]).getAnoInscricao());
                            System.out.println("Valor de bônus: " + ((PessoaJuridica)pessoas[x]).calcBonus(anoAtual));
                        }
                        System.out.println("----------------------------");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("A opção " + op + " é inválida");
                    break;
            }
        }
    }
}

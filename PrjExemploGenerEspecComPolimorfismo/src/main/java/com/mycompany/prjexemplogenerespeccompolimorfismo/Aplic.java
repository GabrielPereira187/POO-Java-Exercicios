
package com.mycompany.prjexemplogenerespeccompolimorfismo;

import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funchorista = new FuncionarioHorista(201,"Gabriel de Barros", "13/02/2021","Programador",30);
        
        FuncionarioMensalista funcmensalista = new FuncionarioMensalista(202,"Gabriel Silva", "13/04/2021","Contador",900);
        
        funchorista.setQtdHoraTrab(140);
        
        funcmensalista.setNumSalMin(5);
        System.out.println("Nome do funcionario:\t" + funchorista.getNome());
        
        System.out.println("ID do funcionario:\t" + funchorista.getRegistro());
        
        System.out.println("Data de admissão do funcionario:\t" + funchorista.getDtAdmissao());
        
        System.out.println("Cargo do funcionario:\t" + funchorista.getCargo());
        
        System.out.println("Salário Bruto:\t" + funchorista.calcSalBruto());
        
        System.out.println("Desconto:\t" + funchorista.calcDesconto());
        
        System.out.println("Gratificação:\t" + funchorista.calcGrat());
        
        System.out.println("Salario Liquido:\t" + funchorista.calcSalLiquido());
        
        System.out.println("================================");
        
        System.out.println("Nome do funcionario:\t" + funcmensalista.getNome());
        
        System.out.println("ID do funcionario:\t" + funcmensalista.getRegistro());
        
        System.out.println("Data de admissão do funcionario:\t" + funcmensalista.getDtAdmissao());
        
        System.out.println("Cargo do funcionario:\t" + funcmensalista.getCargo());
        
        System.out.println("Salário Bruto:\t" + funcmensalista.calcSalBruto());
        
        System.out.println("Desconto:\t" + funcmensalista.calcDesconto());
        
        System.out.println("Salario Liquido:\t" + funcmensalista.calcSalLiquido());
        
        FuncionarioComissionado funccom = new FuncionarioComissionado(302,"Gabriel Andrade", "13/07/2021","Vendedor",10);
        
        funccom.setSalBase(3000);
        
        funccom.addVendas(6500);
        
        System.out.println("================================");
        
         System.out.println("Nome do funcionario:\t" + funccom.getNome());
        
        System.out.println("ID do funcionario:\t" + funccom.getRegistro());
        
        System.out.println("Data de admissão do funcionario:\t" + funccom.getDtAdmissao());
        
        System.out.println("Cargo do funcionario:\t" + funccom.getCargo());
        
        System.out.println("Taxa de comissão:\t" + funccom.getTaxaComissao() + "%");
        
        System.out.println("Valor das vendas:\t" + funccom.getTotalVendas());
        
        System.out.println("Salario base:\t" + funccom.getSalBase());
        
        System.out.println("Salário Bruto:\t" + funccom.calcSalBruto());
        
        System.out.println("Desconto:\t" + funccom.calcDesconto());
        
        System.out.println("Gratificação:\t" + funccom.calcGrat());
        
        System.out.println("Salario Liquido:\t" + funccom.calcSalLiquido());
    }    
    
    
}

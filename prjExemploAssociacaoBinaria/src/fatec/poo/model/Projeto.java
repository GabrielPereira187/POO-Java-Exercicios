/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtFim;
    private Funcionario[] funcionarios;
    private int numFunc;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[10];
    }
    public void addFuncionarios(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }

    public void listarFuncionarios(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data de Inicio: " + dtInicio);
        System.out.println("Data de fim: " + dtFim);
        for(int x = 0; x < numFunc;x++){
            System.out.println("Departamento:" + funcionarios[x].getDepartamento().getNome());
            System.out.println("Sigla do Departamento:" + funcionarios[x].getDepartamento().getSigla());
            System.out.println("Nome do Funcionario:" + funcionarios[x].getNome());
            System.out.println("Registro:" + funcionarios[x].getRegistro());
            System.out.println("Data de admissão:" + funcionarios[x].getDtAdmissao());
            System.out.println("\n\n\n");
            
        }
        System.out.println("===============================================");
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }
    
    
}

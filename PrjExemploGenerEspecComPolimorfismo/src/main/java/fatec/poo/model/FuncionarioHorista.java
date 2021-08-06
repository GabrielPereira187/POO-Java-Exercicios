
package fatec.poo.model;

public class FuncionarioHorista extends Funcionario {
        private double valHoraTrab;
        private int qtdHoraTrab;

    public FuncionarioHorista( int registro, String nome, String dtAdmissao,String Cargo,double valHoraTrab) {
        super(registro, nome, dtAdmissao,Cargo);
        this.valHoraTrab = valHoraTrab;
    }

    public void setQtdHoraTrab(int qtdHoraTrab) {
        this.qtdHoraTrab = qtdHoraTrab;
    }
        @Override
    public double calcSalBruto() {
        return (valHoraTrab * qtdHoraTrab);
    }
    
    public double calcGrat(){
        return (calcSalBruto() * 0.075);
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGrat());
    }
    
}

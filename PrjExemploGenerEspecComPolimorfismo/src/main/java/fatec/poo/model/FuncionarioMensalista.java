package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario {
        private double valSalMin;
        private double numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, String Cargo,double valSalMin) {
        super(registro, nome, dtAdmissao, Cargo);
        this.valSalMin = valSalMin;
    }
        @Override
    public double calcSalBruto() {
        return (numSalMin * valSalMin);
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
}

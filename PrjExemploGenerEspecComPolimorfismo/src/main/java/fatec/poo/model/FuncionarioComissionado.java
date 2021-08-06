
package fatec.poo.model;

/**
 *
 * @author gdeba
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;


    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, String Cargo, double taxaComissao ) {
        super(registro, nome, dtAdmissao, Cargo);
        this.taxaComissao = taxaComissao;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public void addVendas(double valor){
        totalVendas = valor;
    }
    
    public double calcSalBruto(){
    return(salBase + (totalVendas * taxaComissao / 100));
    }
    
    public double calcGrat(){
        if(totalVendas < 5000){
            return 0;
        }
        if(totalVendas > 5000 && totalVendas < 10000){
            return(0.03 * calcSalBruto());
        }
        return(0.05 * calcSalBruto());
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGrat());
    }
    
    
    
}

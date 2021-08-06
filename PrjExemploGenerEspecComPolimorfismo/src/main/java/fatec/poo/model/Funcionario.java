package fatec.poo.model;

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String Cargo;

    public Funcionario(int registro, String nome, String dtAdmissao, String Cargo) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
        this.Cargo = Cargo;
    }

    
    abstract public double calcSalBruto();
    
    
    public double calcDesconto(){
        return (calcSalBruto() * 0.10);
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return Cargo;
    }
    
    
    
    
    
    
}

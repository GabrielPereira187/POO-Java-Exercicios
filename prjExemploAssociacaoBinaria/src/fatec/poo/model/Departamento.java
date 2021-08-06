package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento  {
    private String sigla;
    private String nome;
    private Funcionario [] funcionarios;
    private int numFunc;
   
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionarios(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
}

package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public abstract class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private PedidoCompra[] pedidosCompra; //multiplicidade 1..*
    private int numPed;
    
    public Pessoa(String nome, int anoInscricao){
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        pedidosCompra = new PedidoCompra[10];
        numPed = 0;
    }
    public abstract double calcBonus(int anoAtual);
    
    public void addCompras(double val){
        totalCompras += val;
    }
    
    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void addPedidoCompra(PedidoCompra pc){
        pedidosCompra[numPed] = pc;
        numPed++;
    }
}

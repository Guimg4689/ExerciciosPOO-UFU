package locadora;

public class Fita extends Midia{
    boolean rebobinada;

    public Fita(String nome, String tipo, String genero, double precoLocacao, boolean rebobinada) {
        super(nome, tipo, genero, precoLocacao);
        this.rebobinada = rebobinada;
    }

    public boolean isRebobinada() {
        return rebobinada;
    }

    public void setRebobinada(boolean rebobinada) {
        this.rebobinada = rebobinada;
    }

    public String mostradados(){
        return super.toString() + ", rebobinada: " + isRebobinada();
    }
}

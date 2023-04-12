package locadora;

public class Cds extends Midia{
    String cantor;
    int faixas;

    public Cds(String nome, String tipo, String genero, double precoLocacao,String cantor,int faixas) {
        super(nome, tipo, genero, precoLocacao);
        this.cantor = cantor;
        this.faixas = faixas;

    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public String mostraDados(){
        return super.toString() + ", Diretor: " + getFaixas() + ", Tempo de duração: " +getFaixas();

    }
}

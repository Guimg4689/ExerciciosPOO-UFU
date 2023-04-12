package locadora;


import java.util.Arrays;

public class Dvd extends Midia{
    private String[] atores;
    private String diretor;
    private int tempoDeDuracao;

    public Dvd(String nome, String tipo, String genero, double precoLocacao, String[]atores, String diretor, int tempoDeDuracao) {
        super(nome, tipo, genero, precoLocacao);
        this.atores = atores;
        this.diretor = diretor;
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }


    public String mostraDados(){
        return super.toString() + ", Diretor: " +getDiretor() + ", tempo de duração: " + getTempoDeDuracao();

    }
}

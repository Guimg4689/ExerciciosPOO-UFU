package Nave;

public class NaveEspacial {
    private String nome;
    private int velocidade;

    public NaveEspacial(String nome) {
       setNome(nome);
       this.velocidade = 0;
    }

         String mostraNave(){
        if(this.velocidade > 0){
          return "Nome: " + getNome() +" velocidade: " + getVelocidade() ;
        }else {
            return "Nave Inoperante";
        }
    }

   public void ligaNave(){
        setVelocidade();
    }

    public void desligaNave(){
        this.velocidade = 0;
    }

    public void setVelocidade() {
     this.velocidade = (int)(Math.random() * 5) + 5;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    boolean naveMaisRapida(NaveEspacial n){
        if (this.getVelocidade()> n.getVelocidade()){
            return true;
        }else {
            return  false;
        }
        }
        
    }



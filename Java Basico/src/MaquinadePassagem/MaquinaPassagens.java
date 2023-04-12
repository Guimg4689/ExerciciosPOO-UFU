package MaquinadePassagem;

public class MaquinaPassagens {
    String id;
    private int preco,quantidadeInserida,total;


    public MaquinaPassagens(String id,int p){
        setid(id);
        setvalor(p);
        quantidadeInserida = 0;
        total = 0;
    }

    void setvalor(int newvalor){
        if(newvalor < 0)preco = 1;
        else {
            preco = newvalor;
        }
    }
    String getId(){
        return id;
    }

    int getQuantidadeInserida(){
        return quantidadeInserida;
    }
    int getTotal(){
        return total;
    }

    int getPreco(){
        return preco;
    }
   void setid(String n){
        id = n;

    }

    void setquantidade(int quant) {
        total += quant;
        quantidadeInserida += quant;
        if (quantidadeInserida==(preco) || quantidadeInserida > preco) {
            emiteticket();
            quantidadeInserida -=preco;
            if(quantidadeInserida > 0){
                System.out.println("Troco: " + quantidadeInserida);
                total-=quantidadeInserida;
                quantidadeInserida = 0;
            }
        } else {

            System.out.println("Quantidade Restante: " + (preco - quantidadeInserida));

        }

    }
    void emiteticket(){
        System.out.println("\n============\nTICKET\n============\n");
    }


    String mostraDados() {
        return "id: " + id  + " passagem: " + preco + " total: R$ " + total;
    }
}

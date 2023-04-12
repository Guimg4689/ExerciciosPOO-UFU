package ED;

public class Main {
    public static void main(String[] args) {
        No no1  = new No("conteudo no 1");
        No no2 = new No("conteudo no 2 ");
        no1.setProximoNo(no2);

        No no3 = new No("conteudo no 3");
        no2.setProximoNo(no3);

        System.out.println(no1.getProximoNo() + no1.toString() +"\n");
        System.out.println(no2.getProximoNo() +  no2.toString() +"\n");
        System.out.println(no3.getProximoNo() +  no3.toString() +"\n");
    }
}


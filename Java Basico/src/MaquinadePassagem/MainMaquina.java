package MaquinadePassagem;

import java.util.Scanner;

public class MainMaquina {

    public static void main(String[] args) {
        MaquinaPassagens p1 = new MaquinaPassagens("01",4);
        Scanner sc = new Scanner(System.in);
        int op = 1;

        do {


            System.out.println("1 - Comprar Ficha ");
            System.out.println("2 - Valor Passagem");
            System.out.println("3 - Mostrar Dados Maquina ");
            System.out.println("4 - Sair ");
            System.out.println("Digite uma das opcoes abaixo: ");
            op = sc.nextInt();
            switch (op){
                case 1:

                    System.out.println("Passagem : R$ " + p1.getPreco());
                    System.out.println("Digite o valor a ser inserido na maquina: ");
                    int value = sc.nextInt();
                    p1.setquantidade(value);
                    break;
                case 2:
                    System.out.println("Valor Passagem: " + p1.getPreco() );
                   break;
                case 3:
                    System.out.println(p1.mostraDados());
                    break;

                case 4:
                    System.out.println("=======Saindo========");
                    break;
            }

        }while(op!=4);

    }
}

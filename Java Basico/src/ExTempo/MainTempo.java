package ExTempo;

import MaquinadePassagem.MaquinaPassagens;

import java.util.Scanner;

public class MainTempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo();

        Scanner sc = new Scanner(System.in);
        int op = 1;

        do {


            System.out.println("1 - Criar Relogio ");
            System.out.println("2 - incrementar Relogio");
            System.out.println("3 - Decrementar Relogio ");
            System.out.println("4 - Mostrar Horario ");
            System.out.println("5 - Sair");
            System.out.println("Digite uma das opcoes abaixo: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Digite a hora do Relogio:");
                    int h = sc.nextInt();
                    System.out.println("Digite os minutos do Relogio:");
                    int m = sc.nextInt();
                    System.out.println("Digite os Segundos  do Relogio:");
                    int s = sc.nextInt();
                    
                    t1.setHora(h);
                    t1.setMinuto(m);
                    t1.setSegundo(s);
                    break;
                    
                case 2:
                    System.out.println("Digite quantos minutos a serem acrescentados: " );
                    int add = sc.nextInt();
                    t1.incrementa(add);
                    break;
                case 3:
                    System.out.println("Digite quantos minutos a serem decrementados: " );
                    int sub = sc.nextInt();
                    t1.decrementa(sub);
                    break;

                case 4:

                    System.out.println(t1.mostraHora());
                    System.out.println(t1.mostraH());

                    break;

                case 5:  System.out.println("=======Saindo========");
                    break;

            }

        }while(op!=5);

    }
}

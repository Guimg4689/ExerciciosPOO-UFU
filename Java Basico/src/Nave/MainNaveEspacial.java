package Nave;

import ExTempo.Tempo;

import java.util.Scanner;

public class MainNaveEspacial {
    public static void main(String[] args) {

        NaveEspacial[] naves = new NaveEspacial[5];
        int id = 0;
        Scanner sc = new Scanner(System.in);
        int op = 1;

        do {


            System.out.println("1 - Cria Nave: ");
            System.out.println("2 - Ligar Nave: ");
            System.out.println("3 - Desligar Nave: ");
            System.out.println("4 - Mostrar Naves: ");
            System.out.println("5 - Nave Mais Rapida: ");
            System.out.println("6 - Sair: ");

            System.out.println("Digite uma das opcoes abaixo: ");
            op = sc.nextInt();
            switch (op) {
                case 1:

                    System.out.println("Digite o nome da Nave:");
                    String h = sc.next();
                    naves[id] = new NaveEspacial(h);
                    id++;

                    break;

                case 2:
                   int cont = 0;
                    if(id > 2){
                        for(int i = 0;i < id;i++){
                            if(naves[i].getVelocidade() > 0){
                                cont++;
                            }
                        }
                        if(cont > 3){
                            System.out.println("SuperPopulação de Naves");
                            break;
                        }
                    }
                    System.out.println("Digite o numero da nave as ser ligada: ");
                    int o = sc.nextInt();
                    naves[o].ligaNave();

                    break;
                case 3:
                    System.out.println("Digite o numero da nave as ser Desligada: ");
                    int k = sc.nextInt();
                    naves[k].desligaNave();
                    break;

                case 4:

                    for (int i = 0; i < id; i++) System.out.println(" nave " + i + ": " + naves[i].mostraNave());
                    break;

                case 5:
                    System.out.println("Digite numero da primeira nave:");
                    int n1 = sc.nextInt();
                    System.out.println("Digite numero da segunda nave:");
                    int n2 = sc.nextInt();

                    if(naves[n1].naveMaisRapida(naves[n2])){
                        System.out.println("Nave" + n1 + " é mais rapida!");
                    }else{
                        System.out.println("Nave" + n2 + " é mais rapida!");
                    }


                    break;


                case 6:
                    System.out.println("=======Saindo========");
                    break;

            }

        } while (op != 6);

    }
}


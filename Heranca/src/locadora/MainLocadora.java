package locadora;

import java.util.Scanner;

public class MainLocadora {
    public static void main(String[] args) {
        Dvd[] dvds = new Dvd[5];
        Cds[] cds = new Cds[5];
        Fita[] fita = new Fita[5];
        Scanner sc = new Scanner(System.in);
        int c1, c2, c3, op;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        op = 1;

        while (op != 5) {
            System.out.println("Digite uma das opcoes: \n");
            System.out.println("1 - Inserir Cd: ");
            System.out.println("2 - Inserir DvD: ");
            System.out.println("3 - Inserir Fita");
            System.out.println("4 - Mostrar Produtos:");
            System.out.println("5 - Sair ");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o nome : ");
                    String n = sc.next();
                    System.out.println("Digite o tipo: ");
                    String r = sc.next();
                    System.out.println("Digite o genero: ");
                    String s = sc.next();
                    System.out.println("Digite o Preco da Locacao: ");
                    double t = sc.nextDouble();
                    System.out.println("Digite o nome do cantor:");
                    String h = sc.next();
                    System.out.println("Digite a quantidade de faixas:");
                    int j = sc.nextInt();


                    cds[c1] = new Cds(n, r, s, t, h, j);
                    c1++;
                    break;
                case 2:
                    System.out.println("Digite o nome : ");
                    n = sc.next();
                    System.out.println("Digite o tipo: ");
                    r = sc.next();
                    System.out.println("Digite o genero: ");
                    s = sc.next();
                    System.out.println("Digite o Preco da Locacao: ");
                    t = sc.nextDouble();
                    System.out.println("Digite a quantidade de atores :");
                    int at = sc.nextInt();
                    String[]atores = new String[at];
                    for(int i = 0; i < at;i++){
                        h = sc.next();
                        atores[i] = h;
                    }
                    System.out.println("Digite o nome do Diretor:");
                    String sv = sc.next();
                    System.out.println("Tempo de Duração: ");
                    int td = sc.nextInt();

                    dvds[c2] = new Dvd(n,r,s,t,atores,sv,td);
                    c2++;
                    break;


                case 3:
                    System.out.println("Digite o nome : ");
                    n = sc.next();
                    System.out.println("Digite o tipo: ");
                    r = sc.next();
                    System.out.println("Digite o genero: ");
                    s = sc.next();
                    System.out.println("Digite o Preco da Locacao: ");
                    t = sc.nextDouble();
                    System.out.println("Ela e Rebobinada? ");
                    boolean choice = sc.nextBoolean();


                    fita[c3] = new Fita(n, r, s, t,choice);
                    c3++;
                    break;



                case 4:
                    for(int i = 0;i<c1;i++){
                        System.out.println("======================\nCds\n======================");
                        System.out.println(cds[i].mostraDados());
                    }
                    for(int i = 0;i<c2;i++){
                        System.out.println("======================\n DvDs\n======================");
                        System.out.println(dvds[i].mostraDados());

                    }
                    for(int i = 0;i<c3;i++){
                        System.out.println("======================\nFita\n======================");
                        System.out.println(fita[i].mostradados());
                    }

                    break;
                case 5:
                    System.out.println("Saindo");


            }

        }
    }
}

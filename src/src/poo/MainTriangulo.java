package poo;

import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {
        Triangulo[] vet = new Triangulo[10];
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        int op = 1;


        do {
            System.out.println("Escolha a opcao");
            System.out.println("1-Inserir Triangulo");
            System.out.println("2-Mostrar Triangulos");
            System.out.println("3-Triangulos Equilateros");
            System.out.println("4-Maior perimetro");
            System.out.println("5-Sair");
            System.out.println("Digite alguma opcao: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    int a, b, c;
                    System.out.println("Digite o Valor do lado1: ");
                    a = leitor.nextInt();
                    System.out.println("Digite o Valor do lado2: ");
                    b = leitor.nextInt();
                    System.out.println("Digite o Valor do lado3: ");
                    c = leitor.nextInt();

                    vet[i] = new Triangulo(a, b, c);
                    i++;
                    break;
                case 2:
                    for(int k = 0;k < i;k++){
                        System.out.println("lados: " + vet[k].l1+ "," + vet[k].l2 + "," + vet[k].l3);
                    }
                    break;
                case 3:
                    int quant = 0;
                    for(int k = 0;k < i;k++){
                        if ((vet[k].tipoTriangulo() == "equilatero")){
                            quant++;
                        }
                    }
                    System.out.println("O numero de triangulos equilateros são: " + quant);
                    break;
                case 4:
                    int maxperimetro = 0;
                    int id = 0;
                    for(int k = 0;k < i;k++){
                        if (maxperimetro < vet[k].perimetro()){
                            maxperimetro = vet[k].perimetro();
                            id = k;
                        }
                    }
                    System.out.println("Maior perimetro: " + maxperimetro + " id: " + id);
                    break;
                case 5:
                    op = 0;
            }
        } while (op > 0);
    }
}

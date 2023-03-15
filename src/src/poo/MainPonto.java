package poo;

import java.util.Scanner;

public class MainPonto {
    public static void main(String[] args) {
        Ponto x1 = new Ponto();
        Ponto x2 = new Ponto();
        int x,y,k,z;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o x do primeiro ponto: ");
        x = s.nextInt();
        System.out.println("Digite o y do primeiro ponto: ");
        y= s.nextInt();
        System.out.println("Digite o x do segundo ponto: ");
        k= s.nextInt();
        System.out.println("Digite o y do segundo ponto: ");
        z = s.nextInt();

        x1.addPonto(x,y);
        x2.addPonto(k,z);

        System.out.println("A distancia euclediana entre os pontos sao de: " + x1.distanciaPontos(x1,x2));



    }
}

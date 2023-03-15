package poo;

import java.util.Scanner;

public class Soma {
    int x,y;


    static int somar(int x,int y){
        return x + y;
    }

    public static void main(String[] args) {
        int a ,b, somatorio;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = s.nextInt();
        System.out.println("Digite o valor de b: ");
        b = s.nextInt();
        System.out.println("Somatorio =  " + somar(a,b));

    }

}

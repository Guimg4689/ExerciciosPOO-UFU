package poo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a,b,c;
        int d;
        Cliente novo = new Cliente();

        System.out.println("Digite seu nome: ");
        a = s.next();
        System.out.println("Digite seu cpf: ");
        b = s.next();
        System.out.println("Digite sua idade: ");
        d = s.nextInt();
        System.out.println("Digite seu telefone: ");
        c = s.next();

        novo.cadastraCliente(a,b,d,c);
        novo.mostraCliente();

    }
}

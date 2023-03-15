package poo;

public class Triangulo {
    int l1,l2,l3;

    public Triangulo(int a, int b, int c) {
        this.l1 = a;
        this.l2 = b;
        this.l3 = c;
    }





    int setlado1(){
        return l1;
    }
    int setlado2(){
        return l2;
    }
    int setlado3(){
        return l3;
    }

    int mudaladol1(int troca){
        l1 = troca;
        return l1;
    }

    int mudaladol2(int troca){
        l2 = troca;
        return l1;
    }
    int mudaladol3(int troca){
        l3 = troca;
        return l1;
    }
    int perimetro(){
        return l1 + l2 + l3;
    }

    String tipoTriangulo(){
        if(l1 == l2 && l1 == l3)return "equilatero";
        else if (l1==l2 || l1 == l3 || l2 == l3) {
          return "isoceles";
        }else {
            return "escaleno";
        }
    }


}

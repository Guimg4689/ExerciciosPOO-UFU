package poo;
import java.lang.Math;
public class Ponto {
    int x,y;


   void addPonto(int n,int k){
       this.x = n;
       this.y = k;

   }


    double distanciaPontos(Ponto a,Ponto b){
        double distancia = (Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y),2));
        distancia = Math.sqrt(distancia);

        return distancia;
    }

}

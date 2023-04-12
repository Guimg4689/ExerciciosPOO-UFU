package ExTempo;

public class Tempo {
    private int hora,minuto,segundo;
    public Tempo(){
        setHora(0);
        setMinuto(0);
        setSegundo(0);
    }


    public Tempo(int hora) {
       setHora(hora);
       setMinuto(0);
       setSegundo(0);
    }
    public Tempo(int hora,int minuto) {
       setHora(hora);
       setMinuto(minuto);
       setSegundo(0);
    }


    public Tempo(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora > 23){
            this.hora = 0;
        }else{
            this.hora = hora;
        }

    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto > 59){
            this.minuto = 0;
        }else{
            this.minuto =minuto;}
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo > 59 || segundo < 0){
            this.segundo = 0;
        }else{
            this.segundo = segundo;}
    }
    public String mostraHora(){
        return "Horario:" + hora + minuto + segundo + "";
    }
    public String mostraH(){
        String horario;
        if(getHora() > 12) {
            horario = "PM";
        }else {
            horario = "AM";
        }
        return "Horario:" + hora + ":" + minuto + ":" + segundo +" " + horario;
    }

    public void incrementa(int h){
        this.minuto+=h;
        if (this.minuto > 59) {
            setMinuto(0);
            setHora(hora+=1);
            setSegundo(0);
            if (this.hora > 24)setHora(0);
        }
    }

    public void decrementa(int d){
        this.minuto-=d;
        if (this.minuto < 0){
            setHora(hora-=1);
            setMinuto(59);
            setSegundo(0);
        }

    }


}



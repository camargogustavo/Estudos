package OrientacaoObjeto.facil.domain;

public class Lampada {
    private boolean lampada;

    public void ligada(){
        this.lampada = true;
    }
    public void desligada(){
        this.lampada = false;
    }

    public void imprime(){
        if (lampada){
            System.out.println("Lampada ligada");
        }else{
            System.out.println("Lampada desligada");
        }
    }
}

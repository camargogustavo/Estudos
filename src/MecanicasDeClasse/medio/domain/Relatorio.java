package MecanicasDeClasse.medio.domain;

public class Relatorio {
    public void exibir(){
        System.out.println("Exibir Relatorio Geral ");
    }
    public void exibir(String titulo){
        System.out.println("Relatório: "+titulo);
    }

    public void exibir(String titulo, int paginas){
        System.out.println("Relatório: "+titulo+ "| Total de Paginas "+paginas);
    }
}

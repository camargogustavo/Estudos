package Associacao.dificil.domain;

public class Professor {
    private String nome;
    private Seminario[] seminarios;

    public void imprimeRelatori() {
        //Professor
        System.out.println("Relatorio do Professor");
        //Verifico se nome esta null
        if (nome == null){
            System.out.println("Variavel nome esta null");
            return;
        } else {
        System.out.println("Nome do Professor: "+this.nome);}

        //Verifico se seminairo esta null
        if (this.seminarios == null || this.seminarios.length == 0){
            System.out.println("Variavel seminario esta null");
            return;
        }

        for (Seminario seminarioImprime : seminarios){
            if (seminarioImprime == null) continue;
            System.out.println("Nome do Seminario: "+seminarioImprime.getNome());
            //verifico se existe local
            if (seminarioImprime.getLocal() != null && seminarioImprime.getLocal().getEndereco() != null){
                System.out.println("Endereço: "+seminarioImprime.getLocal().getEndereco());
            } else {
                System.out.println("Ainda não foi definido o endereço ou o local.");
            }
            //Onde imprime os alunos participantes
            if (seminarioImprime.getAlunos() != null && seminarioImprime.getAlunos().length > 0){
                System.out.println("Alunos Participantes");
                for (Aluno aluno : seminarioImprime.getAlunos()){
                    System.out.println("Nome Aluno:"+aluno.getNome());
                }
                System.out.println("----");
            } else {
                System.out.println("Nenhum aluno foi inscrito");
            }
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}

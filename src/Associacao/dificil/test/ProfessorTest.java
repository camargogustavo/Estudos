package Associacao.dificil.test;

import Associacao.dificil.domain.Aluno;
import Associacao.dificil.domain.Local;
import Associacao.dificil.domain.Professor;
import Associacao.dificil.domain.Seminario;

public class ProfessorTest {
    public static void main(String[] args) {
        Local local = new Local();
        Local local2 = new Local();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Seminario seminario1 = new Seminario();
        Seminario seminario2 = new Seminario();
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        local.setEndereco("SESI");
        local2.setEndereco("SENAI");

        aluno1.setNome("Gustavo");
        aluno2.setNome("Alana");
        aluno3.setNome("Fumaca");
        aluno4.setNome("Faisca");

        seminario1.setNome("MaratonandoJava");
        seminario2.setNome("Spring Boot");

        professor1.setNome("William");
        professor2.setNome("Andre");

        seminario1.setLocal(local);
        seminario2.setLocal(local2);

        Aluno[] alunosArray = {aluno1, aluno2, aluno3, aluno4};
        seminario1.setAlunos(alunosArray);
        seminario2.setAlunos(alunosArray);
        Seminario[] listaSeminarios = {seminario1,seminario2};
        professor1.setSeminarios(listaSeminarios);
        professor2.setSeminarios(listaSeminarios);
        professor1.imprimeRelatori();


    }
}

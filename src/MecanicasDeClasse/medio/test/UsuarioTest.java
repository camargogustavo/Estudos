package MecanicasDeClasse.medio.test;

import MecanicasDeClasse.medio.domain.Usuario;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Gustavo","123@gmail.com","123");
        usuario.imprime();
    }
}

import java.util.Scanner;

public class UsuarioTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Defina o login: ");
        String loginDefinido = s.next();
        System.out.println("Defina a senha: ");
        String senhaDefinida = s.next();

        Usuario usuario = new Usuario(loginDefinido, senhaDefinida);

        while (usuario.getTentativas() < 3){

            System.out.println("\nDigite o login definido: ");
            String loginTentativa = s.next();
            System.out.println("Digite a senha definida: ");
            String senhaTentativa = s.next();
            usuario.autenticar(loginTentativa, senhaTentativa);
        }
    }
}


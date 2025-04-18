public class Aplicacao{
    public static void main(String[] args) {
        Teclado t = new Teclado();

        String senhaCorreta = t.leString("Defina a senha: ");
        VerificadorSenha verificador = new VerificadorSenha(senhaCorreta);

        for (int i = 0; i < 3; i++) {
            String tentativa = t.leString("Digite a senha: ");

            boolean correta = verificador.verificarSenha(tentativa);

            if (!correta) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Senha correta! Acesso Permitido.");
            }
        }
    }
}
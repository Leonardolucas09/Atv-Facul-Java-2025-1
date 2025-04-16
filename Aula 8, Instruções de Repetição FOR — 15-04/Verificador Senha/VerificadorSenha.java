public class VerificadorSenha {
    private String senha;
    private int tentativasErro = 0;

    public boolean verificarSenha(String senhaDigitada) {
        if (senhaDigitada == senha){
            return true;
        } else {
            return false;
            tentativasErro += 1;
        }
        //se senhaDigitada = senhaArmazenada, retorna true
        //senão, incrementa a quantidade de erros e retorna false.
    }
}

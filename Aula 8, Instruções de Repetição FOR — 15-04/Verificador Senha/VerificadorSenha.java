public class VerificadorSenha {
    private String senha;
    private int tentativasErro = 0;

    public VerificadorSenha(String senha) {
        this.senha = senha;
    }

    public boolean verificarSenha(String senhaDigitada) {
        if (tentativasErro >= 3){
            System.out.println("Senha bloqueada");
            return false;
        } 
        
        if (senha.equals(senhaDigitada)) {
            tentativasErro = 0;
            return true;
        } else {
            tentativasErro++;
            if (tentativasErro == 3) {
                System.out.println("Senha bloqueada");
            }
            return false;
        }
        //se senhaDigitada = senhaArmazenada, retorna true
        //senão, incrementa a quantidade de erros e retorna false.
    }
}

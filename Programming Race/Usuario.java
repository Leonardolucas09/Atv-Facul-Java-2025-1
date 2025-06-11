import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    private String login;
    private String senhaHash;
    private int tentativas = 0;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senhaHash = gerarHash(senha);
    }

    public int getTentativas() {
        return tentativas;
    }

    public boolean autenticar(String login, String senha) {
        if (gerarHash(senha).equals(this.senhaHash) && login.equals(this.login) && tentativas < 3){
            
            System.out.println("Olá usuário!");
            return true;
            
        } else {
            tentativas++;
            if (tentativas >= 3) {
                System.out.println("Conta bloqueada.");
            } else {
                System.out.println("Falha.");
            }
            return false;
        }
    }

    private String gerarHash(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(senha.getBytes());
            StringBuilder hexString = new StringBuilder();
            
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }   
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

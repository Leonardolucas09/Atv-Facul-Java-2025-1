public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Geralt de Rívia", "geraltderivia7@gmail.com");
        Data dn = new Data(5, 2, 1023);
        
        p.setDataNascimento(dn); //Atribuindo a data de nascimento de "dn" ao objeto "p" de pessoa.

        System.out.println("Nome: " + p.getNome());
        System.out.println("E-mail: " + p.getEmail());
        System.out.print("Data de Nascimento: ");
        p.getDataNascimento().escreveData();
    }
}

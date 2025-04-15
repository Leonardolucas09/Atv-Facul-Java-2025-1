public class LerCodigo {
    public static void main(String[] args) {
        LerCodigo cd = new LerCodigo();
        int codigoValido = cd.lerCodigo();
        System.out.println("Código válido informado: " + codigoValido);
    }
    
    public int lerCodigo() {
        Teclado t = new Teclado();
        int codigo;

        do{
            codigo = t.leInt("Digite um código válido (maior ou igual a 10 ou igual a 99)");
            if (codigo > 99 || codigo < 10){
                System.out.println("Opa! Esse não é um código válido");
            }
        } while (codigo > 99 || codigo < 10);
        
        return codigo;
    }
}

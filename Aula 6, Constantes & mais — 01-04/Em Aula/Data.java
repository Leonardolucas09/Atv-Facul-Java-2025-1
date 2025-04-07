public class Data {
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void escreveData() {
        System.out.printf("%02d/%02d/%04d%n", this.dia, this.mes, this.ano);
    }

    public boolean equals(Data data){
        return this.dia == data.dia && this.mes == data.mes && this.ano == data.ano;
    }

    public boolean ehBissexto() {
        //Necessário terminar em 00, ser divisível por 400
        //Outros anos: divisível por 4
        if (ano % 100 == 0 && ano % 100 != 0) {
            return true;
        } 
        
        else if (ano % 400 == 0) {
            return true;
        }

        return false;
        
    }
}

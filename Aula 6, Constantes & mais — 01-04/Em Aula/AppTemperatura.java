public class AppTemperatura {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        System.out.println("Digite 'C' se deseja converter uma temperatura em graus Celsius ou que informe 'F' se a conversão é para Fahrenheit.");
        String escolha = t.leString("Faça sua escolha... ");

        // ConversorTemperatura ct = new ConversorTemperatura();

        if (escolha.equalsIgnoreCase("C")) {
            double tempF = t.leDouble("\nInforme a temperatura atual em Celsius: ");
            // ct.celsiusParaFahrenheit(tempF);
            System.out.println("A conversão é: " + String.format("%.2f", tempF) + " °F");
        } 

        else if (escolha.equalsIgnoreCase("F")) {   
            double tempC = t.leDouble("\nInforme a temperatura atual em Fahrenheit: ");
            // ct.fahrenheitParaCelsius(tempC);
            System.out.println("A conversão é: " + String.format("%.2f", tempC) + " °C");
        } else {
            System.out.println("Nenhuma das suas escolhas é válida.");
        }
    }
}

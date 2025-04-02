public class ConversorTemperatura {
    
    public static double celsiusParaFahrenheit(double temperatura) {
        return temperatura * 1.8 + 32;
    }

    public static double fahrenheitParaCelsius(double temperatura) {
        return (temperatura - 32)/9 * 5;
    }

}
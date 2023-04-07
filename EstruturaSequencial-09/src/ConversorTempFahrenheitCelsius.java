import java.util.Scanner;

public class ConversorTempFahrenheitCelsius {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a temperatura em graus Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble(); // Lê a temperatura em graus Fahrenheit digitada pelo usuário

        // Calcular a temperatura em graus Celsius
        double temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9); // Fórmula de conversão de Fahrenheit para Celsius: C = 5 * ((F-32) / 9)

        // Exibir a temperatura em graus Celsius
        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);

        // Fechar o objeto Scanner
        scanner.close();
    }
}

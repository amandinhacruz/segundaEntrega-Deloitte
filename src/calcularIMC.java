import java.util.Scanner;

public class calcularIMC {
    public static void main (String[] arg) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        double altura = leia.nextDouble();

        System.out.println("Informa seu peso: ");
        double peso = leia.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f", imc );
    }
}

import java.util.Scanner;

public class Exemplos {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Ler a media da cp, gs, challenge
        System.out.println("Insira a media da cp:");
        float cp = scanner.nextFloat();

        System.out.println("Insira a media da gs:");
        float gs = scanner.nextFloat();

        System.out.println("Insira a media do challenge:");
        float challenge = scanner.nextFloat();

        //Calcular a media
        double media = cp * 0.2 + gs * 0.6 + challenge * 0.2;


        //Exibir a media
        System.out.println("A media final é " + media);
    }
}

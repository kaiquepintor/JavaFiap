// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String marca = "Volks";
        marca = "Tesla";

        //comparar string
        String churros = "Chocolate";
        String churros2 = new String("chocolate");
        //comparar se as string são iguais, não considerando maiusculas e minusculas
        if (churros.equalsIgnoreCase(churros2)) {
            System.out.println("Churros iguais");
        } else {
            System.out.println("Churros diferentes");
        }


    }
}
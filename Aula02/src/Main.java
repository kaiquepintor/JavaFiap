// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Criar um objeto para representar um cachorro
        Cachorro dogBelga = new Cachorro();
        //Atribuir valores aos atributos do objeto
        dogBelga.nome = "Spike";
        dogBelga.peso = 12.3f;
        dogBelga.idade = 11;
        dogBelga.castrado = true;

        //Exibir os dados do objeto cachorro
        System.out.println(dogBelga.nome + ", \ntem  " + dogBelga.idade + " anos, " + " \npeso " + dogBelga.peso + "Kg e \né castrado?" + dogBelga.castrado);
        dogBelga.andar();

        //Criar um outro objeto cahorro
        Cachorro dogFrances = new Cachorro();

        //Atribuir outros valores
        dogFrances.nome = "Luna";
        dogFrances.peso = 13.0f;
        dogFrances.idade = 8;
        dogFrances.castrado = true;

        //Exibir os valores do outro objeto
        System.out.println(dogFrances.nome + ", tem " + dogFrances.idade + " anos, " + " \npeso " + dogFrances.peso + "Kg e \né castrado?" + dogFrances.castrado);
        dogFrances.andar();

        //Chamar os metodos
       dogBelga.andar();
    }


}
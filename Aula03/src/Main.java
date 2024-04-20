import br.com.fiap.tds.model.Carro;

public class Main {
    public static void main(String[] args) {
        //Instanciar um Carro
        Carro polo = new Carro();
        polo.setPlaca("KKL3C12");
        polo.setCor("Chumbo");
        polo.setModelo("VW");

        //Exibir os valores do modelo, placa e cor
        System.out.println(polo.getPlaca() + " " + polo.getCor() + " " + polo.getModelo());





    }
}
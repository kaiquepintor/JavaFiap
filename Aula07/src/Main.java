import br.com.fiap.lavanderia.model.Cliente;
import br.com.fiap.lavanderia.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        //Instanciar um funcionario
        Funcionario funcionario = new Funcionario();

        //Instanciar um cliente
        Cliente cliente = new Cliente();

        //Setar o nome e cargo do funcionario
        funcionario.setNome("Jorge");
        funcionario.setCargo("Assistente técnico");

        //Setar o nome de assinante do cliente
        cliente.setNome("Kaique");
        cliente.setAssinante(true);

        System.out.println(cliente.getNome());
        cliente.pagar(10);


    }
}
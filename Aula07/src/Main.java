import br.com.fiap.lavanderia.model.Cliente;
import br.com.fiap.lavanderia.model.Endereco;
import br.com.fiap.lavanderia.model.Funcionario;
import br.com.fiap.lavanderia.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        //Instanciando um endereço
        Endereco endereco = new Endereco();

        //Instanciar um funcionario
        Funcionario funcionario = new Funcionario("Pedro", "12.554.545-87", 1, endereco, "Atendente", 3000);

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
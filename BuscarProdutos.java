import java.util.ArrayList;
import java.util.Scanner;

public class BuscarProdutos extends OperacaoMenu{
    public BuscarProdutos(ArrayList<Produtos> produtos) {
        super(produtos);
    }

    public void executar (){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome, o código ou o valor do produto que deseja encontrar:");
        String item = scanner.nextLine();
        boolean encontrado = false;

        for (Produtos produto : produtos) {
            // Convertendo os atributos para String para comparação
            String nome = produto.getNome();
            String codigo = String.valueOf(produto.getCodigo());
            String valor = String.valueOf(produto.getValor());

            // Verifica se o item corresponde a algum dos atributos
            if (nome.equalsIgnoreCase(item) || codigo.equals(item) || valor.equals(item)) {
                System.out.println(produto);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum produto encontrado com o critério informado.");
        }
    }
}

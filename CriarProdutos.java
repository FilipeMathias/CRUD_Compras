import java.util.ArrayList;
import java.util.Scanner;

public class CriarProdutos extends OperacaoMenu{
    public CriarProdutos(ArrayList<Produtos> produtos) {
        super(produtos);
    }
    @Override
    public void executar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do produto");
        String nome = scanner.nextLine();
        System.out.println("Informe o código do produto");
        String codigo = scanner.nextLine();
        System.out.println("Informe o valor do produto");
        int valor = scanner.nextInt();
        produtos.add(new Produtos(nome, codigo, valor));
    }

}

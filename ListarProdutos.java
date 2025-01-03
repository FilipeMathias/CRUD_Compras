import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ListarProdutos extends OperacaoMenu{
    public ListarProdutos(ArrayList<Produtos> produtos) {
        super(produtos);
    }

    public void executar (){

        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        while (escolha != 4) {

            System.out.println("Informe o método de listagem do produto");
            System.out.println("1 - Para listagem por nome");
            System.out.println("2 - Para listagem por código");
            System.out.println("3 - Para listagem por valor");
            System.out.println("4 - Finalizar listagem");

            escolha = scanner.nextInt();


        if (escolha == 1) {
            produtos.sort(Comparator.comparing(Produtos::getNome));
            System.out.println("Lista ordenada pelos nomes dos produtos:");
            produtos.forEach(System.out::println);
        } else if (escolha == 2) {
            produtos.sort(Comparator.comparing(Produtos::getCodigo));
            System.out.println("Lista ordenada pelos códigos dos produtos:");
            produtos.forEach(System.out::println);
        } else if (escolha == 3) {
            produtos.sort(Comparator.comparing(Produtos::getValor));
            System.out.println("Lista ordenada pelos valores dos produtos:");
            produtos.forEach(System.out::println);
        }


        }

    }

}

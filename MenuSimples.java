import java.util.ArrayList;
import java.util.Scanner;

public class MenuSimples {
    public static void main(String[] args) {
        ArrayList<Produtos> produtos = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n--- Menu CRUD ---");
                System.out.println("1. Criar Produtos");
                System.out.println("2. Listar Produtos");
                System.out.println("3. Buscar Produtos");
                System.out.println("4. Alterar Produtos");
                System.out.println("5. Comprar produtos");
                System.out.println("6. Sair");
                System.out.print("Escolha uma opção: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    scanner.next(); // Consome a entrada inválida
                }

                opcao = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha

                OperacaoMenu operacao;

                switch (opcao) {
                    case 1:
                        operacao = new CriarProdutos(produtos);
                        break;
                    case 2:
                        operacao = new ListarProdutos(produtos);
                        break;
                    case 3:
                        operacao = new BuscarProdutos(produtos);
                        break;
                    case 4:
                        operacao = new AlterarProdutos(produtos);
                        break;
                    case 5:
                        operacao = new ComprarProdutos(produtos);
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        continue;
                    default:
                        System.out.println("Opção inválida.");
                        continue;
                }

                operacao.executar();

            } while (opcao != 6);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

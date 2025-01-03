import java.util.ArrayList;
import java.util.Scanner;

public class AlterarProdutos extends OperacaoMenu {
    public AlterarProdutos(ArrayList<Produtos> produtos) {
        super(produtos);
    }

    public void executar() {
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        while (escolha != 4) {
            System.out.println("Escolha uma das opções abaixo ou digite 4 para sair:");
            System.out.println("1 - Modificar nome do produto.");
            System.out.println("2 - Modificar valor do produto.");
            System.out.println("3 - Excluir produto.");

            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            switch (escolha) {
                case 1: // Modificar nome
                    System.out.println("Informe o código do produto que deseja modificar o nome:");
                    String codigoINome = scanner.nextLine();

                    boolean produtoEncontrado = false;
                    for (Produtos produto : produtos) {
                        if (String.valueOf(produto.getCodigo()).equals(codigoINome)) {
                            System.out.println("Informe o novo nome:");
                            String novoNome = scanner.nextLine();
                            produto.setNome(novoNome); // Chamada correta do método
                            System.out.println("Produto alterado com sucesso:");
                            System.out.println(produto);
                            produtoEncontrado = true;
                            break; // Sai do loop, pois o produto foi encontrado
                        }
                    }

                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 2: // Modificar valor
                    System.out.println("Informe o código do produto que deseja modificar o valor:");
                    String codigoValor = scanner.nextLine();

                    produtoEncontrado = false;
                    for (Produtos produto : produtos) {
                        if (String.valueOf(produto.getCodigo()).equals(codigoValor)) {
                            System.out.println("Informe o novo valor:");
                            int novoValor = scanner.nextInt();
                            scanner.nextLine(); // Limpa o buffer de entrada
                            produto.setValor(novoValor); // Chamada correta do método
                            System.out.println("Produto alterado com sucesso:");
                            System.out.println(produto);
                            produtoEncontrado = true;
                            break;
                        }
                    }

                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3: // Excluir produto
                    System.out.println("Informe o código do produto que deseja excluir:");
                    String codigoExcluir = scanner.nextLine();

                    produtoEncontrado = false;
                    for (Produtos produto : produtos) {
                        if (String.valueOf(produto.getCodigo()).equals(codigoExcluir)) {
                            produtos.remove(produto);
                            System.out.println("Produto removido com sucesso:");
                            System.out.println(produto);
                            produtoEncontrado = true;
                            break;
                        }
                    }

                    if (!produtoEncontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4: // Sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}

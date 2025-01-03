import java.util.ArrayList;
import java.util.Scanner;

public class ComprarProdutos extends OperacaoMenu{
    private int valorFinal;
    private int opcao;
    private int escolha;
    private ArrayList<Produtos>listaDeCompras = new ArrayList<>();
    public ComprarProdutos(ArrayList<Produtos> produtos) {
        super(produtos);
    }

    @Override
    public void executar() {

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua){
            System.out.println("Informe o código do produto que deseja comprar");
            String codigoCompra = scanner.nextLine();
            for(Produtos produto: produtos){
                String codigoCatalogo = produto.getCodigo();
                if(codigoCompra.equals(codigoCatalogo)){
                    System.out.println(produto);
                    System.out.println("Digite 1 para confirmar inclusão do produto acimda na lista de compras ");
                    escolha = scanner.nextInt();
                    if(escolha==1){
                        listaDeCompras.add(produto);
                        valorFinal += produto.getValor();
                        System.out.println("Compra incluída com sucesso!");
                    } else {
                        System.out.println("Compra descartada");
                    }
                }
            }
            System.out.println("Digite 1 para continuar comprando ou 2 para encerrar");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao==1){
                continua = true;
            } else if (opcao ==2){
                continua = false;
            }
        }

        System.out.println("Produtos selicionados para compra");
        for(Produtos lista: listaDeCompras){
            System.out.println(lista);
        }
        System.out.println("Total do valor da compra");
        System.out.println(valorFinal);

    }
}

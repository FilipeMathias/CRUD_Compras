public class Produtos {
    private String nome;
    private String codigo;
    private int valor;

    public Produtos(String nome, String codigo, int valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String toString(){
        return " Código:  "+ codigo +";" + "Produto: " + nome + ";" +  " Valor: R$ " + valor;

    }


    public String split(String s) {
        return nome + codigo + valor;
    }
}

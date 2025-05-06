public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double aplicarDesconto(double preco, double desconto) {
        return preco * ( 1 - desconto  / 100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public static void main (String [] arg){
        Produto produto = new Produto("Tv", 3500.00, 15);

        double promocao = produto.aplicarDesconto(produto.getPreco(), produto.getDesconto());
        System.out.printf("%.2f" ,promocao);
    }

}

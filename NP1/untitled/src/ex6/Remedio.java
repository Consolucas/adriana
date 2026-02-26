package ex6;

public class Remedio {

    private String nome;
    private int quantidadeEmEstoque;
    private double valor;

    public Remedio() {
    }

    public Remedio(String nome, int quantidadeEmEstoque, double valor) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void adicionarRemedio(int quantidade){
        setQuantidadeEmEstoque(quantidadeEmEstoque + quantidade);
    }


}

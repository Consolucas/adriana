package ex6;

public class Main {

    static void main(String[] args) {

        Remedio remedio = new Remedio("Paracetamol", 1, 10.0);
        remedio.adicionarRemedio(10);

        System.out.println(remedio.getQuantidadeEmEstoque());


    }
}

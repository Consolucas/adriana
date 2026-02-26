import java.util.Scanner;

/*
Na empresa em que trabalhamos, há tabelas com o gasto de cada
mês. Para fechar o balanço do primeiro trimestre, precisamos somar
o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em
fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa
que calcule e imprima a despesa total no trimestre e a média mensal
de gastos.
 */
public class Ex4 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor = 0;

        for (int i = 0; i <= 2; i++) {
            int mes = scan.nextInt();
            valor += mes;
        }
        System.out.println(valor);
        scan.close();
    }
}
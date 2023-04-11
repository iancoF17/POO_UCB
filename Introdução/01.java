import java.util.Scanner;

public class App {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Digite a quantidade de carros vendidos: ");
    int qtdeCarrosVendidos = input.nextInt();
    
    System.out.println("Digite o valor total de vendas: ");
    double totalVendas = input.nextDouble();

   System.out.println("Digite o salário fixo do vendedor: ");
    double salario = input.nextDouble();

    System.out.println("Digite o valor recebido por carro vendido: ");
    double comissao = input.nextDouble();

    double comissaoPorCarro =  qtdeCarrosVendidos * comissao;
    double comissaoPorVenda = 0.05 * totalVendas;
    double salarioFinal = salario + comissaoPorCarro + comissaoPorVenda;

    System.out.println("Salário final do vendedor: R$" + salarioFinal);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
       //receber dados do teclado
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite o nome: ");
       String nome = sc.nextLine();
       System.out.println("Digite a idade: ");
       int idade = sc.nextInt();
       System.out.println("Digite o salario");
       double salario = sc.nextDouble();
               
       System.out.println("Nome digitado: " +nome
                           +"\nIdade: "+idade
                            +"\nSalario: "+salario); 
    } 
}

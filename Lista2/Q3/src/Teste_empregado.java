public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Jorge");
        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(3500.0);
        empregado.setImposto(10.0);
      
        double salarioLiquido = empregado.calcularSalario();
      
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salario Liquido: R$" + salarioLiquido);
    }
}

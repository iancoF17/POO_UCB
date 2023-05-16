public class Vendedor extends Empregado {
    private double valorVendas;
    private int quantidade_vendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int quantidade_vendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.quantidade_vendas = quantidade_vendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQuantidadeVendas() {
        return quantidade_vendas;
    }

    public void setQuantidadeVendas(int quantidade_vendas) {
        this.quantidade_vendas = quantidade_vendas;
    }

    @Override
    public String toString() {
        return "Vendedor: \n" +
                "Nome: " + getNome() + "\n" +
                "Salário: " + getSalario() + "\n" +
                "Valor das vendas: " + getValorVendas() + "\n" +
                "Quantidade de vendas: " + getQuantidadeVendas() + "\n";
    }
}

public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascimento) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Valor da Dívida: " + valorDivida + "\n" +
                "Ano de Nascimento: " + anoNascimento;
    }
}

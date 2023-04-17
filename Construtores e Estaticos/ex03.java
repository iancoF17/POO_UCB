public class Conta {
   private String nomeTitular;
   private int numeroConta;
   private String agencia;
   private double saldo;
   private String dataAbertura;

   public Conta(String nomeTitular, int numeroConta, String agencia, double saldo, String dataAbertura) {
       this.nomeTitular = nomeTitular;
       this.numeroConta = numeroConta;
       this.agencia = agencia;
       this.saldo = saldo;
       this.dataAbertura = dataAbertura;
   }

   public void saca(double valor) {
       this.saldo -= valor;
   }

   public void deposita(double valor) {
       this.saldo += valor;
   }

   public double calculaRendimento() {
       return this.saldo * 0.1;
   }

   // getters e setters para cada atributo

}

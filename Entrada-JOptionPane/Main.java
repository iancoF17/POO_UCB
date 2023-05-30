import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        //recebendo dados com JOptionPane
        
        //entrada texto
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null,"O nome digitado é: " +nome);
        //System.out.println(nome);
        
        
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        int idadeInteira = Integer.parseInt(idade);
        
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade 2"));
        JOptionPane.showMessageDialog(null,"A idade2 digitado é: " +idade2);
    }
    
}

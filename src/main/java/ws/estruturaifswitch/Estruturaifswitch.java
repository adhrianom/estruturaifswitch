//UNISUL IF ELSE SWITCH EXERCICIO 16 (JAVA)
package ws.estruturaifswitch;
import javax.swing.JOptionPane;
public class Estruturaifswitch {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro numero: "));
        int calculadora = Integer.parseInt(JOptionPane.showInputDialog("\n 1- adição \n 2- subtração \n 3- multiplicação \n 4- divisão"));
        int resultado;
        switch (calculadora) {
            case 1:
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                break;
        }
    }
}

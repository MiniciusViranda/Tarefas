import javax.swing.JOptionPane;

public class calculator_imc{
    public static void main(String[] args) {

        // mensagens de entrada
        String Peso = JOptionPane.showInputDialog("Insira o seu peso: ");
        String Altura = JOptionPane.showInputDialog("Insira a sua altura: ");

        // transformação de string para double
        double numPeso = Double.parseDouble(Peso);
        double numAltura = Double.parseDouble(Altura);

        // cálculo
        double imc = (numPeso / (numAltura * numAltura));

        // mensagem de saída
        JOptionPane.showMessageDialog(null, "Seu IMC é de: " + String.format("%.1f", imc), "Resultado do IMC", JOptionPane.PLAIN_MESSAGE);
    }
}

/*ViMO*/
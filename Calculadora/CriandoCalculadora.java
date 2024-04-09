package calculadora;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CriandoCalculadora extends JFrame {
    private final JButton botaoZero;
    private final JButton botaoUm;
    private final JButton botaoDois;
    private final JButton botaoTres;
    private final JButton botaoQuatro;
    private final JButton botaoCinco;
    private final JButton botaoSeis;
    private final JButton botaoSete;
    private final JButton botaoOito;
    private final JButton botaoNove;
    private final JButton botaoMais;
    private final JButton botaoMenos;
    private final JButton botaoDividir;
    private final JButton botaoMultiplicar;
    private final JButton botaoIgual;
    private final JButton botaoLimpar;
    
    private final JTextField campoTexto;
    private String calculo = "";
    double numero1;
    
    public CriandoCalculadora() {
        super("Testando botões");
        setLayout(new FlowLayout());
        
        botaoZero = new JButton("0");
        add(botaoZero);

        botaoUm = new JButton("1");
        add(botaoUm);

        botaoDois = new JButton("2");
        add(botaoDois);
        
        botaoTres = new JButton("3");
        add(botaoTres);
        
        botaoQuatro = new JButton("4");
        add(botaoQuatro);
        
        botaoCinco = new JButton("5");
        add(botaoCinco);
        
        botaoSeis = new JButton("6");
        add(botaoSeis);
        
        botaoSete = new JButton("7");
        add(botaoSete);
        
        botaoOito = new JButton("8");
        add(botaoOito);
        
        botaoNove = new JButton("9");
        add(botaoNove);
        
        botaoMais = new JButton("+");
        add(botaoMais);
        
        botaoMenos = new JButton("-");
        add(botaoMenos);
        
        botaoDividir = new JButton("/");
        add(botaoDividir);
        
        botaoMultiplicar = new JButton("*");
        add(botaoMultiplicar);
        
        botaoIgual = new JButton("=");
        add(botaoIgual);
        
        botaoLimpar = new JButton("C");
        add(botaoLimpar);

        campoTexto = new JTextField(15); 
        campoTexto.setEditable(false);
        add(campoTexto);

        ButtonHandler handler = new ButtonHandler();
        botaoZero.addActionListener(handler);
        botaoUm.addActionListener(handler);
        botaoDois.addActionListener(handler);
        botaoTres.addActionListener(handler);
        botaoQuatro.addActionListener(handler);
        botaoCinco.addActionListener(handler);
        botaoSeis.addActionListener(handler);
        botaoSete.addActionListener(handler);
        botaoOito.addActionListener(handler);
        botaoNove.addActionListener(handler);
        botaoMais.addActionListener(handler);
        botaoMenos.addActionListener(handler);
        botaoMultiplicar.addActionListener(handler);
        botaoDividir.addActionListener(handler);
        botaoIgual.addActionListener(handler);
        botaoLimpar.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
    char operacao;
        
    @Override
        public void actionPerformed(ActionEvent event) {
        String botaoPressionado = event.getActionCommand();
        
        switch (botaoPressionado) {
            case "=":
                calcularResultado();
                break;
            case "C":
                limparCampoTexto();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operacao = botaoPressionado.charAt(0);
                numero1 = Double.parseDouble(campoTexto.getText());
                limparCampoTexto();
                break;
            default:
                calculo += botaoPressionado;
                campoTexto.setText(calculo);
                break;
        }
    }
        
    private void calcularResultado() {
        String resultado = "Erro";
        double numero2 = Double.parseDouble(campoTexto.getText());
        
        switch (operacao) {
            case '+':
                resultado = String.valueOf(numero1 + numero2);
                break;
            case '-':
                resultado = String.valueOf(numero1 - numero2);
                break;
            case '*':
                resultado = String.valueOf(numero1 * numero2);
                break;
            case '/':
                if (numero2 == 0) {
                    resultado = "Erro: Divisão por zero";
                } else {
                    resultado = String.valueOf(numero1 / numero2);
                }
                break;
        }
        campoTexto.setText(resultado);
        calculo = "";
    }
    
    private void limparCampoTexto() {
            calculo = "";
            campoTexto.setText("");
        }

        private Object eval(String calculo) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

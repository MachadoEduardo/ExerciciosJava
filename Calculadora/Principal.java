package calculadora;

import javax.swing.JFrame;

public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CriandoCalculadora frame = new CriandoCalculadora();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

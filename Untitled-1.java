import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JButton");
        JButton button = new JButton("Presionar");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Botón presionado!");
            }
        });

        button.setBounds(50, 100, 150, 30);
        frame.add(button);
        
        frame.setSize(250, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultbots;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

/**
 *
 * @author Ryan
 */
public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton btn;

    public MainFrame() {
        super("Hello World");

        setLayout(new BorderLayout());
        
        textArea = new JTextArea();
        btn = new JButton("Click Me");
        
        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

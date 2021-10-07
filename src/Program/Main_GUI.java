package Program;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main_GUI {
    private JPanel panel1;
    private JButton xButton;

    public Main_GUI() {
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Teste Botão");
            }
        });
    }

    public static void main(String[] args) {
        Note note1 = new Note(1,6);
        Note note2 = new Note(2,6);
        Note note3 = new Note(3,6);
        Note note4 = new Note(4,6);

        ArrayList<String> notas = new ArrayList<String>();
        notas.add("Dó");
        notas.add("Ré");
        notas.add("Mi");
        notas.add("Fa");

        JList<String> displayList = new JList<>(notas.toArray(new String[0]));
        JScrollPane scrollPane = new JScrollPane(displayList);

        JFrame frame = new JFrame("Sonata");
        frame.setContentPane(new Main_GUI().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setSize(800,690);
        frame.setVisible(true);
    }
}

package task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GuiInterface extends JFrame implements ActionListener {
    private int MilanScore = 0;
    private int MadridScore = 0;

    private JLabel scoreLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public GuiInterface() {
        setTitle("Match Results");
        setLayout(new FlowLayout());

        JButton Milan = new JButton("Милан");
        JButton Madrid = new JButton("Мадрид");

        Milan.addActionListener(this);
        Madrid.addActionListener(this);

        scoreLabel = new JLabel("Result: " + MilanScore + " X " + MadridScore);
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        add(Milan);
        add(Madrid);
        add(scoreLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Милан")) {
            MilanScore++;
            lastScorerLabel.setText("Last Scorer: Милан");
        } else if (command.equals("Мадрид")) {
            MadridScore++;
            lastScorerLabel.setText("Last Scorer: Мадрид");
        }

        scoreLabel.setText("Result: " + MilanScore + " X " + MadridScore);
    }

    public static void main(String[] args) {
        new GuiInterface();
    }
}
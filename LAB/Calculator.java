import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener {
    JButton add, sub, mult, div,result,dot;
    JButton but0, but1, but2, but3, but4, but5, but6, but7, but8, but9;
    JButton leftBrace, rightBrace, clearButton, backButton;
    JTextField screenField;
    public static void main(String[] args) {
        Calculator labcCalculator = new Calculator();
        labcCalculator.setVisible(true);
    }

    public Calculator() {
        super("LabCalculator");
        setBounds(500, 200, 300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        JPanel pan1 = new JPanel(null);//new GridLayout(0,1)
        JPanel pan2 = new JPanel(new GridLayout(5, 4));

        screenField = new JTextField(20);
        screenField.setBackground(Color.WHITE);
        screenField.setBounds(0,0,60,60);

        pan1.add(screenField);
        add(pan1);

        leftBrace = new JButton("(");
        leftBrace.addActionListener(this);
        pan2.add(leftBrace);
        
        rightBrace = new JButton(")");
        rightBrace.addActionListener(this);
        pan2.add(rightBrace);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        pan2.add(clearButton);

        backButton = new JButton("X");
        backButton.addActionListener(this);
        pan2.add(backButton);

        but7 = new JButton("7");
        but7.addActionListener(this);
        pan2.add(but7);

        but8 = new JButton("8");
        but8.addActionListener(this);
        pan2.add(but8);

        but9 = new JButton("9");
        but9.addActionListener(this);
        pan2.add(but9);

        div = new JButton("/");
        div.addActionListener(this);
        pan2.add(div);

        but4 = new JButton("4");
        but4.addActionListener(this);
        pan2.add(but4);

        but5 = new JButton("5");
        but5.addActionListener(this);
        pan2.add(but5);

        but6 = new JButton("6");
        but6.addActionListener(this);
        pan2.add(but6);

        mult = new JButton("*");
        mult.addActionListener(this);
        pan2.add(mult);

        but1 = new JButton("1");
        but1.addActionListener(this);
        pan2.add(but1);

        but2 = new JButton("2");
        but2.addActionListener(this);
        pan2.add(but2);

        but3 = new JButton("3");
        but3.addActionListener(this);
        pan2.add(but3);

        sub = new JButton("-");
        sub.addActionListener(this);
        pan2.add(sub);

        dot = new JButton(".");
        dot.addActionListener(this);
        pan2.add(dot);

        but0 = new JButton("0");
        but0.addActionListener(this);
        pan2.add(but0);

        result = new JButton("=");
        result.addActionListener(this);
        pan2.add(result);

        add = new JButton("+");
        add.addActionListener(this);
        pan2.add(add);

        add(pan2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}

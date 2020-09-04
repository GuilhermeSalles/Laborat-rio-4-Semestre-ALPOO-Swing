package LabExercicios.Entidades.dois;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class MinhaJanela05 extends JFrame {
	private static final long serialVersionUID = 1L;

	//Iniciando variavel
	String X = "x";
	//declarando label para classe toda
	JLabel lb;

	//declarando textField para classe toda
	JTextField txt;

	public MinhaJanela05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		txt = new JTextField(20);
		add(txt);
		txt.addActionListener(new txtF());

		lb = new JLabel("Frase: " + X);
		add(lb);

		pack();
		setVisible(true);
	}

	// Classes para o Text apertar enter e mudar o texto
	class txtF implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			X = txt.getText();
			lb.setText("Frase: " + X);
		}
	}

}

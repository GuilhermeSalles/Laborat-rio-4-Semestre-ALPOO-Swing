package LabExercicios.Entidades.dois;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaJanela06 extends JFrame {
	private static final long serialVersionUID = 1L;

	// Iniciando variavel
	String X = "x";
	// declarando label para classe toda
	JLabel lb;

	// declarando button para classe toda
	JButton b1;

	// declarando textField para classe toda
	JTextField txtNome;
	JTextField txtSobreNome;

	public MinhaJanela06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Nome
		JLabel lbNome = new JLabel("Nome: ");
		add(lbNome);
		txtNome = new JTextField(13);
		add(txtNome);

		// Sobrenome
		JLabel lbSobreNome = new JLabel("Sobrenome: ");
		add(lbSobreNome);
		txtSobreNome = new JTextField(13);
		add(txtSobreNome);

		// Botao
		b1 = new JButton("Enviar");
		add(b1);
		b1.addActionListener(new Botao());
		// Frase
		lb = new JLabel("");
		add(lb);

		pack();
		setVisible(true);
	}

	// Classes para o Text apertar enter e mudar o texto
	class Botao implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			lb.setText("Olá " + txtNome.getText() + " " + txtSobreNome.getText() + ", sejá bem-vindo ^_^ Desfrute!!");
		}
	}

}

package LabExercicios.Entidades.dois;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaJanela02 extends JFrame {
	private static final long serialVersionUID = 1L;
	int n = 0;
	JLabel labelContagem;

	public MinhaJanela02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JButton botao = new JButton("Aperte");
		add(botao);
		botao.addActionListener(new ComportamentoBotao());

		labelContagem = new JLabel(makeMensagemQuantidade());
		add(labelContagem);

		pack();
		setVisible(true);
	}

	private String makeMensagemQuantidade() {
		return "Botao pressionado " + n + " vezes";
	}

	class ComportamentoBotao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			n++;
			labelContagem.setText(makeMensagemQuantidade());
		}

	}
}

package LabExercicios.Entidades.dois;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaJanela03 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//Variavel de contagem
	int n = 0;
	//Label
	JLabel labelContagem;

	public MinhaJanela03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		//Botao 1
		JButton botao = new JButton("Aperte 1");
		add(botao);
		botao.addActionListener(new ComportamentoBotao());

		labelContagem = new JLabel("Botao pressionado " + n + " vezes");
		add(labelContagem);
		
		//Botao 2
		JButton botao2 = new JButton("Aperte 2");
		add(botao2);
		botao2.addActionListener(new ComportamentoBotao());

		pack();
		setVisible(true);
	}

	//Classe para botao
	class ComportamentoBotao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			n++;
			labelContagem.setText("Botao pressionado " + n + " vezes");
		}

	}
}

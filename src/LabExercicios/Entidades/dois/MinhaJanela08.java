package LabExercicios.Entidades.dois;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MinhaJanela08 extends JFrame {
	private static final long serialVersionUID = 1L;

	// Declarando JRadio
	JRadioButton escolha1;
	JRadioButton escolha2;
	JRadioButton escolha3;

	// Botao
	JButton btn;

	public MinhaJanela08() {
		super("Escolha roupas.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// RadioButtons adicionados em um grupo para selecionar um de cada vez
		ButtonGroup bg = new ButtonGroup();
		escolha1 = new JRadioButton("Amarelo");
		escolha2 = new JRadioButton("Vermelho");
		escolha3 = new JRadioButton("Azul");
		add(escolha1);
		add(escolha2);
		add(escolha3);

		bg.add(escolha1);
		bg.add(escolha2);
		bg.add(escolha3);

		// botao que irá escrever na saida padrao
		btn = new JButton("Aperte!");
		btn.addActionListener(new Botao());
		add(btn);

		// Mostrar janela
		pack();
		setVisible(true);
	}

	// Classe para escrever qual o look do dia
	class Botao implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Opções:");
			if (escolha1.isSelected()) {
				System.out.println("Vermelho");
			}
			if (escolha2.isSelected()) {
				System.out.println("Verde");
			}
			if (escolha3.isSelected()) {
				System.out.println("Azul");
			}
		}
	}

}

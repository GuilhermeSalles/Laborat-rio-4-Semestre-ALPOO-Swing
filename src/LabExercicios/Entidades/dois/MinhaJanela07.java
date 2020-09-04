package LabExercicios.Entidades.dois;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MinhaJanela07 extends JFrame {
	private static final long serialVersionUID = 1L;

	// Declarando Jchecks
	JCheckBox camiseta1;
	JCheckBox camiseta2;
	JCheckBox camiseta3;

	JCheckBox calca1;                      // Dica: seria melhor usar RadioButton
	JCheckBox calca2;
	JCheckBox calca3;

	JCheckBox tenis1;
	JCheckBox tenis2;
	JCheckBox tenis3;

	// Botao
	JButton btn;

	public MinhaJanela07() {
		super("Escolha roupas.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		//Paineis principais
		JPanel panelEscolhas = new JPanel();
		add(panelEscolhas, BorderLayout.CENTER);
		JPanel panelBotoes = new JPanel();
		add(panelBotoes, BorderLayout.PAGE_END);

		//painel para as camisetas
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		camiseta1 = new JCheckBox("Camiseta 01");
		camiseta2 = new JCheckBox("Camiseta 02");
		camiseta3 = new JCheckBox("Camiseta 03");
		panel1.add(camiseta1);
		panel1.add(camiseta2);
		panel1.add(camiseta3);

		//painel para as calças
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		calca1 = new JCheckBox("Calca 01");
		calca2 = new JCheckBox("Calca 02");
		calca3 = new JCheckBox("Calca 03");
		panel2.add(calca1);
		panel2.add(calca2);
		panel2.add(calca3);

		//painel para os tenis
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		tenis1 = new JCheckBox("tenis 01");
		tenis2 = new JCheckBox("tenis 02");
		tenis3 = new JCheckBox("tenis 03");
		panel3.add(tenis1);
		panel3.add(tenis2);
		panel3.add(tenis3);

		//painel para botao e o que irá executar
		btn = new JButton("Aperte para escrever a combinação!");
		btn.addActionListener(new Botao());
		panelBotoes.add(btn);

		//painel secundarios sendo colocado no principal
		panelEscolhas.setLayout(new GridLayout(3, 1));
		panelEscolhas.add(panel1);
		panelEscolhas.add(panel2);
		panelEscolhas.add(panel3);

		panelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER));
		//Mostrar janela
		pack();
		setVisible(true);
	}

	// Classe para escrever qual o look do dia
	class Botao implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (camiseta1.isSelected())
				System.out.print("Camiseta1, ");
			if (camiseta2.isSelected())
				System.out.print("Camiseta2, ");
			if (camiseta3.isSelected())
				System.out.print("Camiseta3, ");

			if (calca1.isSelected())
				System.out.print("Calca1, ");
			if (calca2.isSelected())
				System.out.print("Calca2, ");
			if (calca3.isSelected())
				System.out.print("Calca3, ");

			if (tenis1.isSelected())
				System.out.println("tenis1.");
			if (tenis2.isSelected())
				System.out.println("tenis2.");
			if (tenis3.isSelected())
				System.out.println("tenis3.");

		}
	}

}

package LabExercicios.Entidades;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MinhaJanela03 extends JFrame {

	private static final long serialVersionUID = 1L;

	public MinhaJanela03() {
		super("Exercicio 03");
		Dimension sizeTela = Toolkit.getDefaultToolkit().getScreenSize();
		int lgT = sizeTela.width;
		int alT = sizeTela.height;

		int larguraJanela = lgT / 2;
		int alturaJanela = alT / 2;

		setSize(larguraJanela, alturaJanela);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}
}

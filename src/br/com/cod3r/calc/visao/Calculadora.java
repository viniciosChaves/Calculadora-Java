package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		oraganizarLayout();
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(233,253);	
	}
	
	private void oraganizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,70));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado,BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		new Calculadora();
	}
	
}

package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{
public Botao(String texto,Color cor) {
	
	setBackground(cor);
	setText(texto);
	setOpaque(true);
	setForeground(Color.WHITE);
	setFont(new Font("courier",Font.BOLD,25));
	setBorder(BorderFactory.createLineBorder(Color.BLACK));
	
}
	
}

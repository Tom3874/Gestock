package gestionstock.marchandises;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class Vente extends JFrame{
	private JTextField textField;
	
	public static void main(String[] args) {
	Vente vente = new Vente();
	vente.setVisible(true);
	
	}
	
	public Vente() {
		super("Vente");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 67, 153, 22);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(163, 68, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
	}
}

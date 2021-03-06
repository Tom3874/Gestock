package gestionstock.marchandises;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class Vente extends JFrame{
	private JTextField txtproduit;
	private JTextField txtclient;
	private JTextField txtadresse;
	
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
		
		JLabel lblNewLabel = new JLabel("Produit N\u00B0 : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(26, 29, 77, 34);
		getContentPane().add(lblNewLabel);
		
		txtproduit = new JTextField();
		txtproduit.setBounds(126, 38, 86, 20);
		getContentPane().add(txtproduit);
		txtproduit.setColumns(10);
		
		JButton btnproduit = new JButton("Ajouter");
		btnproduit.setBounds(242, 37, 89, 23);
		getContentPane().add(btnproduit);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M.", "Mme."}));
		comboBox.setToolTipText("");
		comboBox.setForeground(Color.GRAY);
		comboBox.setBounds(26, 98, 55, 22);
		getContentPane().add(comboBox);
		
		JButton btnVente = new JButton("Vente");
		btnVente.setBounds(485, 327, 89, 23);
		getContentPane().add(btnVente);
		
		txtclient = new JTextField();
		txtclient.setBounds(91, 99, 240, 20);
		getContentPane().add(txtclient);
		txtclient.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(26, 140, 54, 14);
		getContentPane().add(lblNewLabel_1);
		
		txtadresse = new JTextField();
		txtadresse.setBounds(91, 138, 483, 20);
		getContentPane().add(txtadresse);
		txtadresse.setColumns(10);
		
		JScrollPane listvente = new JScrollPane();
		listvente.setBounds(26, 176, 548, 140);
		getContentPane().add(listvente);
		
		JList<? extends E> lstvente = new JList();
		listvente.setViewportView(list);
		
		
		
	}
}

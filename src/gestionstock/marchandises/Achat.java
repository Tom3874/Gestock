package gestionstock.marchandises;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import javax.swing.JRadioButton;

public class Achat extends JFrame {

	private JRadioButton pantalonBtn = new JRadioButton("Pantalon");
	private JRadioButton vesteBtn = new JRadioButton("Veste");
	private JRadioButton skiBtn = new JRadioButton("ski");
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPrix;
	private JTextField txtCouleur;
	private JTextField txtTaille;
	private JTextField txtPoids;
	private JTextField txtModle;
	private Stock stocker;
	

	public Stock getStocker() {
		return stocker;
	}

	public void setStocker(Stock stocker) {
		this.stocker = stocker;
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achat frame = new Achat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Achat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(348, 51, 46, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPrix = new JTextField();
		txtPrix.setText("Prix");
		txtPrix.setBounds(292, 51, 46, 20);
		contentPane.add(txtPrix);
		txtPrix.setColumns(10);
		
		txtCouleur = new JTextField();
		txtCouleur.setText("Couleur");
		txtCouleur.setBounds(94, 51, 46, 20);
		contentPane.add(txtCouleur);
		txtCouleur.setColumns(10);
		
		txtTaille = new JTextField();
		txtTaille.setText("Taille");
		txtTaille.setBounds(33, 51, 37, 20);
		contentPane.add(txtTaille);
		txtTaille.setColumns(10);
		
		txtPoids = new JTextField();
		txtPoids.setText("Poids");
		txtPoids.setBounds(166, 51, 45, 20);
		contentPane.add(txtPoids);
		txtPoids.setColumns(10);
		
		txtModle = new JTextField();
		txtModle.setText("Mod\u00E8le");
		txtModle.setBounds(236, 51, 46, 20);
		contentPane.add(txtModle);
		txtModle.setColumns(10);
		
		JButton btnCommander = new JButton("Commander");
		btnCommander.setBounds(142, 100, 140, 23);
		contentPane.add(btnCommander);
		btnCommander.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e) {
			
				boolean bVeste = vesteBtn.isSelected();
				boolean bSki = skiBtn.isSelected();
				boolean bPantalon = pantalonBtn.isSelected();
				String m = txtNombre.getText();
				int o = Integer.parseInt(m);
				int a = stocker.getProduits().getLast().getNum();
				String n = txtPrix.getText();
				double p = Double.parseDouble(n);
				String t = txtTaille.getText();
				int r = Integer.parseInt(t);
				double u = Double.parseDouble(t);
				String c = txtCouleur.getText();
				
				String b = txtPoids.getText();
				double d = Double.parseDouble(b);
				
				
				if (bVeste) {
					stocker.reapproV(o, a, p, c, t );
				}
				else if(bPantalon) {
					stocker.reapproP(o, a, p, c, r );
				}
				else if (bSki) {
					stocker.reapproS(o, a, p,u , d ,txtModle.getText() );
				}
				stocker.listingStock();
			}
			});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(408, 265, -374, -142);
		contentPane.add(scrollPane);
		
		JRadioButton rdbtnVeste = new JRadioButton("Veste");
		rdbtnVeste.setBounds(31, 21, 109, 23);
		contentPane.add(rdbtnVeste);
		
		JRadioButton rdbtnPantalon = new JRadioButton("Pantalon");
		rdbtnPantalon.setBounds(188, 21, 67, 23);
		contentPane.add(rdbtnPantalon);
		
		JRadioButton rdbtnSki = new JRadioButton("Ski");
		rdbtnSki.setBounds(348, 21, 46, 23);
		contentPane.add(rdbtnSki);
		
		Stock s = new Stock();
		Magasin m = new Magasin(s);
		
				
		Fournisseur f = new Fournisseur(001, "FR");
		Fournisseur f2 = new Fournisseur(002, "IT");
		Fournisseur f3 = new Fournisseur(003, "ES");
		Fournisseur f4 = new Fournisseur(004, "GB");

		Veste v = new Veste(1, 99.99, "ROUGE", "M");
		Veste v1 = new Veste(2, 80, "NOIRE",  "L");
		Veste v2 = new Veste(3, 80, "NOIRE",  "M");
		Veste v3 = new Veste(4, 99.99, "ROUGE", "L");
		Veste v4 = new Veste(5, 99.99, "ROUGE", "M");
		Ski sk1 = new Ski(6, 500, 1.90, 2.0, "Salomon");
		Ski sk2 = new Ski(7, 500, 1.80, 2.0, "Salomon");
		Ski sk3 = new Ski(8, 500, 2.10, 2.0, "Salomon");
		Pantalon p1 = new Pantalon(9, 75.00, "BLANC", 38);
		Pantalon p2 = new Pantalon(10, 75.00, "NOIR", 38);
		Pantalon p3 = new Pantalon(11, 75.00, "BLANC", 40);
		Pantalon p4 = new Pantalon(12, 75.00, "NOIR", 38);
		Pantalon p5 = new Pantalon(13, 75.00, "NOIR", 40);
		s.ajouter(v);
		s.ajouter(v1);
		s.ajouter(v2);
		s.ajouter(v3);
		s.ajouter(v4);
		s.ajouter(sk1);
		s.ajouter(sk2);
		s.ajouter(sk3);
		s.ajouter(p1);
		s.ajouter(p2);
		s.ajouter(p3);
		s.ajouter(p4);
		s.ajouter(p5);
		
		
		m.refill();
		m.listingMagasin();
		s.listingStock();
	}
}


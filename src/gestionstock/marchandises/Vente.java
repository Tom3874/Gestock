package gestionstock.marchandises;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class Vente extends JFrame {
	
	public JTextField getTxtproduit() {
		return txtproduit;
	}

	private JRadioButton pantalonBtn = new JRadioButton("Pantalon");
	private JRadioButton vesteBtn = new JRadioButton("Veste");
	private JRadioButton skiBtn = new JRadioButton("ski");

	private JTextField txtclient;
	private JTextField txtadresse;
	private JTextArea listVente = new JTextArea();
	private Produit produit;
	private Magasin magasin;



	public Magasin getMagasin() {
		return magasin;
	}


	
	private JTextField txtproduit = new JTextField();
	
	public static void main(String[] args) throws Exception {
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
		
		
		txtproduit.setBounds(126, 38, 86, 20);
		getContentPane().add(txtproduit);
		txtproduit.setColumns(10);
		
		JButton btnproduit = new JButton("Ajouter");
		btnproduit.setBounds(242, 37, 89, 23);
		getContentPane().add(btnproduit);
		btnproduit.addActionListener(new ActionListener(){
		
			
		public void actionPerformed(ActionEvent e) {
			Veste[] vestes = getMagasin().getVestes();
			Ski[] skis = getMagasin().getSkis();
			Pantalon[] pantalons = getMagasin().getPantalons();
			
			boolean bVeste = vesteBtn.isSelected();
			boolean bSki = skiBtn.isSelected();
			boolean bPantalon = pantalonBtn.isSelected();
			
			String str ="";
			String m = txtproduit.getText();
			int o = Integer.parseInt(m);
			
			if (bVeste)
			{
			for (int i = 0; i < vestes.length; i++) {
				if (vestes[i].getNum() == o && vestes[i] != null) {
					str = vestes[i].toString();
					break;
				}
				else str = "Il n'existe pas de produit veste au numéro " + o ;
			}
			}else if(bSki) {
				for (int i = 0; i < skis.length; i++) {
					if (skis[i].getNum() == o && skis[i] != null) {
						str = skis[i].toString();
						break;
					}
					else str = "Il n'existe pas de produit ski au numéro " + o ;
				}
			}else if(bPantalon) {
				for (int i = 0; i < pantalons.length; i++) {
					if (pantalons[i].getNum() == o && pantalons[i] != null) {
						str = pantalons[i].toString();
						break;
					}
					else str = "Il n'existe pas de produit pantalon au numéro " + o ;
				}
			}else str = "Aucun type de produit n'a été sélectionné";
			
			
			listVente.setText(str);	
		}
		
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M.", "Mme."}));
		comboBox.setToolTipText("");
		comboBox.setForeground(Color.GRAY);
		comboBox.setBounds(26, 98, 55, 22);
		getContentPane().add(comboBox);
		
		JButton btnVente = new JButton("Vente");
		btnVente.setBounds(485, 327, 89, 23);
		getContentPane().add(btnVente);
		btnVente.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {
						
			String str ="";
			boolean bVeste = vesteBtn.isSelected();
			boolean bSki = skiBtn.isSelected();
			boolean bPantalon = pantalonBtn.isSelected();
			String m = txtproduit.getText();
			int o = Integer.parseInt(m);
			
			if (bVeste)
			{
			for (int i = 0; i < getMagasin().getVestes().length; i++) {
				if (getMagasin().getVestes()[i].getNum() == o && getMagasin().getVestes()[i] != null) {
					str = getMagasin().getVestes()[i].toString() + " : vendue.";
					magasin.getVestes()[i] = (Veste) null;
					break;
				}
				else str = "Il n'existe pas de produit veste au numéro " + o + "donc ne peut pas être vendu";
			}
			}else if(bSki) {
				for (int i = 0; i < getMagasin().getSkis().length; i++) {
					if (getMagasin().getSkis()[i].getNum() == o && getMagasin().getSkis()[i] != null) {
						str = getMagasin().getSkis()[i].toString() + ": vendu.";
						break;
					}
					else str = "Il n'existe pas de produit ski au numéro " + o ;
				}
			}else if(bPantalon) {
				for (int i = 0; i < getMagasin().getPantalons().length; i++) {
					if (getMagasin().getPantalons()[i].getNum() == o && getMagasin().getPantalons()[i] != null) {
						str =getMagasin().getPantalons()[i].toString() + ": vendu.";
						break;
					}
					else str = "Il n'existe pas de produit pantalon au numéro " + o ;
				}
			}else str = "Aucun type de produit n'a été sélectionné";
			
			
			listVente.setText(str);
			magasin.listingMagasin();
			
		}
			
			
		});
		
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
		
		JScrollPane list = new JScrollPane();
		list.setToolTipText("");
		list.setBounds(26, 176, 548, 140);
		getContentPane().add(list);
		
		
		list.setViewportView(listVente);
		
		vesteBtn.setBounds(26, 65, 109, 23);
		getContentPane().add(vesteBtn);
		
		skiBtn.setBounds(164, 65, 109, 23);
		getContentPane().add(skiBtn);
		
		pantalonBtn.setBounds(317, 65, 109, 23);
		getContentPane().add(pantalonBtn);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(pantalonBtn);
		buttonGroup.add(skiBtn);
		buttonGroup.add(vesteBtn);
		
				
		Stock s = new Stock();
		Magasin m = new Magasin(s);
		
				
		Fournisseur f = new Fournisseur(001, "FR");
		Fournisseur f2 = new Fournisseur(002, "IT");
		Fournisseur f3 = new Fournisseur(003, "ES");
		Fournisseur f4 = new Fournisseur(004, "GB");

		Veste v = new Veste(1, 99.99, "ROUGE", "M");
		Veste v1 = new Veste(2, 80, "NOIRE", "L");
		Veste v2 = new Veste(3, 80, "NOIRE", "M");
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
		
		
		
		
		m.refillV();
		m.refillP();
		m.refillS();
		this.setMagasin(m);
		m.listingMagasin();
		s.listingStock();
		
				
	}



	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	public void setMagasin(Magasin m) {
		this.magasin = m;
	}
}

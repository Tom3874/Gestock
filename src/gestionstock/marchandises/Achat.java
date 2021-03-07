package gestionstock.marchandises;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JList;

public class Achat extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPrix;
	private JTextField txtCouleur;
	private JTextField txtTaille;
	private JTextField txtPoids;
	private JTextField txtModle;

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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Veste", "Pantalon", "Ski"}));
		comboBox.setBounds(10, 50, 58, 22);
		contentPane.add(comboBox);
		
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
		txtCouleur.setBounds(125, 51, 46, 20);
		contentPane.add(txtCouleur);
		txtCouleur.setColumns(10);
		
		txtTaille = new JTextField();
		txtTaille.setText("Taille");
		txtTaille.setBounds(78, 51, 37, 20);
		contentPane.add(txtTaille);
		txtTaille.setColumns(10);
		
		txtPoids = new JTextField();
		txtPoids.setText("Poids");
		txtPoids.setBounds(181, 51, 45, 20);
		contentPane.add(txtPoids);
		txtPoids.setColumns(10);
		
		txtModle = new JTextField();
		txtModle.setText("Mod\u00E8le");
		txtModle.setBounds(236, 51, 46, 20);
		contentPane.add(txtModle);
		txtModle.setColumns(10);
		
		JButton btnCommander = new JButton("Commander");
		btnCommander.setBounds(166, 82, 89, 23);
		contentPane.add(btnCommander);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(408, 265, -374, -142);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 116, 414, 106);
		contentPane.add(scrollPane_1);
		
		JList<? extends E> list = new JList();
		scrollPane_1.setViewportView(list);
		
		JButton btnacheter = new JButton("Acheter");
		btnacheter.setBounds(166, 233, 89, 23);
		contentPane.add(btnacheter);
	}
}

package com.java.Guillaume;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Fenceasarcipher {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenceasarcipher window = new Fenceasarcipher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fenceasarcipher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Quitter");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(177, 61, 198, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(177, 95, 33, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JButton btnNewButton = new JButton("Encrypter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				int i = 0;
				s = tf1.getText();
				try {
					i = Integer.parseInt(tf2.getText());
					Ceasarcipher c = new Ceasarcipher(i);
					s=c.encipher(s);
					tf3.setText(s);
				} catch (NumberFormatException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erreur : Veuillez entrer un nombre entier");
				}
				
			}
		});
		btnNewButton.setBounds(177, 126, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblTexte = new JLabel("Décalage :");
		lblTexte.setBounds(10, 101, 178, 14);
		frame.getContentPane().add(lblTexte);
		
		JLabel label = new JLabel("Phrase à encrypter :");
		label.setBounds(10, 67, 178, 14);
		frame.getContentPane().add(label);
		
		tf3 = new JTextField();
		tf3.setBounds(177, 160, 195, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JLabel lblRsultatDeLencryption = new JLabel("Résultat de l'encryption :");
		lblRsultatDeLencryption.setBounds(10, 166, 178, 14);
		frame.getContentPane().add(lblRsultatDeLencryption);
	}
}



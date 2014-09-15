import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;


public class PartnerboerseGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PartnerboerseGui frame = new PartnerboerseGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PartnerboerseGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 619);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenu mnProfil = new JMenu("Profil");
		menuBar.add(mnProfil);
		
		
		
		
		JMenu mnSuche = new JMenu("Suche");
		menuBar.add(mnSuche);
		
		JMenu mnRandomkp = new JMenu("RandomKP");
		menuBar.add(mnRandomkp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel ProfilPannel = new JPanel();
		ProfilPannel.setBounds(0, 0, 924, 560);
		contentPane.add(ProfilPannel);
		ProfilPannel.setLayout(null);
		
		JLabel lblDeinProfil = new JLabel("Dein Profil");
		lblDeinProfil.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDeinProfil.setBounds(10, 11, 173, 65);
		ProfilPannel.add(lblDeinProfil);
		
		final JPanel HomePannel = new JPanel();
		HomePannel.setBounds(0, 0, 924, 560);
		contentPane.add(HomePannel);
		HomePannel.setLayout(null);
		
		JLabel lHeader = new JLabel("Willkommen in der Partnerb\u00F6rse");
		lHeader.setBounds(8, 11, 458, 74);
		HomePannel.add(lHeader);
		lHeader.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		
		JTextPane txtpnHierSindDie = new JTextPane();
		txtpnHierSindDie.setBounds(676, 191, 208, 90);
		HomePannel.add(txtpnHierSindDie);
		txtpnHierSindDie.setText("Mara - sucht versaute Abenteuer\r\nTina - steht auf B\u00E4rte\r\nMonika - will reden\r\nHeike - m\u00F6chte neue Sachen ausprobieren\r\nSilvia - mag Hunde\r\n");
		
		JLabel lblNeueBenutzer = new JLabel("Neue Benutzer");
		lblNeueBenutzer.setBounds(742, 149, 71, 14);
		HomePannel.add(lblNeueBenutzer);
		
		JButton btnNewButton = new JButton("Werbung 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePannel.setVisible(false);
			}
		});
		btnNewButton.setBounds(121, 425, 144, 74);
		HomePannel.add(btnNewButton);
		
		JButton btnWerbung = new JButton("Werbung 2");
		btnWerbung.setBounds(329, 425, 137, 74);
		HomePannel.add(btnWerbung);
		
		JButton btnWerbung_1 = new JButton("Werbung 3");
		btnWerbung_1.setBounds(530, 420, 130, 84);
		HomePannel.add(btnWerbung_1);
		
		JTextPane txtpnHierStehtIrgendeine = new JTextPane();
		txtpnHierStehtIrgendeine.setBounds(121, 191, 403, 90);
		HomePannel.add(txtpnHierStehtIrgendeine);
		txtpnHierStehtIrgendeine.setText("Hier steht irgendeine Kacke die keinen Interessiert und als Home Dings Funktioniert\r\nHier steht irgendeine Kacke die keinen Interessiert und als Home Dings Funktioniert\r\nHier steht irgendeine Kacke die keinen Interessiert und als Home Dings Funktioniert\r\nHier steht irgendeine Kacke die keinen Interessiert und als Home Dings Funktioniert\r\nHier steht irgendeine Kacke die keinen Interessiert und als Home Dings Funktioniert\r\n");
		
		final JPanel SuchePannel = new JPanel();
		SuchePannel.setBounds(0, 0, 924, 560);
		contentPane.add(SuchePannel);
		SuchePannel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(124, 84, 92, 20);
		SuchePannel.add(comboBox);
		
		JLabel lblFindeDeinenPartner = new JLabel("Finde deinen Partner");
		lblFindeDeinenPartner.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblFindeDeinenPartner.setBounds(372, 11, 187, 62);
		SuchePannel.add(lblFindeDeinenPartner);
		
		JLabel lblGeschlecht = new JLabel("Geschlecht");
		lblGeschlecht.setBounds(62, 90, 52, 14);
		SuchePannel.add(lblGeschlecht);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(323, 84, 92, 20);
		SuchePannel.add(comboBox_1);
		
		JLabel lblAlter = new JLabel("Alter");
		lblAlter.setBounds(290, 90, 23, 14);
		SuchePannel.add(lblAlter);
		
		JLabel lblGre = new JLabel("Gr\u00F6\u00DFe");
		lblGre.setBounds(492, 90, 46, 14);
		SuchePannel.add(lblGre);
		
		JLabel lblGewicht = new JLabel("Gewicht");
		lblGewicht.setBounds(671, 90, 46, 14);
		SuchePannel.add(lblGewicht);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(535, 84, 92, 20);
		SuchePannel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(723, 84, 85, 20);
		SuchePannel.add(comboBox_3);
		

		
		JMenuItem mntmBearbeiten = new JMenuItem("Bearbeiten");
		mnProfil.add(mntmBearbeiten);
		//-------------------------------------------------------
		/*mnHome.addMenuListener(new MenuListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePannel.setVisible(true);
				ProfilPannel.setVisible(false);
				
			}

			
		});*/
		mnHome.addMenuListener(new MenuListener() {
			
			public void menuSelected(MenuEvent e) {
	            System.out.println("menuSelected");
	            HomePannel.setVisible(true);
				ProfilPannel.setVisible(false);

	        }

	        public void menuDeselected(MenuEvent e) {
	            //System.out.println("menuDeselected");

	        }

	        public void menuCanceled(MenuEvent e) {
	            //System.out.println("menuCanceled");

	        }
				
			
	    });
		mnProfil.addMenuListener(new MenuListener() {
			
			public void menuSelected(MenuEvent e) {
	            System.out.println("menuSelected");
	            HomePannel.setVisible(false);
				ProfilPannel.setVisible(true);
				SuchePannel.setVisible(false);

	        }

	        public void menuDeselected(MenuEvent e) {
	            //System.out.println("menuDeselected");

	        }

	        public void menuCanceled(MenuEvent e) {
	            //System.out.println("menuCanceled");

	        }
				
			
	    });
		mnSuche.addMenuListener(new MenuListener() {
			
			public void menuSelected(MenuEvent e) {
	            System.out.println("menuSelected");
	            HomePannel.setVisible(false);
				ProfilPannel.setVisible(false);
				SuchePannel.setVisible(true);

	        }

	        public void menuDeselected(MenuEvent e) {
	            //System.out.println("menuDeselected");

	        }

	        public void menuCanceled(MenuEvent e) {
	            //System.out.println("menuCanceled");

	        }
				
			
	    });
		mnRandomkp.addMenuListener(new MenuListener() {
			
			public void menuSelected(MenuEvent e) {
	            System.out.println("menuSelected");
	            HomePannel.setVisible(false);
				ProfilPannel.setVisible(false);
				SuchePannel.setVisible(false);

	        }

	        public void menuDeselected(MenuEvent e) {
	            //System.out.println("menuDeselected");

	        }

	        public void menuCanceled(MenuEvent e) {
	            //System.out.println("menuCanceled");

	        }
				
			
	    });
		
	
	}
}

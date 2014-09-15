import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PartnerboerseLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PartnerboerseLogin frame = new PartnerboerseLogin();
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
	
	public PartnerboerseLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					String name = textField_1.getText();
					String paswd = textField.getText();
					/*if(name.equals("test") && paswd.equals("12345")) {
					PartnerboerseGui gui = new PartnerboerseGui();
					gui.setVisible(true);
					dispose();*/
					if(sqlconnection.validateLogin(name, paswd)) {
					PartnerboerseGui gui = new PartnerboerseGui();
					gui.setVisible(true);
					dispose();
					} else {

					JOptionPane.showMessageDialog(null,"Wrong Password / Username");
					textField_1.setText("");
					textField.setText("");
					textField_1.requestFocus();
					}
			}
		});
		
		btnLogin.setBounds(5, 217, 387, 23);
		contentPane.add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(141, 114, 137, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 67, 137, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setBounds(93, 76, 46, 14);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("Pass:");
		lblPass.setBounds(93, 123, 46, 14);
		contentPane.add(lblPass);
		
		
	}
	
	
}

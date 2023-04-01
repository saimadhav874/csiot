package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	 JFrame lframe;
	private JTextField t1;
	private JPasswordField p1;
    JLabel lb2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.lframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lframe = new JFrame();
		lframe.setBounds(100, 100, 497, 289);
		lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(160, 27, 113, 28);
		lframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(124, 77, 84, 28);
		lframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(124, 130, 67, 14);
		lframe.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(244, 83, 86, 20);
		lframe.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(210, 84, 46, 14);
		lframe.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(":");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(210, 130, 46, 14);
		lframe.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un= t1.getText();
				String ps= p1.getText();
				
				if(un.equals("MREC") && (ps.equals("1234"))) {
					JOptionPane.showMessageDialog(btnNewButton, "login done successfully..!");
					
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "login Invalid!");
				}
				
				JOptionPane.showMessageDialog(btnNewButton, "hey " +un+ " thanks for registering");
				lframe.dispose();
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(173, 180, 89, 23);
		lframe.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(244, 129, 86, 20);
		lframe.getContentPane().add(p1);
		
		
		lb2 = new JLabel("");
		lb2.setBounds(124, 54, 205, 14);
		lframe.getContentPane().add(lb2);
	}
}

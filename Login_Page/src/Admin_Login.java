import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_Login extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Login frame = new Admin_Login();
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
	public Admin_Login() {
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		
		JLabel lblWelcomeStandardUser = new JLabel("Welcome Admin User ");
		lblWelcomeStandardUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeStandardUser.setForeground(new Color(244, 164, 96));
		lblWelcomeStandardUser.setFont(new Font("Maiandra GD", Font.PLAIN, 25));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(163)
					.addComponent(lblWelcomeStandardUser, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
					.addGap(115))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addComponent(lblWelcomeStandardUser, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("MV Boli", Font.PLAIN, 15));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		
		Username = new JTextField();
		Username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		passwordField = new JPasswordField();
		
		JButton btnLogin = new JButton("Login ");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		
		JButton btnGoBack = new JButton(" Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choose_User choose=new Choose_User();
				choose.setVisible(true);
				Admin_Login.this.dispose();
			}
		});
		btnGoBack.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblUsername)
					.addGap(5)
					.addComponent(Username, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblPassword)
					.addGap(8)
					.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(97)
					.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addGap(57)
					.addComponent(btnResetPassword, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
					.addGap(66))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(229)
					.addComponent(btnGoBack, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
					.addGap(208))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsername)
						.addComponent(Username, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnResetPassword, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(btnGoBack)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}

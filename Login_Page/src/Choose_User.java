import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Choose_User extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choose_User frame = new Choose_User();
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
	public Choose_User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 990, 122);
		panel.setBackground(Color.DARK_GRAY);
		
		JLabel lblChoose = new JLabel("Choose User ");
		lblChoose.setHorizontalTextPosition(SwingConstants.CENTER);
		lblChoose.setFont(new Font("Harrington", Font.BOLD | Font.ITALIC, 40));
		lblChoose.setForeground(new Color(65, 105, 225));
		lblChoose.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Standard User");
		btnNewButton.setBounds(243, 234, 181, 177);
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Standard_Login sul=new Standard_Login();
				sul.setVisible(true);
				Choose_User.this.setVisible(false);
				}
		});
		btnNewButton.setIcon(new ImageIcon(Choose_User.class.getResource("/Icons/Person-Male-Light-icon.png")));
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 20));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnAdminUser = new JButton("Admin User\r\n");
		btnAdminUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Login aul=new Admin_Login();
				aul.setVisible(true);
				Choose_User.this.dispose();
			}
		});
		btnAdminUser.setVerticalAlignment(SwingConstants.BOTTOM);
		btnAdminUser.setBounds(546, 234, 181, 178);
		btnAdminUser.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAdminUser.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAdminUser.setIcon(new ImageIcon(Choose_User.class.getResource("/Icons/Office-Customer-Male-Light-icon.png")));
		btnAdminUser.setFont(new Font("Segoe Print", Font.BOLD, 20));
		
		JButton btnGoBack = new JButton("<- Go Back");
		btnGoBack.setBackground(new Color(102, 153, 204));
		btnGoBack.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnGoBack.setForeground(new Color(102, 153, 0));
		btnGoBack.setFont(new Font("Segoe Print", Font.BOLD, 15));
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(234)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
					.addGap(98)
					.addComponent(btnAdminUser, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(236))
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(793, Short.MAX_VALUE)
					.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(93)
							.addComponent(btnAdminUser, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
							.addGap(25)
							.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(95)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
							.addGap(92)))
					.addGap(22))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(lblChoose, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
					.addGap(226))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addComponent(lblChoose))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
	}

}

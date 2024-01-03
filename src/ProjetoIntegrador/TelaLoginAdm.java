package ProjetoIntegrador;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.ImageIcon;

public class TelaLoginAdm extends JFrame {

	public TelaLoginAdm() {
	
		
		setTitle("Tela de login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		setLocationRelativeTo(null);
		JTextField txtUsername = new JTextField(20);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 16));
		txtUsername.setBorder(null);
		txtUsername.setBounds(983, 323, 135, 37);;
		
		
		JPasswordField txtPassword = new JPasswordField(20);
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		txtPassword.setBounds(983, 381, 139, 37);
		getContentPane().setLayout(null);
		
		
		JButton btnLogin = new JButton("");
		btnLogin.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaLoginAdm\\Design sem nome (20).png"));
		btnLogin.setBorder(null);
		btnLogin.setBounds(936, 451, 194, 53);
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		getContentPane().add(btnLogin);
		
		
	
				btnLogin.addActionListener(new ActionListener() {			
					@Override
					public void actionPerformed(ActionEvent e) {
						String username = txtUsername.getText();
						String password = new String(txtPassword.getPassword());
		
						// Verifica o usuário e senha
						if (username.equals("joao@ecopet.com") && password.equals("joaoneto")) {
							JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
							
							TelaCrudAdm novaTelaCrudAdm = null;
							try {
								novaTelaCrudAdm = new TelaCrudAdm();
							} catch (ParseException e1) {
							
								e1.printStackTrace();
							}
							novaTelaCrudAdm.setVisible(true);
							dispose();						
							
						} else {
							JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
						}						
					}
				});
		
				
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal novaTelaPrincipal = new TelaPrincipal ();
				novaTelaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaLoginAdm\\imgVoltar102x57.jpg"));
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(1240, 565, 102, 57);
		getContentPane().add(btnVoltar);
		getContentPane().add(txtUsername);
		getContentPane().add(txtPassword);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaLoginAdm\\img1360x740.png"));
		lblNewLabel.setBounds(0, 0, 1352, 696);
		getContentPane().add(lblNewLabel);
	}

	public static void main(String[] args) {
		// Cria e exibe a janela de login
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TelaLoginAdm().setVisible(true);
			}
		});
	}
}

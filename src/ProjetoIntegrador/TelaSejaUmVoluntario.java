package ProjetoIntegrador;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TelaSejaUmVoluntario extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigiteONome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSejaUmVoluntario frame = new TelaSejaUmVoluntario();
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
	
	public TelaSejaUmVoluntario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
			         
			        Desktop.getDesktop().browse(new URI("https://www.instagram.com/ecopettampas/"));
			         
			    } catch (IOException | URISyntaxException e1) {
			        e1.printStackTrace();
			    }
			}
		});
		lblNewLabel_2.setBounds(579, 604, 207, 129);
		contentPane.add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setForeground(new Color(0, 51, 51));
		panel.setBounds(0, 636, 1371, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnecopettampas = new JTextPane();
		txtpnecopettampas.setEditable(false);
		txtpnecopettampas.setBounds(621, 11, 160, 30);
		panel.add(txtpnecopettampas);
		txtpnecopettampas.setForeground(new Color(255, 255, 255));
		txtpnecopettampas.setBackground(new Color(0, 102, 102));
		txtpnecopettampas.setFont(new Font("Arial", Font.BOLD, 20));
		txtpnecopettampas.setText("@ecopettampas");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmVonluntario\\logoIntagram31x30 (4).png"));
		lblNewLabel_1.setBounds(582, 13, 31, 30);
		panel.add(lblNewLabel_1);		
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setBorder(null);
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmVonluntario\\imgVoltar102x57.jpg"));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal novaTelaPrincipal = new TelaPrincipal ();
				novaTelaPrincipal.setVisible(true);
				dispose();				
			}
		});
		btnVoltar.setBounds(1240, 536, 102, 57);
		contentPane.add(btnVoltar);		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmVonluntario\\Design sem nome (10).png"));
		lblNewLabel.setBounds(116, 161, 474, 432);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnSerUmVoluntrio = new JTextPane();
		txtpnSerUmVoluntrio.setEditable(false);
		txtpnSerUmVoluntrio.setForeground(new Color(0, 102, 102));
		txtpnSerUmVoluntrio.setFont(new Font("Arial", Font.BOLD, 32));
		txtpnSerUmVoluntrio.setText("Ser um voluntário Ecopet é transformar seus valores em \r\nação e fazer a diferença na vida de muitos animais.");
		txtpnSerUmVoluntrio.setBounds(243, 30, 906, 81);
		contentPane.add(txtpnSerUmVoluntrio);
		
		JTextPane txtpnCadastrese = new JTextPane();
		txtpnCadastrese.setEditable(false);
		txtpnCadastrese.setForeground(new Color(0, 102, 102));
		txtpnCadastrese.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnCadastrese.setText("Cadastre-se:");
		txtpnCadastrese.setBounds(758, 179, 144, 34);
		contentPane.add(txtpnCadastrese);		
		
		txtDigiteONome = new JTextField("    Digite o nome completo");
		txtDigiteONome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDigiteONome.setText("    ");			
			}
		}
		);
		txtDigiteONome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtDigiteONome.setText("    Digite o nome completo");
		txtDigiteONome.setColumns(10);
		txtDigiteONome.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		txtDigiteONome.setBackground(Color.WHITE);
		txtDigiteONome.setBounds(756, 219, 475, 38);
		contentPane.add(txtDigiteONome);
		
		txtCpf = new JTextField("    CPF");
		txtCpf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCpf.setText("    ");					
			}
		});
		txtCpf.setText("    CPF");
		txtCpf.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCpf.setColumns(10);
		txtCpf.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		txtCpf.setBackground(Color.WHITE);
		txtCpf.setBounds(756, 281, 475, 38);
		contentPane.add(txtCpf);
		
		txtEmail = new JTextField("    E-mail");
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("    ");	
			}
		});
		txtEmail.setText("    E-mail");
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setBounds(756, 343, 475, 38);
		contentPane.add(txtEmail);
		
		txtTelefone = new JTextField("    Telefone");
		txtTelefone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelefone.setText("    ");
			}
		});
		txtTelefone.setText("    Telefone");
		txtTelefone.setFont(new Font("Arial", Font.PLAIN, 16));
		txtTelefone.setColumns(10);
		txtTelefone.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		txtTelefone.setBackground(Color.WHITE);
		txtTelefone.setBounds(756, 404, 475, 38);
		contentPane.add(txtTelefone);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnEnviar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnEnviar.setBackground(new Color(0, 102, 102));
		btnEnviar.setBounds(756, 453, 126, 42);
		contentPane.add(btnEnviar);
				
	}
}

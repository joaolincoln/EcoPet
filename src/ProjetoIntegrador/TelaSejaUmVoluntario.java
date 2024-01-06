package ProjetoIntegrador;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.Color;
import java.awt.Desktop;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;

public class TelaSejaUmVoluntario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JFormattedTextField cxTextCelular;
//	private JRadioButton rdbtnPossoColetar;
//	private JRadioButton rdbtnPossoAjudarFinanceiramente;
//	private JRadioButton rdbtnPossoProcurarPontos;
//	private JRadioButton rdbtnPossoArmazenarTampinhas;
//	private JRadioButton rdbtnOutro;

	static final String DB_URL = "jdbc:mysql://localhost/projetointegrador";
	static final String USER = "root";
	static final String PASS = "netolindo";
	
	
	
	
	private JFormattedTextField txtCpf;
	private JTextField textOutros;

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
	 * @throws ParseException 
	 */

	public TelaSejaUmVoluntario() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setBounds(580, 0, 200, 59);
				panel.add(lblNewLabel_3);
				lblNewLabel_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {

							Desktop.getDesktop().browse(new URI("https://www.instagram.com/ecopettampas/"));

						} catch (IOException | URISyntaxException e1) {
							e1.printStackTrace();
						}
					}
				});
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmVonluntario\\logoIntagram31x30 (4).png"));
		lblNewLabel_1.setBounds(580, 11, 31, 30);
		panel.add(lblNewLabel_1);
		
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setBounds(580, 0, 205, 97);
				panel.add(lblNewLabel_2);
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
		btnVoltar.setBounds(1240, 521, 102, 57);
		contentPane.add(btnVoltar);		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmVonluntario\\Design sem nome (10).png"));
		lblNewLabel.setBounds(79, 86, 482, 488);
		contentPane.add(lblNewLabel);

		JTextPane txtpnSerUmVoluntrio = new JTextPane();
		txtpnSerUmVoluntrio.setEditable(false);
		txtpnSerUmVoluntrio.setForeground(new Color(0, 102, 102));
		txtpnSerUmVoluntrio.setFont(new Font("Arial", Font.BOLD, 32));
		txtpnSerUmVoluntrio.setText("Ser um voluntário Ecopet é transformar seus valores em \r\n    ação e fazer a diferença na vida de muitos animais.");
		txtpnSerUmVoluntrio.setBounds(220, 24, 955, 87);
		contentPane.add(txtpnSerUmVoluntrio);

		JTextPane txtpnCadastrese = new JTextPane();
		txtpnCadastrese.setEditable(false);
		txtpnCadastrese.setForeground(new Color(0, 102, 102));
		txtpnCadastrese.setFont(new Font("Arial", Font.PLAIN, 24));
		txtpnCadastrese.setText("Cadastre-se:");
		txtpnCadastrese.setBounds(677, 148, 144, 34);
		contentPane.add(txtpnCadastrese);		

		txtNome = new JTextField("    Digite o nome completo");
		txtNome.setForeground(new Color(0, 102, 102));
		txtNome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNome.setText("    ");			
			}
		}
				);
		txtNome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNome.setText("    Digite o nome completo");
		txtNome.setColumns(10);
		txtNome.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(677, 193, 475, 38);
		contentPane.add(txtNome);



		
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
							Statement stmt = conn.createStatement()) {
						// Execute a query
						
						//System.out.println( cxTextCelular.getText().trim() );
						String sql = "INSERT INTO voluntario VALUES ('" +
								
								txtNome.getText().trim() + "','" +
								cxTextCelular.getText().trim() + "','" +
								//.getText().trim() + "','" +
								//.getText().trim() + "','" +
								//.getText().trim() + "','" +
								
								textOutros.getText().trim() + "')";
									
						

						System.out.println(sql);

						stmt.executeUpdate(sql);

						JOptionPane.showMessageDialog(contentPane, "Registro criado com sucesso!");
					} catch (SQLException ex) {
						JOptionPane.showMessageDialog(contentPane, "Não foi possível criar registro");
						ex.printStackTrace();
					}

			}
		});
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnEnviar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnEnviar.setBackground(new Color(0, 102, 102));
		btnEnviar.setBounds(677, 521, 126, 42);
		contentPane.add(btnEnviar);

		JLabel lblcelularvolunt = new JLabel("    Celular");
		lblcelularvolunt.setForeground(new Color(0, 102, 102));
		lblcelularvolunt.setFont(new Font("Arial", Font.PLAIN, 16));
		lblcelularvolunt.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		lblcelularvolunt.setBackground(new Color(0, 102, 102));
		lblcelularvolunt.setBounds(677, 257, 92, 38);
		contentPane.add(lblcelularvolunt);
	
		
		
		cxTextCelular = new JFormattedTextField(new MaskFormatter("  (##) # #### - ####"));
		cxTextCelular.setForeground(new Color(0, 102, 102));
		cxTextCelular.setFont(new Font("Arial", Font.PLAIN, 16));
		cxTextCelular.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		cxTextCelular.setBounds(767, 257, 385, 38);
		contentPane.add(cxTextCelular);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  Quero ser um ponto de coleta de tampinhas");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setForeground(new Color(0, 102, 102));
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(677, 321, 373, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnQueroAjudarFinanceiramente = new JRadioButton("  Quero ajudar financeiramente");
		rdbtnQueroAjudarFinanceiramente.setBackground(new Color(255, 255, 255));
		rdbtnQueroAjudarFinanceiramente.setForeground(new Color(0, 102, 102));
		rdbtnQueroAjudarFinanceiramente.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnQueroAjudarFinanceiramente.setBounds(677, 365, 238, 23);
		contentPane.add(rdbtnQueroAjudarFinanceiramente);
		
		JRadioButton rdbtnQueroAdotarUm = new JRadioButton("  Quero adotar um pet");
		rdbtnQueroAdotarUm.setBackground(new Color(255, 255, 255));
		rdbtnQueroAdotarUm.setForeground(new Color(0, 102, 102));
		rdbtnQueroAdotarUm.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnQueroAdotarUm.setBounds(677, 413, 238, 23);
		contentPane.add(rdbtnQueroAdotarUm);
		
		JRadioButton rdbtnOutros = new JRadioButton(" Outros:");
		rdbtnOutros.setBackground(new Color(255, 255, 255));
		rdbtnOutros.setForeground(new Color(0, 102, 102));
		rdbtnOutros.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnOutros.setBounds(677, 462, 79, 23);
		contentPane.add(rdbtnOutros);
		
		textOutros = new JTextField();
		textOutros.setBackground(new Color(255, 255, 255));
		textOutros.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 102, 102)));
		textOutros.setBounds(767, 463, 229, 23);
		contentPane.add(textOutros);
		textOutros.setColumns(10);

	}
}
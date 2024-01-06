package ProjetoIntegrador;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
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

import javax.swing.JFormattedTextField;

public class TelaSejaUmPatrocinador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDigiteONome;
	private JTextField txtEmail;
	private JFormattedTextField cxTextCnpj;
	private JFormattedTextField cxTextCelularPatrocinador;

	static final String DB_URL = "jdbc:mysql://localhost/projetointegrador";
	static final String USER = "root";
	static final String PASS = "netolindo";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSejaUmPatrocinador frame = new TelaSejaUmPatrocinador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public TelaSejaUmPatrocinador() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("");
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
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmPatrocinador\\imgCoracao30x30(1).png"));
		lblNewLabel_2.setBounds(436, 121, 35, 37);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_3.setBounds(581, 639, 199, 57);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmPatrocinador\\Gato-PNG.png"));
		lblNewLabel.setBounds(749, 67, 481, 528);
		contentPane.add(lblNewLabel);

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
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmPatrocinador\\logoIntagram31x30 (4).png"));
		lblNewLabel_1.setBounds(582, 13, 31, 30);
		panel.add(lblNewLabel_1);

		JTextPane txtpnApoieNossoProjeto = new JTextPane();
		txtpnApoieNossoProjeto.setEditable(false);
		txtpnApoieNossoProjeto.setForeground(new Color(0, 102, 102));
		txtpnApoieNossoProjeto.setFont(new Font("Arial", Font.BOLD, 30));
		txtpnApoieNossoProjeto.setText("Apoie nosso projeto sendo um patrocinador Ecopet!");
		txtpnApoieNossoProjeto.setBounds(114, 67, 760, 57);
		contentPane.add(txtpnApoieNossoProjeto);

		JTextPane txtpnEstamosFelizesPor = new JTextPane();
		txtpnEstamosFelizesPor.setEditable(false);
		txtpnEstamosFelizesPor.setForeground(new Color(0, 102, 102));
		txtpnEstamosFelizesPor.setFont(new Font("Arial", Font.PLAIN, 20));
		txtpnEstamosFelizesPor.setText(
				"Estamos felizes por você estar aqui  ♥ \r\nComeçar é fácil: gostaria de fazer uma reunião para nos \r\nconhecer melhor? Preencha o formulário abaixo \r\nque em breve entraremos em contato. \r\nSuas informações estão seguras com a gente!");
		txtpnEstamosFelizesPor.setBounds(114, 125, 508, 133);
		contentPane.add(txtpnEstamosFelizesPor);

		txtDigiteONome = new JTextField("Digite o nome completo");
		txtDigiteONome.setForeground(new Color(0, 102, 102));
		txtDigiteONome.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				txtDigiteONome.setText("    ");
			}

		});
		txtDigiteONome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtDigiteONome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtDigiteONome.setText("     Digite o nome completo");
		txtDigiteONome.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		txtDigiteONome.setBackground(new Color(255, 255, 255));
		txtDigiteONome.setBounds(123, 284, 475, 38);
		contentPane.add(txtDigiteONome);
		txtDigiteONome.setColumns(10);
		
		txtEmail = new JTextField("E-mail");
		txtEmail.setForeground(new Color(0, 102, 102));
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("    ");
			}
		});
		txtEmail.setText("    E-mail");
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setBounds(123, 345, 475, 38);
		contentPane.add(txtEmail);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();) {
					
					// Execute a query
					String sql = "INSERT INTO patrocinador VALUES ('" + 
							txtDigiteONome.getText().trim() + "','" +
							txtEmail.getText().trim() + "','" +
							cxTextCnpj.getText().trim() + "','" +
							cxTextCelularPatrocinador.getText().trim()+ "'" + ")";
					
					System.out.println(sql);
					
					stmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(contentPane, "Registro criado com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(contentPane, "Não foi possível criar registro");
					ex.printStackTrace();
				}
			}
		});
		btnEnviar.setBackground(new Color(0, 102, 102));
		btnEnviar.setForeground(new Color(255, 255, 255));
		btnEnviar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnEnviar.setBounds(472, 524, 126, 42);
		contentPane.add(btnEnviar);

		JButton btnVoltar = new JButton("");
		btnVoltar.setBorder(null);
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaSejaUmPatrocinador\\imgVoltar102x57.jpg"));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal novaTelaPrincipal = new TelaPrincipal();
				novaTelaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(1240, 527, 102, 57);
		contentPane.add(btnVoltar);

		cxTextCnpj = new JFormattedTextField(new MaskFormatter("  ##.###.### / #### - ##"));
		cxTextCnpj.setText("  (  )     -    ");
		cxTextCnpj.setForeground(new Color(0, 102, 102));
		cxTextCnpj.setFont(new Font("Arial", Font.PLAIN, 16));
		cxTextCnpj.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		cxTextCnpj.setBounds(213, 405, 385, 38);
		contentPane.add(cxTextCnpj);

		JLabel lblNewLabel_4 = new JLabel("    CNPJ");
		lblNewLabel_4.setBackground(new Color(0, 102, 102));
		lblNewLabel_4.setForeground(new Color(0, 102, 102));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		lblNewLabel_4.setBounds(123, 405, 92, 38);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(0, 102, 102));
		lblNewLabel_5.setBounds(62, 554, 102, 30);
		contentPane.add(lblNewLabel_5);

		cxTextCelularPatrocinador = new JFormattedTextField(new MaskFormatter("  (##) # #### - ####"));
		cxTextCelularPatrocinador.setText("  (  )     -    ");
		cxTextCelularPatrocinador.setForeground(new Color(0, 102, 102));
		cxTextCelularPatrocinador.setFont(new Font("Arial", Font.PLAIN, 16));
		cxTextCelularPatrocinador.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		cxTextCelularPatrocinador.setBounds(213, 469, 385, 38);
		contentPane.add(cxTextCelularPatrocinador);

		JLabel lblNewLabel_4_1 = new JLabel("  Celular  ");
		lblNewLabel_4_1.setForeground(new Color(0, 102, 102));
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		lblNewLabel_4_1.setBackground(new Color(0, 102, 102));
		lblNewLabel_4_1.setBounds(123, 469, 92, 38);
		contentPane.add(lblNewLabel_4_1);
	}

}
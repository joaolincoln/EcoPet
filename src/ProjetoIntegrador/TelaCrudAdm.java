package ProjetoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.Font;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class TelaCrudAdm extends JFrame {
	private JTable table;
	private JPanel contentPane;
	private JTextField textIdCadastroPontosColeta;
	private JTextField textNomeCadastroPontosColeta;
	private JTextField textEnderecoCadastroPontosColeta;
	private JTextField textBairroCadastroPontosColeta;
	private JTextField textIdCpfCadastroVoluntarios;
	private JTextField textNomeCadastroVoluntarios;
	private JTextField textEnderecoCadastroVoluntarios;
	private JTextField textEmailCadastroVoluntarios;
	private JTextField textRegiaoCadastroPontosColeta;
	private JTextField textAreaAtuacaoCadastroVoluntarios;

	static final String DB_URL = "jdbc:mysql://localhost/projetointegrador";
	static final String USER = "root";
	static final String PASS = "netolindo";
	private JTextField txtCidadeCadastroVoluntarios;
	private JTextField TextCelularCadastroVoluntarios;
	private JTextField txtRelaoDeVoluntrios;
	private JTextField txtRelaoDePatrocinadores;
	private JTextField txtRelaoDePontos;
	private JTextField txtexcetoRegioNorte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudAdm frame = new TelaCrudAdm();
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
	public TelaCrudAdm() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal novaTelaPrincipal = new TelaPrincipal ();
				novaTelaPrincipal.setVisible(true);
				dispose();					
			}
		});
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaCrudAdm\\imgVoltar102x57.jpg"));
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(1250, 574, 102, 57);
		contentPane.add(btnVoltar);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(374, 249, 604, 372);
		contentPane.add(tabbedPane);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("          Cadastro dos voluntários          ", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblIdCpf = new JLabel("ID/CPF");
		lblIdCpf.setBounds(34, 11, 66, 17);
		lblIdCpf.setForeground(new Color(0, 102, 102));
		lblIdCpf.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblIdCpf);

		textIdCpfCadastroVoluntarios = new JTextField("    Digite o ID ou CPF");
		textIdCpfCadastroVoluntarios.setBounds(34, 29, 377, 25);
		textIdCpfCadastroVoluntarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textIdCpfCadastroVoluntarios.setText("    ");
			}
		});
		textIdCpfCadastroVoluntarios.setForeground(new Color(0, 102, 102));
		textIdCpfCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		textIdCpfCadastroVoluntarios.setColumns(10);
		textIdCpfCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		panel_3.add(textIdCpfCadastroVoluntarios);

		JLabel lblNomeVolunt = new JLabel("Nome");
		lblNomeVolunt.setBounds(34, 55, 96, 17);
		lblNomeVolunt.setForeground(new Color(0, 102, 102));
		lblNomeVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblNomeVolunt);

		textNomeCadastroVoluntarios = new JTextField("    Digite o nome completo");
		textNomeCadastroVoluntarios.setBounds(34, 71, 377, 25);
		textNomeCadastroVoluntarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textNomeCadastroVoluntarios.setText("    ");
			}
		});
		textNomeCadastroVoluntarios.setForeground(new Color(0, 102, 102));
		textNomeCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		textNomeCadastroVoluntarios.setColumns(10);
		textNomeCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		panel_3.add(textNomeCadastroVoluntarios);

		JLabel lblEnderecoVolunt = new JLabel("Endereço");
		lblEnderecoVolunt.setBounds(34, 98, 96, 17);
		lblEnderecoVolunt.setForeground(new Color(0, 102, 102));
		lblEnderecoVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblEnderecoVolunt);

		textEnderecoCadastroVoluntarios = new JTextField("    Rua, número e complemento");
		textEnderecoCadastroVoluntarios.setBounds(34, 114, 377, 25);
		textEnderecoCadastroVoluntarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textEnderecoCadastroVoluntarios.setText("    ");
			}
		});
		textEnderecoCadastroVoluntarios.setForeground(new Color(0, 102, 102));
		textEnderecoCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		textEnderecoCadastroVoluntarios.setColumns(10);
		textEnderecoCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		panel_3.add(textEnderecoCadastroVoluntarios);

		JLabel lblEmailVolunt = new JLabel("E-mail");
		lblEmailVolunt.setBounds(34, 187, 96, 12);
		lblEmailVolunt.setForeground(new Color(0, 102, 102));
		lblEmailVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblEmailVolunt);

		textEmailCadastroVoluntarios = new JTextField("    Digite o e-mail");
		textEmailCadastroVoluntarios.setBounds(34, 200, 377, 25);
		textEmailCadastroVoluntarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textEmailCadastroVoluntarios.setText("    ");
			}
		});
		textEmailCadastroVoluntarios.setForeground(new Color(0, 102, 102));
		textEmailCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		textEmailCadastroVoluntarios.setColumns(10);
		textEmailCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		panel_3.add(textEmailCadastroVoluntarios);

		JLabel lblAreadeAtuacaoVolunt = new JLabel("Área de atuação");
		lblAreadeAtuacaoVolunt.setBounds(34, 229, 153, 17);
		lblAreadeAtuacaoVolunt.setForeground(new Color(0, 102, 102));
		lblAreadeAtuacaoVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblAreadeAtuacaoVolunt);

		textAreaAtuacaoCadastroVoluntarios = new JTextField("    Digite a área de atuação");
				textAreaAtuacaoCadastroVoluntarios.setBounds(34, 245, 377, 29);
		textAreaAtuacaoCadastroVoluntarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textAreaAtuacaoCadastroVoluntarios.setText("    ");
			}
		});
		textAreaAtuacaoCadastroVoluntarios.setForeground(new Color(0, 102, 102));
		textAreaAtuacaoCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		textAreaAtuacaoCadastroVoluntarios.setColumns(10);
		textAreaAtuacaoCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		panel_3.add(textAreaAtuacaoCadastroVoluntarios);

		JLabel lblNewLabel_1_2 = new JLabel("Cadastro dos voluntários");
		lblNewLabel_1_2.setBounds(174, 0, 235, 30);
		lblNewLabel_1_2.setForeground(new Color(0, 102, 102));
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 19));
		panel_3.add(lblNewLabel_1_2);

		JButton btnAdicionarCadastroVoluntarios = new JButton("Adicionar");
		btnAdicionarCadastroVoluntarios.setBounds(454, 113, 114, 27);
		btnAdicionarCadastroVoluntarios.setForeground(Color.WHITE);
		btnAdicionarCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAdicionarCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAdicionarCadastroVoluntarios.setBackground(new Color(0, 102, 102));
		//botao adicionar voluntário
		btnAdicionarCadastroVoluntarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();
						) {		      
					// Execute a query
					String sql = "INSERT INTO voluntario VALUES ('"+
							textIdCpfCadastroVoluntarios.getText().trim()+"','"+
							textNomeCadastroVoluntarios.getText().trim()+"','"+
							textEnderecoCadastroVoluntarios.getText().trim()+"','"+
							TextCelularCadastroVoluntarios.getText().trim()+"','"+
							textEmailCadastroVoluntarios.getText().trim()+"','"+
							textAreaAtuacaoCadastroVoluntarios.getText().trim()+"','"+
							txtCidadeCadastroVoluntarios.getText().trim()+ "'" + ")";

					System.out.println(sql);

					stmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(panel_3, "Registro criado com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(panel_3, "Não foi possível criar registro");
					ex.printStackTrace();
				}
			}

		});




		panel_3.add(btnAdicionarCadastroVoluntarios);

		JButton btnAtualizarCadastroVoluntarios = new JButton("Atualizar");
		btnAtualizarCadastroVoluntarios.setBounds(454, 159, 114, 27);
		btnAtualizarCadastroVoluntarios.setForeground(Color.WHITE);
		btnAtualizarCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAtualizarCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAtualizarCadastroVoluntarios.setBackground(new Color(0, 102, 102));
		panel_3.add(btnAtualizarCadastroVoluntarios);

		JButton btnExcluirCadastroVoluntarios = new JButton("Excluir");
		btnExcluirCadastroVoluntarios.setBounds(454, 205, 114, 27);
		btnExcluirCadastroVoluntarios.setForeground(Color.WHITE);
		btnExcluirCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		btnExcluirCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnExcluirCadastroVoluntarios.setBackground(new Color(0, 102, 102));
		panel_3.add(btnExcluirCadastroVoluntarios);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(34, 274, 153, 17);
		lblCidade.setForeground(new Color(0, 102, 102));
		lblCidade.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblCidade);

		txtCidadeCadastroVoluntarios = new JTextField("    Digite a cidade");
		txtCidadeCadastroVoluntarios.setBounds(34, 288, 377, 29);
		txtCidadeCadastroVoluntarios.setForeground(new Color(0, 102, 102));
		txtCidadeCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		txtCidadeCadastroVoluntarios.setColumns(10);
		txtCidadeCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		panel_3.add(txtCidadeCadastroVoluntarios);

		JLabel lblCidade_1 = new JLabel("Celular");
		lblCidade_1.setBounds(34, 136, 153, 25);
		lblCidade_1.setForeground(new Color(0, 102, 102));
		lblCidade_1.setFont(new Font("Arial", Font.BOLD, 14));
		panel_3.add(lblCidade_1);

		TextCelularCadastroVoluntarios = new JFormattedTextField(new MaskFormatter("  (##) # #### - ####"));
		TextCelularCadastroVoluntarios.setBounds(34, 156, 377, 29);
		TextCelularCadastroVoluntarios.setText("  (  )     -    ");
		TextCelularCadastroVoluntarios.setForeground(new Color(0, 102, 102));
		TextCelularCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		TextCelularCadastroVoluntarios.setColumns(10);
		TextCelularCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		panel_3.add(TextCelularCadastroVoluntarios);

		//		JLabel lblNewLabel = new JLabel("");
		//		lblNewLabel.setBounds(107, 35, 1368, 735);
		//		lblNewLabel.setIcon(new ImageIcon(""));
		//		contentPane.add(lblNewLabel);
		//		
		//		JButton btnVoltar = new JButton("");
		//		btnVoltar.setBorder(null);
		//		btnVoltar.setIcon(new ImageIcon("C:\\Users\\dessa\\OneDrive\\Área de Trabalho\\ProjetoIntegrador ultimo\\imgVoltar102x57.jpg"));
		//		btnVoltar.addActionListener(new ActionListener() {
		//			public void actionPerformed(ActionEvent e) {
		//				TelaPrincipal novaTelaPrincipal = new TelaPrincipal();
		//				novaTelaPrincipal.setVisible(true);
		//				dispose();
		//			}
		//		});	


		//codigos pagina cadastro voluntarios


		btnAdicionarCadastroVoluntarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();
						) {		      
					// Execute a query
					String sql = "INSERT INTO voluntario VALUES (null,'"+
							textIdCpfCadastroVoluntarios.getText().trim()+"','"+
							textNomeCadastroVoluntarios.getText().trim()+"','"+
							textEnderecoCadastroVoluntarios.getText().trim()+"','"+
							TextCelularCadastroVoluntarios.getText().trim()+"','"+
							textEmailCadastroVoluntarios.getText().trim()+"','"+
							txtCidadeCadastroVoluntarios.getText().trim()+"','"+
							textAreaAtuacaoCadastroVoluntarios.getText().trim()+ "'" + ")";


					System.out.println(sql);

					stmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(panel_3, "Registro criado com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(panel_3, "Não foi possível criar registro");
					ex.printStackTrace();
				}
			}

		});

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("          Cadastro pontos de coleta          ", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(121, 18, 27, 17);
		lblId.setForeground(new Color(0, 102, 102));
		lblId.setFont(new Font("Arial", Font.BOLD, 14));
		panel_2.add(lblId);

		textIdCadastroPontosColeta = new JTextField("    Digite o ID ou deixe em branco");
		textIdCadastroPontosColeta.setForeground(new Color(0, 102, 102));
		textIdCadastroPontosColeta.setCaretColor(new Color(0, 102, 102));
		textIdCadastroPontosColeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textIdCadastroPontosColeta.setText("    ");	
			}
		});
		textIdCadastroPontosColeta.setBounds(121, 34, 377, 34);
		textIdCadastroPontosColeta.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		textIdCadastroPontosColeta.setFont(new Font("Arial", Font.PLAIN, 17));
		panel_2.add(textIdCadastroPontosColeta);
		textIdCadastroPontosColeta.setColumns(10);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(0, 102, 102));
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		lblNome.setBounds(121, 70, 96, 17);
		panel_2.add(lblNome);

		textNomeCadastroPontosColeta = new JTextField("    Digite o nome completo");
		textNomeCadastroPontosColeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textNomeCadastroPontosColeta.setText("    ");
			}
		});
		textNomeCadastroPontosColeta.setForeground(new Color(0, 102, 102));
		textNomeCadastroPontosColeta.setFont(new Font("Arial", Font.PLAIN, 17));
		textNomeCadastroPontosColeta.setColumns(10);
		textNomeCadastroPontosColeta.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		textNomeCadastroPontosColeta.setBounds(121, 86, 377, 34);
		panel_2.add(textNomeCadastroPontosColeta);

		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setForeground(new Color(0, 102, 102));
		lblEndereco.setFont(new Font("Arial", Font.BOLD, 14));
		lblEndereco.setBounds(121, 126, 96, 17);
		panel_2.add(lblEndereco);

		textEnderecoCadastroPontosColeta = new JTextField("    Rua, número e complemento");
		textEnderecoCadastroPontosColeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textEnderecoCadastroPontosColeta.setText("    ");
			}
		});
		textEnderecoCadastroPontosColeta.setForeground(new Color(0, 102, 102));
		textEnderecoCadastroPontosColeta.setFont(new Font("Arial", Font.PLAIN, 17));
		textEnderecoCadastroPontosColeta.setColumns(10);
		textEnderecoCadastroPontosColeta.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		textEnderecoCadastroPontosColeta.setBounds(121, 142, 377, 34);
		panel_2.add(textEnderecoCadastroPontosColeta);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setForeground(new Color(0, 102, 102));
		lblBairro.setFont(new Font("Arial", Font.BOLD, 14));
		lblBairro.setBounds(121, 178, 96, 17);
		panel_2.add(lblBairro);

		textBairroCadastroPontosColeta = new JTextField("    Digite o bairro");
		textBairroCadastroPontosColeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textBairroCadastroPontosColeta.setText("    ");
			}
		});
		textBairroCadastroPontosColeta.setForeground(new Color(0, 102, 102));
		textBairroCadastroPontosColeta.setFont(new Font("Arial", Font.PLAIN, 17));
		textBairroCadastroPontosColeta.setColumns(10);
		textBairroCadastroPontosColeta.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		textBairroCadastroPontosColeta.setBounds(121, 195, 377, 34);
		panel_2.add(textBairroCadastroPontosColeta);

		JLabel lblRegiao = new JLabel("Região");
		lblRegiao.setForeground(new Color(0, 102, 102));
		lblRegiao.setFont(new Font("Arial", Font.BOLD, 14));
		lblRegiao.setBounds(121, 232, 96, 17);
		panel_2.add(lblRegiao);

		textRegiaoCadastroPontosColeta = new JTextField("    Digite a região");
		textRegiaoCadastroPontosColeta.setForeground(new Color(0, 102, 102));
		textRegiaoCadastroPontosColeta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textRegiaoCadastroPontosColeta.setText("    ");
			}
		});
		textRegiaoCadastroPontosColeta.setFont(new Font("Arial", Font.PLAIN, 17));
		textRegiaoCadastroPontosColeta.setColumns(10);
		textRegiaoCadastroPontosColeta.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		textRegiaoCadastroPontosColeta.setBounds(121, 249, 377, 34);
		panel_2.add(textRegiaoCadastroPontosColeta);

		JButton btnAdicionarCadastroVoluntarios_1 = new JButton("Adicionar");
		btnAdicionarCadastroVoluntarios_1.setForeground(Color.WHITE);
		btnAdicionarCadastroVoluntarios_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAdicionarCadastroVoluntarios_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAdicionarCadastroVoluntarios_1.setBackground(new Color(0, 102, 102));
		btnAdicionarCadastroVoluntarios_1.setBounds(121, 294, 114, 27);
		panel_2.add(btnAdicionarCadastroVoluntarios_1);

		JButton btnAtualizarCadastroVoluntarios_1 = new JButton("Atualizar");
		btnAtualizarCadastroVoluntarios_1.setForeground(Color.WHITE);
		btnAtualizarCadastroVoluntarios_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAtualizarCadastroVoluntarios_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAtualizarCadastroVoluntarios_1.setBackground(new Color(0, 102, 102));
		btnAtualizarCadastroVoluntarios_1.setBounds(255, 294, 112, 27);
		panel_2.add(btnAtualizarCadastroVoluntarios_1);

		JButton btnExcluirCadastroVoluntarios_1 = new JButton("Excluir");
		btnExcluirCadastroVoluntarios_1.setForeground(Color.WHITE);
		btnExcluirCadastroVoluntarios_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnExcluirCadastroVoluntarios_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnExcluirCadastroVoluntarios_1.setBackground(new Color(0, 102, 102));
		btnExcluirCadastroVoluntarios_1.setBounds(386, 294, 112, 27);
		panel_2.add(btnExcluirCadastroVoluntarios_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Cadastro dos pontos de coleta");
		lblNewLabel_1_1_1.setForeground(new Color(0, 102, 102));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_1_1_1.setBounds(160, 0, 284, 35);
		panel_2.add(lblNewLabel_1_1_1);

		btnAdicionarCadastroVoluntarios_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();
						) {		      
					// Execute a query
					String sql = "INSERT INTO ponto_de_coleta VALUES (null,'"+
							textNomeCadastroPontosColeta.getText().trim()+"','"+
							//formattedTextCelularCadastroPontosColeta.getText().trim()+"','"+
							textEnderecoCadastroPontosColeta.getText().trim()+"','"+
							textBairroCadastroPontosColeta.getText().trim()+"','"+
							textRegiaoCadastroPontosColeta.getText().trim()+"')";
					System.out.println(sql);

					stmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(panel_2, "Registro criado com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(panel_2, "Não foi possível criar registro");
					ex.printStackTrace();
				}
			}
		});

		btnAtualizarCadastroVoluntarios_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();
						) {		      
					// Execute a query
					String sql = "update ponto_de_coleta "
							+ "SET nome='" + textNomeCadastroPontosColeta.getText().trim() + "',"
							//+ "celular='"+ formattedTextCelularCadastroPontosColeta.getText().trim() +"',"
							+ "endereco='"+ textEnderecoCadastroPontosColeta.getText().trim() +"',"
							+ "bairro='"+ textBairroCadastroPontosColeta.getText().trim() +"',"
							+ "regiao='"+ textRegiaoCadastroPontosColeta.getText().trim() +"'"
							+ " WHERE idponto="+ textIdCadastroPontosColeta.getText().trim();
					System.out.println(sql);

					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(panel_2, "Registro atualizado com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(panel_2, "Não foi possível atualizar registro");
					ex.printStackTrace();
				}
			}
		});

		btnExcluirCadastroVoluntarios_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();
						) {		      
					// Execute a query
					String sql = "delete from ponto_de_coleta"
							+ " WHERE idponto="+ textIdCadastroPontosColeta.getText().trim();
					System.out.println(sql);

					stmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(panel_2, "Registro Excluído com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(panel_2, "Não foi possível excluir o registro!");
					ex.printStackTrace();
				}
			}
		});

		btnAtualizarCadastroVoluntarios_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();
						) {		      
					// Execute 
					String sql = "update voluntario "
							+ "SET area_de_atuacao ='" + textAreaAtuacaoCadastroVoluntarios.getText().trim() + "',"
							+ "nome='"+ textNomeCadastroVoluntarios.getText().trim() +"',"
							+ "endereco='"+ textEnderecoCadastroVoluntarios.getText().trim() +"',"
							//+ "celular='"+ formattedTextCelularCadastroVoluntarios.getText().trim() +"',"
							+ "email='"+ textEmailCadastroVoluntarios.getText().trim() +"'"
							+ " WHERE id_voluntario="+ textIdCadastroPontosColeta.getText().trim();
					System.out.println(sql);

					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(panel_2, "Registro atualizado com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(panel_2, "Não foi possível atualizar registro");
					ex.printStackTrace();
				}
			}
		});

		btnExcluirCadastroVoluntarios_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
						Statement stmt = conn.createStatement();
						) {		      
					// Executar
					String sql = "delete from voluntario"
							+ " WHERE id_voluntario="+ textIdCadastroPontosColeta.getText().trim();
					System.out.println(sql);

					stmt.executeUpdate(sql);

					JOptionPane.showMessageDialog(panel_2, "Registro Excluído com sucesso!");
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(panel_2, "Não foi possível excluir o registro!");
					ex.printStackTrace();
				}

			}


		});

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("   Consulta voluntários    ", null, panel, null);
		panel.setLayout(null);

		txtRelaoDeVoluntrios = new JTextField();
		txtRelaoDeVoluntrios.setBorder(null);
		txtRelaoDeVoluntrios.setForeground(new Color(0, 102, 102));
		txtRelaoDeVoluntrios.setFont(new Font("Arial", Font.BOLD, 20));
		txtRelaoDeVoluntrios.setBackground(new Color(255, 255, 255));
		txtRelaoDeVoluntrios.setText("Relação de Voluntários por cidade:");
		txtRelaoDeVoluntrios.setBounds(128, 30, 332, 36);
		panel.add(txtRelaoDeVoluntrios);
		txtRelaoDeVoluntrios.setColumns(10);

		JComboBox comboBoxCidadeVoluntario = new JComboBox();
		comboBoxCidadeVoluntario.setBorder(new LineBorder(new Color(0, 102, 102), 3));
		comboBoxCidadeVoluntario.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBoxCidadeVoluntario.setModel(new DefaultComboBoxModel(new String[] {"     Escolha a cidade desejada:", "Biguaçu", "Florianópolis", "Governador Celso Ramos", "São José", "Palhoça", "Outras cidades"}));
		comboBoxCidadeVoluntario.setToolTipText("");
		comboBoxCidadeVoluntario.setBounds(97, 69, 274, 36);
		panel.add(comboBoxCidadeVoluntario);

		JButton btnBuscarCidadeVoluntarios = new JButton("Buscar");
		btnBuscarCidadeVoluntarios.setFont(new Font("Arial", Font.PLAIN, 16));
		btnBuscarCidadeVoluntarios.setForeground(new Color(255, 255, 205));
		btnBuscarCidadeVoluntarios.setBackground(new Color(0, 102, 102));
		btnBuscarCidadeVoluntarios.setBorder(new LineBorder(new Color(0, 102, 102)));
		btnBuscarCidadeVoluntarios.setBounds(370, 70, 126, 35);
		btnBuscarCidadeVoluntarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel tableModel = new DefaultTableModel();				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(375,430, 718, 192);
				scrollPane.doLayout();

				contentPane.add(scrollPane);

				table = new JTable();
				scrollPane.setViewportView(table);
				table.setModel(tableModel);
				table.setEnabled(false);	
				table.setFont(new Font("Arial", Font.PLAIN, 14));//tamanho da letra da tabela
				table.setVisible(true);		

				table.getTableHeader().setFont(new Font("arial", Font.BOLD, 17));  //tamanho da letra do titulo

				try {

					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM voluntario where cidade = '" + comboBoxCidadeVoluntario.getSelectedItem() + "'");

					tableModel.addColumn("cpf");
					tableModel.addColumn("nome");				
					tableModel.addColumn("endereco");
					tableModel.addColumn("celular");
					tableModel.addColumn("email");
					tableModel.addColumn("area_de_atuacao");
					tableModel.addColumn("cidade");

					ResultSetMetaData metaData = rs.getMetaData();
					int columnCount = metaData.getColumnCount();
					while (rs.next()) {
						Object[] rowData = new Object[columnCount];
						for (int i = 1; i <= columnCount; i++) {
							rowData[i - 1] = rs.getObject(i);
						}

						tableModel.addRow(rowData);			
					}
					rs.close();
					stmt.close();
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		panel.add(btnBuscarCidadeVoluntarios);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("    Consulta patrocinadores     ", null, panel_1, null);
		panel_1.setLayout(null);

		txtRelaoDePatrocinadores = new JTextField();
		txtRelaoDePatrocinadores.setText("Relação de Patrocinadores por tipos de e-mail:");
		txtRelaoDePatrocinadores.setForeground(new Color(0, 102, 102));
		txtRelaoDePatrocinadores.setFont(new Font("Arial", Font.BOLD, 20));
		txtRelaoDePatrocinadores.setColumns(10);
		txtRelaoDePatrocinadores.setBorder(null);
		txtRelaoDePatrocinadores.setBackground(Color.WHITE);
		txtRelaoDePatrocinadores.setBounds(91, 37, 445, 36);
		panel_1.add(txtRelaoDePatrocinadores);

		JComboBox comboBox_TipoEmail = new JComboBox();
		comboBox_TipoEmail.setModel(new DefaultComboBoxModel(new String[] {"     Escolha o tipo de E-mail:", "gov.br", "gmail.com", "outlook.com"}));
		comboBox_TipoEmail.setToolTipText("");
		comboBox_TipoEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox_TipoEmail.setBorder(new LineBorder(new Color(0, 102, 102), 3));
		comboBox_TipoEmail.setBounds(110, 72, 274, 36);
		panel_1.add(comboBox_TipoEmail);










		JButton btnBuscarEmailPatrocinador = new JButton("Buscar");
		btnBuscarEmailPatrocinador.setForeground(new Color(255, 255, 205));
		btnBuscarEmailPatrocinador.setFont(new Font("Arial", Font.PLAIN, 16));
		btnBuscarEmailPatrocinador.setBorder(new LineBorder(new Color(0, 102, 102)));
		btnBuscarEmailPatrocinador.setBackground(new Color(0, 102, 102));
		btnBuscarEmailPatrocinador.setBounds(383, 73, 126, 35);
		btnBuscarEmailPatrocinador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel tableModel = new DefaultTableModel();				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(375,430, 718, 192);
				scrollPane.doLayout();

				contentPane.add(scrollPane);

				table = new JTable();
				scrollPane.setViewportView(table);
				table.setModel(tableModel);
				table.setEnabled(false);	
				table.setFont(new Font("Arial", Font.PLAIN, 14));//tamanho da letra da tabela
				table.setVisible(true);		

				table.getTableHeader().setFont(new Font("arial", Font.BOLD, 17));  //tamanho da letra do titulo

				try {

					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM patrocinador where email like '%" + comboBox_TipoEmail.getSelectedItem() + "'");

					
					tableModel.addColumn("nome");	
					tableModel.addColumn("email");
					tableModel.addColumn("cnpj");
					tableModel.addColumn("celular");
				

					ResultSetMetaData metaData = rs.getMetaData();
					int columnCount = metaData.getColumnCount();
					while (rs.next()) {
						Object[] rowData = new Object[columnCount];
						for (int i = 1; i <= columnCount; i++) {
							rowData[i - 1] = rs.getObject(i);
						}

						tableModel.addRow(rowData);			
					}
					rs.close();
					stmt.close();
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(btnBuscarEmailPatrocinador);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("  Consulta pontos de coleta  ", null, panel_4, null);
		panel_4.setLayout(null);

		txtRelaoDePontos = new JTextField();
		txtRelaoDePontos.setText("Relação de Pontos de Coleta:");
		txtRelaoDePontos.setForeground(new Color(0, 102, 102));
		txtRelaoDePontos.setFont(new Font("Arial", Font.BOLD, 20));
		txtRelaoDePontos.setColumns(10);
		txtRelaoDePontos.setBorder(null);
		txtRelaoDePontos.setBackground(Color.WHITE);
		txtRelaoDePontos.setBounds(156, 27, 285, 36);
		panel_4.add(txtRelaoDePontos);

		JButton btnBuscarPontosColetaExcetoNorte = new JButton("Buscar");
		btnBuscarPontosColetaExcetoNorte.setForeground(new Color(255, 255, 205));
		btnBuscarPontosColetaExcetoNorte.setFont(new Font("Arial", Font.PLAIN, 16));
		btnBuscarPontosColetaExcetoNorte.setBorder(new LineBorder(new Color(0, 102, 102)));
		btnBuscarPontosColetaExcetoNorte.setBackground(new Color(0, 102, 102));
		btnBuscarPontosColetaExcetoNorte.setBounds(238, 91, 126, 35);
		btnBuscarPontosColetaExcetoNorte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel tableModel = new DefaultTableModel();				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(375,430, 718, 223);
				scrollPane.doLayout();

				contentPane.add(scrollPane);

				table = new JTable();
				scrollPane.setViewportView(table);
				table.setModel(tableModel);
				table.setEnabled(false);	
				table.setFont(new Font("Arial", Font.PLAIN, 14));//tamanho da letra da tabela
				table.setVisible(true);		

				table.getTableHeader().setFont(new Font("arial", Font.BOLD, 17));  //tamanho da letra do titulo

				try {

					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM  ponto_de_coleta WHERE regiao != 'Norte da Ilha'");

					tableModel.addColumn("Id");
					tableModel.addColumn("Nome");				
					tableModel.addColumn("Endereço");
					tableModel.addColumn("Bairro");
					tableModel.addColumn("Região");

					ResultSetMetaData metaData = rs.getMetaData();
					int columnCount = metaData.getColumnCount();
					while (rs.next()) {
						Object[] rowData = new Object[columnCount];
						for (int i = 1; i <= columnCount; i++) {
							rowData[i - 1] = rs.getObject(i);
						}

						tableModel.addRow(rowData);			
					}
					rs.close();
					stmt.close();
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_4.add(btnBuscarPontosColetaExcetoNorte);

		txtexcetoRegioNorte = new JTextField();
		txtexcetoRegioNorte.setBorder(null);
		txtexcetoRegioNorte.setForeground(new Color(0, 102, 102));
		txtexcetoRegioNorte.setFont(new Font("Arial", Font.PLAIN, 16));
		txtexcetoRegioNorte.setText("(exceto região norte da ilha)");
		txtexcetoRegioNorte.setBounds(199, 60, 202, 20);
		panel_4.add(txtexcetoRegioNorte);
		txtexcetoRegioNorte.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaCrudAdm\\Design sem nome (19).png"));
		lblNewLabel.setBounds(21, 0, 1352, 696);
		contentPane.add(lblNewLabel);

	}
}




















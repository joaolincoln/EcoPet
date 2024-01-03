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
import java.sql.SQLException;
import java.sql.Statement;

public class TelaCrudAdm extends JFrame {

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
	
   static final String DB_URL = "jdbc:mysql://localhost/projeto";
   static final String USER = "root";
   static final String PASS = "1234";

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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Cadastro pontos de coleta", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(123, 21, 27, 17);
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
		textIdCadastroPontosColeta.setBounds(123, 37, 377, 34);
		textIdCadastroPontosColeta.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		textIdCadastroPontosColeta.setFont(new Font("Arial", Font.PLAIN, 17));
		panel_2.add(textIdCadastroPontosColeta);
		textIdCadastroPontosColeta.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(0, 102, 102));
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		lblNome.setBounds(123, 73, 96, 17);
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
		textNomeCadastroPontosColeta.setBounds(123, 89, 377, 34);
		panel_2.add(textNomeCadastroPontosColeta);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setForeground(new Color(0, 102, 102));
		lblEndereco.setFont(new Font("Arial", Font.BOLD, 14));
		lblEndereco.setBounds(123, 129, 96, 17);
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
		textEnderecoCadastroPontosColeta.setBounds(123, 145, 377, 34);
		panel_2.add(textEnderecoCadastroPontosColeta);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setForeground(new Color(0, 102, 102));
		lblBairro.setFont(new Font("Arial", Font.BOLD, 14));
		lblBairro.setBounds(123, 181, 96, 17);
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
		textBairroCadastroPontosColeta.setBounds(123, 198, 377, 34);
		panel_2.add(textBairroCadastroPontosColeta);
		
		JLabel lblRegiao = new JLabel("Região");
		lblRegiao.setForeground(new Color(0, 102, 102));
		lblRegiao.setFont(new Font("Arial", Font.BOLD, 14));
		lblRegiao.setBounds(123, 235, 96, 17);
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
		textRegiaoCadastroPontosColeta.setBounds(123, 252, 377, 34);
		panel_2.add(textRegiaoCadastroPontosColeta);
		
		JButton btnAdicionarCadastroVoluntarios_1 = new JButton("Adicionar");
		btnAdicionarCadastroVoluntarios_1.setForeground(Color.WHITE);
		btnAdicionarCadastroVoluntarios_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAdicionarCadastroVoluntarios_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAdicionarCadastroVoluntarios_1.setBackground(new Color(0, 102, 102));
		btnAdicionarCadastroVoluntarios_1.setBounds(123, 297, 114, 39);
		panel_2.add(btnAdicionarCadastroVoluntarios_1);
		
		JButton btnAtualizarCadastroVoluntarios_1 = new JButton("Atualizar");
		btnAtualizarCadastroVoluntarios_1.setForeground(Color.WHITE);
		btnAtualizarCadastroVoluntarios_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAtualizarCadastroVoluntarios_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAtualizarCadastroVoluntarios_1.setBackground(new Color(0, 102, 102));
		btnAtualizarCadastroVoluntarios_1.setBounds(257, 297, 112, 39);
		panel_2.add(btnAtualizarCadastroVoluntarios_1);
		
		JButton btnExcluirCadastroVoluntarios_1 = new JButton("Excluir");
		btnExcluirCadastroVoluntarios_1.setForeground(Color.WHITE);
		btnExcluirCadastroVoluntarios_1.setFont(new Font("Arial", Font.PLAIN, 17));
		btnExcluirCadastroVoluntarios_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnExcluirCadastroVoluntarios_1.setBackground(new Color(0, 102, 102));
		btnExcluirCadastroVoluntarios_1.setBounds(388, 297, 112, 39);
		panel_2.add(btnExcluirCadastroVoluntarios_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cadastro dos pontos de coleta");
		lblNewLabel_1_1_1.setForeground(new Color(0, 102, 102));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_1_1_1.setBounds(160, 0, 284, 35);
		panel_2.add(lblNewLabel_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Cadastro dos voluntários", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblIdCpf = new JLabel("ID/CPF");
		lblIdCpf.setForeground(new Color(0, 102, 102));
		lblIdCpf.setFont(new Font("Arial", Font.BOLD, 14));
		lblIdCpf.setBounds(121, 21, 66, 17);
		panel_3.add(lblIdCpf);
		
		textIdCpfCadastroVoluntarios = new JTextField("    Digite o ID ou CPF");
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
		textIdCpfCadastroVoluntarios.setBounds(121, 39, 377, 32);
		panel_3.add(textIdCpfCadastroVoluntarios);
		
		JLabel lblNomeVolunt = new JLabel("Nome");
		lblNomeVolunt.setForeground(new Color(0, 102, 102));
		lblNomeVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		lblNomeVolunt.setBounds(121, 74, 96, 17);
		panel_3.add(lblNomeVolunt);
		
		textNomeCadastroVoluntarios = new JTextField("    Digite o nome completo");
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
		textNomeCadastroVoluntarios.setBounds(121, 90, 377, 32);
		panel_3.add(textNomeCadastroVoluntarios);
		
		JLabel lblEnderecoVolunt = new JLabel("Endereço");
		lblEnderecoVolunt.setForeground(new Color(0, 102, 102));
		lblEnderecoVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		lblEnderecoVolunt.setBounds(121, 126, 96, 17);
		panel_3.add(lblEnderecoVolunt);
		
		textEnderecoCadastroVoluntarios = new JTextField("    Rua, número e complemento");
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
		textEnderecoCadastroVoluntarios.setBounds(121, 142, 377, 32);
		panel_3.add(textEnderecoCadastroVoluntarios);
		
		JLabel lblEmailVolunt = new JLabel("E-mail");
		lblEmailVolunt.setForeground(new Color(0, 102, 102));
		lblEmailVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		lblEmailVolunt.setBounds(121, 181, 96, 17);
		panel_3.add(lblEmailVolunt);
		
		textEmailCadastroVoluntarios = new JTextField("    Digite o e-mail");
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
		textEmailCadastroVoluntarios.setBounds(121, 198, 377, 32);
		panel_3.add(textEmailCadastroVoluntarios);
		
		JLabel lblAreadeAtuacaoVolunt = new JLabel("Área de atuação");
		lblAreadeAtuacaoVolunt.setForeground(new Color(0, 102, 102));
		lblAreadeAtuacaoVolunt.setFont(new Font("Arial", Font.BOLD, 14));
		lblAreadeAtuacaoVolunt.setBounds(121, 241, 153, 17);
		panel_3.add(lblAreadeAtuacaoVolunt);
		
		textAreaAtuacaoCadastroVoluntarios = new JTextField("    Digite a área de atuação");
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
		textAreaAtuacaoCadastroVoluntarios.setBounds(121, 257, 377, 32);
		panel_3.add(textAreaAtuacaoCadastroVoluntarios);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cadastro dos voluntários");
		lblNewLabel_1_2.setForeground(new Color(0, 102, 102));
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_1_2.setBounds(174, 0, 235, 30);
		panel_3.add(lblNewLabel_1_2);
		
		JButton btnAdicionarCadastroVoluntarios = new JButton("Adicionar");
		btnAdicionarCadastroVoluntarios.setForeground(Color.WHITE);
		btnAdicionarCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAdicionarCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAdicionarCadastroVoluntarios.setBackground(new Color(0, 102, 102));
		btnAdicionarCadastroVoluntarios.setBounds(121, 300, 114, 39);
		panel_3.add(btnAdicionarCadastroVoluntarios);
		
		JButton btnAtualizarCadastroVoluntarios = new JButton("Atualizar");
		btnAtualizarCadastroVoluntarios.setForeground(Color.WHITE);
		btnAtualizarCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		btnAtualizarCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnAtualizarCadastroVoluntarios.setBackground(new Color(0, 102, 102));
		btnAtualizarCadastroVoluntarios.setBounds(255, 300, 112, 39);
		panel_3.add(btnAtualizarCadastroVoluntarios);
		
		JButton btnExcluirCadastroVoluntarios = new JButton("Excluir");
		btnExcluirCadastroVoluntarios.setForeground(Color.WHITE);
		btnExcluirCadastroVoluntarios.setFont(new Font("Arial", Font.PLAIN, 17));
		btnExcluirCadastroVoluntarios.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnExcluirCadastroVoluntarios.setBackground(new Color(0, 102, 102));
		btnExcluirCadastroVoluntarios.setBounds(386, 300, 112, 39);
		panel_3.add(btnExcluirCadastroVoluntarios);
		
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
	  	         //formattedTextCelularCadastroVoluntarios.getText().trim()+"','"+
	  	         textEmailCadastroVoluntarios.getText().trim()+"','"+
	  	       textAreaAtuacaoCadastroVoluntarios.getText().trim()+"')";


	  	         System.out.println(sql);

	  	         stmt.executeUpdate(sql);
	  	         
			    	 JOptionPane.showMessageDialog(panel_2, "Registro criado com sucesso!");
	  	      } catch (SQLException ex) {
	  	    	  JOptionPane.showMessageDialog(panel_2, "Não foi possível criar registro");
	  	    	  ex.printStackTrace();
	  	      }
			}
	
});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaCrudAdm\\Design sem nome (19).png"));
		lblNewLabel.setBounds(0, 0, 1352, 696);
		contentPane.add(lblNewLabel);
		
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

}
	}




















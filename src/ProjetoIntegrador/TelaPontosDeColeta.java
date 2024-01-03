package ProjetoIntegrador;


import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.Cursor;
import java.awt.Desktop;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TelaPontosDeColeta extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static TelaPontosDeColeta frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaPontosDeColeta();
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
	public TelaPontosDeColeta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVoltar = new JButton("");
		btnVoltar.setBorder(null);
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaPontosDeColeta\\imgVoltar102x57.jpg"));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal novaTelaPrincipal = new TelaPrincipal();
				novaTelaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(1240, 536, 102, 57);
		contentPane.add(btnVoltar);

		JTextPane txtpnPontosDeColeta = new JTextPane();
		txtpnPontosDeColeta.setEditable(false);
		txtpnPontosDeColeta.setForeground(new Color(0, 102, 102));
		txtpnPontosDeColeta.setFont(new Font("Arial", Font.BOLD, 52));
		txtpnPontosDeColeta.setText("Pontos de coleta  ");
		txtpnPontosDeColeta.setBounds(119, 257, 451, 62);
		contentPane.add(txtpnPontosDeColeta);

		JTextPane txtpnDigiteSeuCep = new JTextPane();
		txtpnDigiteSeuCep.setEditable(false);
		txtpnDigiteSeuCep.setForeground(new Color(0, 102, 102));
		txtpnDigiteSeuCep.setFont(new Font("Arial", Font.PLAIN, 25));
		txtpnDigiteSeuCep.setText("Encontre os pontos de coleta mais próximo de você\r\n");
		txtpnDigiteSeuCep.setBounds(43, 330, 587, 36);
		contentPane.add(txtpnDigiteSeuCep);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaPontosDeColeta\\tampinhas483x528.png"));
		lblNewLabel.setBounds(749, 65, 481, 528);
		contentPane.add(lblNewLabel);

		JComboBox comboBoxRegiao = new JComboBox();
		comboBoxRegiao.setForeground(new Color(0, 102, 102));
		comboBoxRegiao.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBoxRegiao.setModel(new DefaultComboBoxModel(new String[] { "   Escolha a região desejada",
				"Região Central de Florianópolis", "Norte da ilha", "Sul da ilha", "Leste da ilha", "Continente",
				"Biguaçu", "São José", "Palhoça", "Outras cidades" }));
		comboBoxRegiao.setBackground(new Color(255, 255, 255));
		comboBoxRegiao.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		comboBoxRegiao.setBounds(127, 390, 306, 50);
		contentPane.add(comboBoxRegiao);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String DB_URL = "jdbc:mysql://localhost/projetointegrador";
				String USER = "root";
				String PASS = "netolindo";

				String QUERY = "select * from ponto_de_coleta where regiao = '" + comboBoxRegiao.getSelectedItem()
				+ "'";

				DefaultTableModel tableModel = new DefaultTableModel();				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(197, 573, 709, 251);

				contentPane.add(scrollPane);

				table = new JTable();
				scrollPane.setViewportView(table);
				table.setModel(tableModel);
				table.setEnabled(false);	
				table.setFont(new Font("Arial", Font.PLAIN, 16));//tamanho da letra da tabela
				table.setVisible(true);		

				table.getTableHeader().setFont(new Font("arial", Font.BOLD, 20));  //tamanho da letra do titulo

				try {

					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * FROM ponto_de_coleta where regiao = '" + comboBoxRegiao.getSelectedItem() + "'");

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
		btnBuscar.setForeground(new Color(255, 255, 255));
		btnBuscar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102),
				new Color(0, 102, 102), new Color(0, 102, 102)));
		btnBuscar.setBackground(new Color(0, 102, 102));
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBuscar.setBounds(432, 390, 138, 50);
		contentPane.add(btnBuscar);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaPontosDeColeta\\LogoEcopet155x155.png"));
		lblNewLabel_3.setBounds(266, 65, 144, 200);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(93, 390, 37, 50);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaPontosDeColeta\\imgLocalizacao.png"));

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(0, 51, 51));
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(0, 926, 1904, 81);
		contentPane.add(panel_1);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(847, 11, 229, 57);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {

					Desktop.getDesktop().browse(new URI("https://www.instagram.com/ecopettampas/"));

				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});

		JTextPane txtpnecopettampas_1 = new JTextPane();
		txtpnecopettampas_1.setText("@ecopettampas");
		txtpnecopettampas_1.setForeground(Color.WHITE);
		txtpnecopettampas_1.setFont(new Font("Arial", Font.BOLD, 24));
		txtpnecopettampas_1.setEditable(false);
		txtpnecopettampas_1.setBackground(new Color(0, 102, 102));
		txtpnecopettampas_1.setBounds(886, 22, 190, 48);
		panel_1.add(txtpnecopettampas_1);

		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\joao.neto6\\Desktop\\João Lincoln\\Códigos e Imagens\\TelaPontosDeColeta\\logoIntagram31x30 (4).png"));
		lblNewLabel_1_1.setBounds(847, 24, 31, 30);
		panel_1.add(lblNewLabel_1_1);

	}
}


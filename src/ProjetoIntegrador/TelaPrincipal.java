package ProjetoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private final JSeparator separator = new JSeparator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(255, 255, 224), 0, true));

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
		lblNewLabel_3.setBounds(580, 637, 196, 59);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 56, 68);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaPrincipal\\Logo56x68.jpg"));
		contentPane.add(lblNewLabel_2);
		separator.setBounds(0, 68, 1352, 2);
		separator.setBorder(new LineBorder(new Color(51, 153, 153), 7, true));
		separator.setBackground(new Color(0, 102, 102));
		separator.setForeground(new Color(255, 255, 255));
		contentPane.add(separator);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(747, 93, 481, 504);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaPrincipal\\Design sem nome (11).png"));
		contentPane.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(0, 636, 1371, 81);
		panel.setBackground(new Color(0, 102, 102));
		panel.setForeground(new Color(0, 51, 51));
		contentPane.add(panel);
		panel.setLayout(null);

		JTextPane txtpnecopettampas = new JTextPane();
		txtpnecopettampas.setBounds(621, 11, 160, 30);
		panel.add(txtpnecopettampas);
		txtpnecopettampas.setForeground(new Color(255, 255, 255));
		txtpnecopettampas.setBackground(new Color(0, 102, 102));
		txtpnecopettampas.setFont(new Font("Arial", Font.BOLD, 20));
		txtpnecopettampas.setText("@ecopettampas");

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaPrincipal\\logoIntagram31x30 (4).png"));
		lblNewLabel_1.setBounds(582, 13, 31, 30);
		panel.add(lblNewLabel_1);

		JEditorPane dtrpnASuaDoao = new JEditorPane();
		dtrpnASuaDoao.setEditable(false);
		dtrpnASuaDoao.setBounds(103, 103, 553, 189);
		dtrpnASuaDoao.setForeground(new Color(0, 102, 102));
		dtrpnASuaDoao.setFont(new Font("Arial", Font.BOLD, 52));
		dtrpnASuaDoao.setText("A sua doação de \r\ntampinhas plásticas \r\nsalva vidas!");
		contentPane.add(dtrpnASuaDoao);

		JTextPane txtpnANossaMisso = new JTextPane();
		txtpnANossaMisso.setEditable(false);
		txtpnANossaMisso.setBounds(103, 311, 516, 189);
		txtpnANossaMisso.setForeground(new Color(0, 102, 102));
		txtpnANossaMisso.setFont(new Font("Arial", Font.PLAIN, 19));
		txtpnANossaMisso.setText("A nossa missão consiste em promover o bem-estar animal, \r\nfortalecendo  a  consciência ambiental por meio  da prática \r\nda reciclagem, e buscando proporcionar uma qualidade de \r\nvida  aprimorada  para  os  animais.   Realizamos  o   nosso \r\ntrabalho com  seriedade,  amor,  dedicação e  uma  notável \r\ntransparência.  Convidamos  você  a  se  juntar a  nós,  pois \r\njuntos somos mais fortes!");
		contentPane.add(txtpnANossaMisso);

		JButton btnEntenda = new JButton("Entenda");
		btnEntenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEntenda novaTelaEntenda = new TelaEntenda ();
				novaTelaEntenda.setVisible(true);
				dispose();				
			}
		});
		btnEntenda.setBounds(104, 508, 168, 36);
		btnEntenda.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 204, 0), new Color(255, 204, 0), new Color(255, 204, 0)));
		btnEntenda.setBackground(new Color(0, 102, 102));
		btnEntenda.setForeground(new Color(255, 255, 255));
		btnEntenda.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(btnEntenda);

		JButton btnDoeAgoraMesmo = new JButton("Doe agora mesmo");
		btnDoeAgoraMesmo.setBounds(435, 508, 166, 36);
		btnDoeAgoraMesmo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDoeAgoraMesmo novaTelaDoeAgoraMesmo = new TelaDoeAgoraMesmo ();
				novaTelaDoeAgoraMesmo.setVisible(true);
				dispose();	
			}
		});
		btnDoeAgoraMesmo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 255, 0)));
		btnDoeAgoraMesmo.setBackground(new Color(0, 102, 102));
		btnDoeAgoraMesmo.setForeground(new Color(255, 255, 255));
		btnDoeAgoraMesmo.setFont(new Font("Arial", Font.PLAIN, 16));
		contentPane.add(btnDoeAgoraMesmo);

		JButton btnPontoColeta = new JButton("Pontos de coleta");
		btnPontoColeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPontosDeColeta novaTelaPontosDeColeta = new TelaPontosDeColeta ();
				novaTelaPontosDeColeta.setVisible(true);
				dispose();
			}
		});
		btnPontoColeta.setBounds(273, 21, 155, 36);
		btnPontoColeta.setForeground(new Color(0, 102, 102));
		btnPontoColeta.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPontoColeta.setBorder(null);
		btnPontoColeta.setBackground(new Color(255, 255, 255));
		contentPane.add(btnPontoColeta);

		JButton btnSejaUmVoluntario = new JButton("Seja um voluntário");
		btnSejaUmVoluntario.setBounds(483, 21, 147, 36);
		btnSejaUmVoluntario.setBorder(null);
		btnSejaUmVoluntario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSejaUmVoluntario novaTelaSejaUmVoluntario = new TelaSejaUmVoluntario();	
				novaTelaSejaUmVoluntario.setVisible(true);
				dispose();		
			}
		});
		btnSejaUmVoluntario.setForeground(new Color(0, 102, 102));
		btnSejaUmVoluntario.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSejaUmVoluntario.setBackground(Color.WHITE);
		contentPane.add(btnSejaUmVoluntario);

		JButton btnSejaPatrocinador = new JButton("Seja um patrocinador");
		btnSejaPatrocinador.setBounds(699, 21, 160, 36);
		btnSejaPatrocinador.setBorder(null);
		btnSejaPatrocinador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSejaUmPatrocinador novaTelaSejaUmPatrocinador = null;
				try {
					novaTelaSejaUmPatrocinador = new TelaSejaUmPatrocinador();
				} catch (ParseException e1) {
					// TODO Bloco catch gerado automaticamente
					e1.printStackTrace();
				}	
				novaTelaSejaUmPatrocinador.setVisible(true);
				dispose();	
			}
		});
		btnSejaPatrocinador.setForeground(new Color(0, 102, 102));
		btnSejaPatrocinador.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSejaPatrocinador.setBackground(Color.WHITE);
		contentPane.add(btnSejaPatrocinador);
		
		JButton btnreaDoAdministrador = new JButton("Área do Administrador ");
		btnreaDoAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLoginAdm novaTelaLoginAdm = new TelaLoginAdm ();
				novaTelaLoginAdm.setVisible(true);
				dispose();	
			}
		});
		btnreaDoAdministrador.setForeground(new Color(0, 102, 102));
		btnreaDoAdministrador.setFont(new Font("Arial", Font.PLAIN, 16));
		btnreaDoAdministrador.setBorder(null);
		btnreaDoAdministrador.setBackground(Color.WHITE);
		btnreaDoAdministrador.setBounds(936, 21, 178, 36);
		contentPane.add(btnreaDoAdministrador);
	}
}

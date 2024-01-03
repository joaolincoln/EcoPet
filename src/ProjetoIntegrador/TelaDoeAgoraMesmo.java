package ProjetoIntegrador;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class TelaDoeAgoraMesmo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDoeAgoraMesmo frame = new TelaDoeAgoraMesmo();
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
	public TelaDoeAgoraMesmo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setBorder(null);
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaDoeAgoraMesmo\\imgVoltar102x57.jpg"));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal novaTelaPrincipal = new TelaPrincipal ();
				novaTelaPrincipal.setVisible(true);
				dispose();	
				
			}
		});
		btnVoltar.setBounds(1240, 570, 102, 57);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaDoeAgoraMesmo\\img01.png"));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1352, 685);
		contentPane.add(lblNewLabel);
	
		
	}
}
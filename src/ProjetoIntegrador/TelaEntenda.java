package ProjetoIntegrador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class TelaEntenda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEntenda frame = new TelaEntenda();
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
	public TelaEntenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Pontos de coleta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPontosDeColeta novaPontosDeColeta = new TelaPontosDeColeta ();
				novaPontosDeColeta.setVisible(true);
				dispose();			}
		});
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102), new Color(0, 102, 102)));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(786, 632, 177, 42);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnOEcopet = new JTextPane();
		txtpnOEcopet.setForeground(new Color(0, 102, 102));
		txtpnOEcopet.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnOEcopet.setText("          O Ecopet é uma entidade sem fins lucrativos que foi fundada em abril de 2017, inspirada no projeto \"Engenharia Solidária\" de Caxias do Sul-RS. Diferentemente desse projeto, operamos de forma distinta, destinando exclusivamente os recursos provenientes da arrecadação de resíduos recicláveis para a castração de animais, além de medicamentos e cirurgias veterinárias.\r\n\r\n            O custo médio de cada castração é de noventa reais, o que significa que a coleta de cerca de 120 quilos de tampinhas é necessária para arrecadar esse valor. Essa quantidade de plástico é equivalente a um carro cheio até o carona, sem nenhum passageiro. As tampas podem ser de diferentes tipos e tamanhos, não se limitando apenas às de garrafa pet, que são mais comuns. O programa arrecada resíduos plásticos, como tampas de shampoo, leite, amaciante, sabão líquido e embalagens de remédios, entre outros.");
		txtpnOEcopet.setBounds(30, 0, 779, 179);
		contentPane.add(txtpnOEcopet);
		
		JTextPane txtpnASeleoDos = new JTextPane();
		txtpnASeleoDos.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnASeleoDos.setForeground(new Color(0, 102, 102));
		txtpnASeleoDos.setText("   A seleção dos animais que serão beneficiados com a castração ocorre por meio de um sistema de listas, e existem critérios estabelecidos para se inscrever nessas listas. Os animais em situação de rua têm prioridade, especialmente as fêmeas, e geralmente são acolhidos por protetores até sua recuperação e adoção. As voluntárias do projeto são responsáveis por administrar essas listas e avaliar a concessão do benefício da castração. As informações necessárias para o cadastramento incluem dados do responsável, informações do animal, comprovante de renda da família, caso seja de baixa renda, e uma foto do cão ou gato.\n\n           Até abril de 2021, de acordo com o último levantamento realizado pelos organizadores da ONG, o Ecopet já beneficiou 4.687 animais e retirou 227 toneladas de plástico do meio ambiente e dos aterros sanitários, garantindo seu correto destino na reciclagem.");
		txtpnASeleoDos.setBounds(365, 190, 536, 258);
		contentPane.add(txtpnASeleoDos);
		
		JTextPane txtpnSegundoOsAdministradores = new JTextPane();
		txtpnSegundoOsAdministradores.setForeground(new Color(0, 102, 102));
		txtpnSegundoOsAdministradores.setFont(new Font("Arial", Font.PLAIN, 15));
		txtpnSegundoOsAdministradores.setText("Segundo os administradores da ONG, eles fazem a diferença ao mobilizar as pessoas e informá-las de que não é necessário doar dinheiro para contribuir. Existem outras alternativas, e se cada pessoa ajudar de alguma forma, com suas próprias mãos, será possível ajudar muitos animais e o meio ambiente. No entanto, eles dependem da ajuda das pessoas.\n\n           Atualmente, o Ecopet conta com 42 voluntários, que são responsáveis por todas as ações desenvolvidas pela ONG. O programa também conta com o apoio de algumas empresas que disponibilizam pontos de coleta. Ao todo, existem 557 pontos de arrecadação distribuídos em várias regiões da Grande Florianópolis, como Palhoça, São José, Biguaçu, Antônio Carlos, Santo Amaro da Imperatriz, Paulo Lopes, São Pedro de Alcântara e na capital do estado.");
		txtpnSegundoOsAdministradores.setBounds(252, 459, 717, 179);
		contentPane.add(txtpnSegundoOsAdministradores);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setBorder(null);
		btnVoltar.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaEntenda\\imgVoltar102x57.jpg"));
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
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\ProjetoIntegrador_Ecopet\\Imagens\\imagensOficiais\\TelaEntenda\\img1368x735.png"));
		lblNewLabel.setBounds(0, 0, 1352, 696);
		contentPane.add(lblNewLabel);
		
		
	}

}

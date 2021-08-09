package Ej2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AplicacionGrafica2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AplicacionGrafica2() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Películas");
		setBounds(400,20,800,800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel tituloPeli = new JLabel("Escribe el título de una película");
		tituloPeli.setBounds(200, 50, 200, 20);
		contentPane.add(tituloPeli);
		
		JLabel peliculas = new JLabel("Películas");
		peliculas.setBounds(500, 50, 200, 20);
		contentPane.add(peliculas);
		
		JComboBox<String> comboPelis = new JComboBox<>();
		comboPelis.setBounds(500, 80, 200, 20);
		contentPane.add(comboPelis);
		
		JTextField TF = new JTextField();
		TF.setBounds(200, 80, 80, 20);
		contentPane.add(TF);
		
		JButton button = new JButton("Añadir");
		button.setBounds(200, 110, 80, 20);
		contentPane.add(button);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				comboPelis.addItem(TF.getText());
				
			}
		};
		button.addActionListener(al);
	}

}

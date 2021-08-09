import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;
public class AplicacionGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public AplicacionGrafica() {
		setVisible(true);
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Saludador");
		setBounds(400,20,800,800);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe un nombre para saludar");
		lblNewLabel.setBounds(293, 70, 200, 20);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(292, 95, 137, 20);
		contentPane.add(textField);

		JButton button = new JButton("Saludar");
		button.setBounds(292, 130, 137, 20);
		contentPane.add(button);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Hola " + textField.getText());
			}
		};
		button.addActionListener(al);

	}

}

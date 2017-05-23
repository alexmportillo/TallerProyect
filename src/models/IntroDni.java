package models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroDni {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroDni window = new IntroDni();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntroDni() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduzca DNI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(127, 0, 186, 43);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(164, 61, 170, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblDni.setBounds(99, 73, 55, 23);
		frame.getContentPane().add(lblDni);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 70));
		btnOk.setBounds(53, 136, 155, 115);
		frame.getContentPane().add(btnOk);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 44));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
		});
		btnBack.setIcon(new ImageIcon("C:\\Users\\admincenec\\Desktop\\back.g"));
		btnBack.setBounds(230, 136, 155, 115);
		frame.getContentPane().add(btnBack);
	}
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
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
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaskName = new JLabel("Квадратное уравнение");
		lblTaskName.setBounds(69, 11, 191, 31);
		lblTaskName.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(lblTaskName);
		
		JTextPane txt_a = new JTextPane();
		txt_a.setText("0");
		txt_a.setBounds(10, 53, 57, 20);
		contentPane.add(txt_a);
		
		JTextPane txt_b = new JTextPane();
		txt_b.setText("0");
		txt_b.setBounds(93, 53, 57, 20);
		contentPane.add(txt_b);
		
		JTextPane txt_c = new JTextPane();
		txt_c.setText("0");
		txt_c.setBounds(171, 53, 57, 20);
		contentPane.add(txt_c);
		
		JLabel lbl_a = new JLabel("x2 +");
		lbl_a.setBounds(67, 59, 30, 14);
		lbl_a.setFont(new Font("Tahoma",Font.PLAIN,12));
		contentPane.add(lbl_a);
		
		JLabel lbl_b = new JLabel("x");
		lbl_b.setBounds(153, 59, 8, 14);
		lbl_b.setFont(new Font("Tahoma",Font.PLAIN,12));
		contentPane.add(lbl_b);
		
		JLabel lblRightPart = new JLabel("= 0");
		lblRightPart.setBounds(238, 59, 22, 14);
		lblRightPart.setFont(new Font("Tahoma",Font.PLAIN,12));
		contentPane.add(lblRightPart);
		
		JLabel lblSolution = new JLabel("");
		lblSolution.setBackground(Color.WHITE);
		lblSolution.setBounds(21, 143, 256, 14);
		lblSolution.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolution.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(lblSolution);
		
		JButton btnSolve = new JButton("Решить уравнение");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a, b, c; // Коэффициенты уравнения
				try{
				a = Double.parseDouble(txt_a.getText());
				}
				catch(NumberFormatException nfe){
				a = 0.0;
				txt_a.setText("0.0");
				}
				try{
					b = Double.parseDouble(txt_b.getText());
				}
					catch(NumberFormatException nfe){
					b = 0.0;
					txt_b.setText("0.0");
				}
					try{
					c = Double.parseDouble(txt_c.getText());
				}
					catch(NumberFormatException nfe){
					c = 0.0;
					txt_c.setText("0.0");
				}
					double D = b * b - 4 * a * c;
					// Дискриминант
					double x1, x2;
					// Корни
					String Sol = "";
					if(D < 0.0)
					Sol = "Действительных корней нет";
					else if(D > 0 && a != 0.){
					x1 = (-b + Math.sqrt(D)) / (2. * a);
					x2 = (-b - Math.sqrt(D)) / (2. * a);
					Sol = "Корни: x1 = " + x1 + ", x2 = " + x2;
					}
					else if(D == 0 && a != 0.0){
					x1 = -b / (2. * a);
					Sol = "Корень x = " + x1;
					}
					else if(a == 0 && b != 0.){
					x1 = -c / b;
					Sol = "Корень x = " + x1;
					}
					lblSolution.setText(Sol);	
			}
		});
				
			
		
		
		btnSolve.setBounds(69, 84, 151, 23);
		contentPane.add(btnSolve);
		
		
		
		JLabel lbl1 = new JLabel("Решение");
		lbl1.setBounds(117, 118, 78, 14);
		lbl1.setFont(new Font("Tahoma",Font.BOLD,14));
		contentPane.add(lbl1);
	}
}

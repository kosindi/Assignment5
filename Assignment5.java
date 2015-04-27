/** 
3  *  
4  * Kowar Sindi 
5  * 04-27-2015 
6  * 
7  */ 
import java.awt.Color; //imports color
import java.awt.Container; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JButton; //box trait
import javax.swing.JFrame; //box trait
import javax.swing.JLabel; //box trait
import javax.swing.JTextField;//text  
 
public class Assignment5 extends JFrame implements ActionListener { 
 	 
private JTextField test1; 
private JTextField Average1; 
private JTextField test2; 
private JTextField Average2; 
private JTextField test3; 
private JTextField Average3; 
private JTextField test4; 
private JTextField Average4; 
private JLabel result; 
public int average = 0; 
      
public Assignment5() { 
setSize(400,300); 
setTitle("Test Score Average"); 
setLocation(800, 400); 
     	 
Container contentPane = getContentPane(); 
contentPane.setLayout(null); 
contentPane.setBackground(Color.BLUE); 
test1 = new JTextField("Test 1"); 
test1.setBounds(25, 10, 100, 20); 
     	contentPane.add(test1); 
     	 
     	Average1 = new JTextField ("Average 1"); 
     	Average1.setBounds(150, 10,100,20); 
     	contentPane.add(Average1); 
     	 
     	test2 = new JTextField("Test 2"); 
     	test2.setBounds(25, 35, 100, 20); 
     	contentPane.add(test2); 
     	Average2 = new JTextField ("Average 2"); 
     	Average2.setBounds(150, 35, 100, 20); 
     	contentPane.add(Average2); 
     	 
     	test3 = new JTextField("Test 3"); 
     	test3.setBounds(25, 60, 100, 20); 
     	contentPane.add(test3); 
     	 
     	Average3 = new JTextField ("Average 3"); 
     	Average3.setBounds(150, 60, 100, 20); 
     	contentPane.add(Average3); 
     	 
     	test4 = new JTextField("Test 4"); 
     	test4.setBounds(25, 85, 100, 20); 
     	contentPane.add(test4); 
     	 
     	Average4 = new JTextField ("Average 4"); 
     	Average4.setBounds(150, 85, 100, 20); 
     	contentPane.add(Average4); 
     	 
     	JButton calculate = new JButton("Calculate"); 
     	calculate.setBounds(85, 110, 100, 20); 
     	contentPane.add(calculate); 
     	calculate.addActionListener(this); 
     	 
     	result = new JLabel(""); 
     	result.setBounds(85, 135, 120, 25); 
     	contentPane.add(result); 
     	 
     } 
      
 	public static void main(String[] args) { 
 		 
 		Assignment5 test = new Assignment5(); 
 		test.setVisible(true); 
 		test.setDefaultCloseOperation(EXIT_ON_CLOSE); 
 
 
 	} 
 	 
 	public void actionPerformed(ActionEvent arg0) { 
 		calculateAverage(); 
 	} 
 	 
 	public void calculateAverage(){ 
 		int t1 = Integer.parseInt(test1.getText()); 
 		double w1 = Double.parseDouble(Average1.getText()); 
 		int t2 = Integer.parseInt(test2.getText()); 
 		double w2 = Double.parseDouble(Average2.getText()); 
 		int t3 = Integer.parseInt(test3.getText()); 
 		double w3 = Double.parseDouble(Average3.getText()); 
 		int t4 = Integer.parseInt(test4.getText()); 
 		double w4 = Double.parseDouble(Average4.getText()); 
 		average = (int)((t1*w1) + (t2*w2) + (t3*w3) + (t4*w4)); 
 		result.setText(Integer.toString(average)); 
 	} 
 	 
 	 
 
 
 } 
 
 


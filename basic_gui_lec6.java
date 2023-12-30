//import a class--for basic gui import javax.swing.JOptionPane;
import javax.swing.JOptionPane;                                                                       
public class basic_gui_lec6 {

	public static void main(String[] args) {
		
		String name=JOptionPane.showInputDialog("enter your name");  //promt inputbox and takes input in string
		JOptionPane.showMessageDialog(null,"your name is : "+name);  //prompt message
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));  //int conversion				
		JOptionPane.showMessageDialog(null,"your age is : "+age);
		
		double height=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));  //double conversion				
		JOptionPane.showMessageDialog(null,"your height is : "+height);

	}

}

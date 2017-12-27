package random;

import java.util.Random;

import javax.swing.JOptionPane;



public class lotteryrandom {
	public static void main(String[] args) {
		String ticket =(" number ");
		
	for (int i = 0; i < 5; i++) {
		
	
	int lottery = 0 ;
	lottery = new Random().nextInt(50);
	System.out.println(lottery);
	ticket += lottery + " " ;
	}
	JOptionPane.showMessageDialog(null, ticket);

}

}



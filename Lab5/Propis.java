package Lab5;

import javax.swing.JOptionPane;

public class Propis {
	public static void main(String[] args) {
		int n1;
		String res = null;
		String n = JOptionPane.showInputDialog("Enter a number in range(0,9)");
		n1 = Integer.parseInt(n);
			switch(n1){
		 case 0:
		 res="Zero";
		 case 1:
		 res="One";
		 break;
		 case 2:
		 res="Two";
		 break;
		 case 3:
		 res="Three";
		 break;
		 case 4:
		 res="Four";
		 break;
		 case 5:
		 res="Five";
		 break;
		 case 6:
		 res="Six";
		 break;		 
		 case 7:
		 res="Seven";
		 break;		 
		 case 8:
		 res="Eight";
		 break;		 
		 case 9:
		 res="Nine";
		 break;		 		 		 		 		 		 
		 }
			 System.out.println(res);
;
	}
}

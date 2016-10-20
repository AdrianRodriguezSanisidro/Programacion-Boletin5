package boletin5_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin5_3 {

   public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Numero "));
        if (num1>0)
            System.out.println("+");
        else if (num1==0)
            System.out.println("0");
        else 
            System.out.println("-");
    }
    
}

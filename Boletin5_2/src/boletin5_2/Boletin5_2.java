package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin5_2 {
   
    public static void main(String[] args) {
        short num1=Short.parseShort(JOptionPane.showInputDialog("Numero "));
        short num2=Short.parseShort(JOptionPane.showInputDialog("Numero "));
        if (num1>=num2)
            System.out.println("Resta ="+ (num1-num2));
        System.out.println("Suma ="+ (num1+num2));
    }
    
}

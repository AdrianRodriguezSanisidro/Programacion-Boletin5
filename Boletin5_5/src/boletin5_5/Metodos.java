
package boletin5_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Metodos {
    private int num1,num2,num3;
    public Metodos(){
    }
    public Metodos(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
    public void comparar(){
       int n1=Integer.parseInt(JOptionPane.showInputDialog("Primer numero "));
       int n2=Integer.parseInt(JOptionPane.showInputDialog("Segundo numero "));
       int n3=Integer.parseInt(JOptionPane.showInputDialog("Tercer numero "));
       if(n1>n2&&n1>n3)
            System.out.println("n1 e maior");
       else if(n2>n1&&n2>n3)
            System.out.println("n2 e maior");
       else System.out.println("n3 e maior");
    }
}

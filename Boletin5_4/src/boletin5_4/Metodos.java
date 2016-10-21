package boletin5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Metodos {
    private float peso1,peso2;
    public Metodos(){
   }
   public Metodos(float peso1,float peso2){
       this.peso1=peso1;
       this.peso2=peso2;
   }
  public void comparar(){
       float p1=Float.parseFloat(JOptionPane.showInputDialog("Peso de Juan "));
      float  p2=Float.parseFloat(JOptionPane.showInputDialog("Peso de Alfredo "));
      
 float resultadoResta1=p1-p2;
 float resultadoResta2=p2-p1;
   if(p1>p2)
          System.out.println("Juan pesa " + resultadoResta1 + "kg mas");
   else if(p1<p2)
          System.out.println("Alfredo pesa " + resultadoResta2 + "kg mas");
   else
          System.out.println("Pesan igual");
           
}
}

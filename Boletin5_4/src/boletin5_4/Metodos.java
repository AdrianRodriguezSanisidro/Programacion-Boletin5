package boletin5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Metodos {
    private String nombre1,nombre2;
    private float peso1,peso2;
    public Metodos(){
   }
   public Metodos(String nombre1,String nombre2,float peso1,float peso2){
       this.nombre1=nombre1;
       this.nombre2=nombre2;
       this.peso1=peso1;
       this.peso2=peso2;
   }
  public void comparar(){
       nombre1=JOptionPane.showInputDialog("Primer nombre ");
       nombre2=JOptionPane.showInputDialog("Segundo nombre ");
      
      float p1=Float.parseFloat(JOptionPane.showInputDialog("Peso de "+ nombre1));
      float  p2=Float.parseFloat(JOptionPane.showInputDialog("Peso de "+ nombre2));
      
 float resultadoResta1=p1-p2;
 float resultadoResta2=p2-p1;
   if(p1>p2)
          System.out.println( nombre1 + " pesa " + resultadoResta1 + "kg mas que "+ nombre2);
   else if(p1<p2)
          System.out.println(nombre2 + " pesa " + resultadoResta2 + "kg mas que "+ nombre1);
   else
          System.out.println("Pesan igual");
           
}
}

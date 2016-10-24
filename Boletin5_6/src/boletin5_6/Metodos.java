package boletin5_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Metodos {
    private int ventas;
    public Metodos(){
    }
    public Metodos(int ventas){
        this.ventas=ventas;
    }
    public void clasificar(){
        String artigo = JOptionPane.showInputDialog("Artigo ");
        int vAnuais = Integer.parseInt(JOptionPane.showInputDialog("Numero de ventas no ano "));
        if (vAnuais<=100&&vAnuais>=0)
            JOptionPane.showMessageDialog(null,artigo+" e un artigo de baixo consumo");
        else if (vAnuais>100&&vAnuais<=500)
            JOptionPane.showMessageDialog(null,artigo+" e un artigo de consumo medio");
        else if (vAnuais>500&&vAnuais<=1000)
            JOptionPane.showMessageDialog(null,artigo+" e un artigo de consumo alto");
        else if (vAnuais>1000)
            JOptionPane.showMessageDialog(null,artigo+" e un artigo de primeira necesidade");
    }
}

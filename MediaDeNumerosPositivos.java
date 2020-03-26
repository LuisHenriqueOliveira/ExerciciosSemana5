import javax.swing.*;
public class MediaDeNumerosPositivos
{
   public static void main(String[] args)
   {
      int num, soma = 0, cont = 0;
      num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo, ou um negativo para sair"));
      while(num >= 0)
      {
         soma = soma + num;
         cont++;
         num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo, ou um negativo para sair"));
      }
      double media = soma/cont; 
      JOptionPane.showMessageDialog(null,media);
   }
}
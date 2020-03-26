import javax.swing.*;
public class NumerosEntreCemEDuzentos
{
   public static void main(String[] args)
   {
      int num, qtd = 0;
      num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro ou zero(0) para sair"));
      while(num!=0)
      {
         if(num > 100 && num < 200)
         {
            qtd = qtd + 1; 
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro ou zero(0) para sair"));  
         }
         else
         {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro ou zero(0) para sair"));
         }
      }
      JOptionPane.showMessageDialog(null, String.format("Foram %d digitados entre 100 e 200",qtd));
   }
}
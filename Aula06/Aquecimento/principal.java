

package Aula06.Aquecimento;
    

public class Principal {
    public static void main(String[] args) {
        
      int[] numeros = null;
      try {
        System.out.println(numeros.length);
      } catch (NullPointerException e) {
        System.out.println("Erro: " + e.getMessage());
      }
      
      //System.out.println(numeros.length);
      
      //System.out.println(numeros[5]);
      
      //System.out.println(10 / 0);
      System.out.println("Fim do programa");


    }
}
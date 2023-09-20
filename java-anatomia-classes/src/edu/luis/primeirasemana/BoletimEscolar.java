package edu.luis.primeirasemana;
public class BoletimEscolar {
  
  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 4;
    int n3 = 4;
    int media = CalcularMedia(n1,n2,n3);
    if (media < 6) 
      System.out.println("Reprovado");
    else if(media >= 6)
      System.out.println("Aprovado");
    }

  public static int CalcularMedia(int n1, int n2, int n3){
    return (n1+n2+n3)/3;

  }

}


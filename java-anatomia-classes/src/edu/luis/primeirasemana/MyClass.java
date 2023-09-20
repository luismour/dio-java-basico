package edu.luis.primeirasemana;
//Criando uma classe
public class MyClass {
  public static void main(String[] args) {
    System.out.print("Primeira entrada\n");//Imprimindo um texto no prompt
  
  //Declarando variáveis 
    String primeiroNome = "Luís";
    String segundoNome = "Miguel";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    int anoDeNascimento = 2004;
    int anoAtual = 2023;
    int idade = CalcularIdade(anoDeNascimento, anoAtual);

    System.out.print(nomeCompleto + "\n");
    System.out.print("Sua idade é: " + idade);
  }
  //Criando metódo
  public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Resultado do metódo é " + primeiroNome.concat(" ").concat(segundoNome);
  }
  public static int CalcularIdade(int anoDeNascimento, int anoAtual){
    return anoAtual - anoDeNascimento;
  }


  }

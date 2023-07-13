import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) {
    Aluno aluno = new Aluno("Victor", 01, 9, 10);
    try {
      FileWriter arq = new FileWriter("boletim_Escolar.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
      gravarArq.println("Nome:" + aluno.getNome());
      gravarArq.println("RA:" + aluno.getRa());
      gravarArq.println("Nota Dois:" + aluno.getNotaUm());
      gravarArq.println("Nota Um:" + aluno.getNotaDois());
      arq.close();
      System.out.println("Boletim escolar foi gerado com sucesso!");

    } catch (Exception e) {
      System.out.println("Não foi possivel realizar o recibo");
    }
  }
}

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    String[] nome= new String[5];
    double[] nota= new double[5];

    for(int i= 0; i<5;i++){
        System.out.println("Digite o nome do aluno "+(i+1)+":");
        nome[i]=scanner.nextLine();
        System.out.println("Digite a nota do aluno"+(i+1)+":");
        nota[i]= scanner.nextDouble();
        scanner.nextLine();
    }
    try{
        FileWriter arq = new FileWriter("C:alunos_universidade.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        for(int i=0;i<5;i++){
            gravarArq.println("Nome: "+ nome[i]+", Nota Final:"+ nota[i]);
           
        }
        arq.close();
       
        System.out.println("Dados dos arquivos salvos na pasta 'aluno_universidade.txt'.");
    }catch(IOException e){
        System.out.println("Ocorreu um erro ao salvar os dados dos alunos.");
       
    }
    scanner.close();
}

}

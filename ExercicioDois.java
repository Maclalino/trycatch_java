import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    String[] nome= new String[10];
    double[] valor= new double[10];

    for(int i= 0; i<10;i++){
        System.out.println("Digite o nome do Item " +(i+1)+":");
        nome[i]=scanner.nextLine();
        System.out.println("Digite o valor "+ (i+1)+":");
        valor[i]= Double.parseDouble(scanner.nextLine());
    }
    try{
        BufferedWriter writer=new BufferedWriter(new FileWriter("itens_supermecado.txt"));
        for(int i=0;i<10;i++){
            writer.write("Nome: "+ nome[i]+", Preço:"+ valor[i]);
            writer.newLine();
        }
        writer.close();
        System.out.println("Dados dos arquivos salvos na pasta 'itens_supermecado.txt'.");
    }catch(IOException e){
        System.out.println("Ocorreu um erro ao salvar os dados dos alunos.");
        e.printStackTrace();
    }
}
}



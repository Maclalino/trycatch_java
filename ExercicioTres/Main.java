package ExercicioTres;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa= new Pessoa();
        Destino destino= new Destino();
        destino.opcoesDeDestino();
         pessoa.preencherDados();
        

        try{
            FileWriter arq= new FileWriter("recibo_viagem.txt");
            PrintWriter gravarArq= new PrintWriter(arq);
            gravarArq.println("Nome:"+ pessoa.getNome());
            gravarArq.println("Idade:"+ pessoa.getIdade());
            gravarArq.println("CPF:"+ pessoa.getCpf());

            gravarArq.println("Destino:"+ destino.getDestino());
            gravarArq.println("Valor: "+ destino.getValor());
            gravarArq.println("Poltrona:"+ String.format("%02d",destino.getPoltrona()) );
            arq.close();
            System.out.println("Recibo da viagem foi gerado com sucesso.");

        }catch(Exception e){
            System.out.println("Não foi possivel realizar o recibo");

        }
    }
}

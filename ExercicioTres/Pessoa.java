package ExercicioTres;
import java.util.Scanner;


public class Pessoa {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int cpf;
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    private int idade;
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void  preencherDados(){
         Scanner scanner= new Scanner(System.in);
    System.out.println("Digite o seu nome completo:");
    setNome(scanner.nextLine());
    System.out.println("Digite sua Idade:");
    setIdade(scanner.nextInt());
    scanner.nextLine();
    System.out.println("Digite seu CPF:");
    setCpf(scanner.nextInt());
    scanner.nextLine();
    
    
    

    scanner.close();

    }


   }


    
package ExercicioTres;
import java.util.Random;
import java.util.Scanner;
public class Destino {
    private int poltrona;
    public int getPoltrona() {
       Random random= new Random();
            int numeroPoltrona = random.nextInt(20)+1;
           poltrona= numeroPoltrona;
            
        return poltrona;
    }
   
    private double valor;
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    private String destino;
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void  opcoesDeDestino(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite 1 para São Paulo");
        System.out.println("Digite 2 para Berlim");
        System.out.println("Digite 3 para Nova York");
        
       int opcao= scanner.nextInt();
        scanner.nextLine();
        

        switch (opcao) {
            case 1:
            destino= "São Paulo";
            valor=250.0;
            break;
            case 2:
            destino= "Berlim";
            valor=3800.0;
            break;
            case 3:
            destino= "Nova York";
            valor=2400.0;
            break;
            default:
            System.out.println("Opção Inválida");
                return;
        }
    System.out.println("Destino: "+ destino+"\nValor:"+ valor);
    }
    
}

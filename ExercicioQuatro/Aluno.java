import java.util.Scanner;
public class Aluno{
    private String nome;
    private int ra;
    private int notaUm, notaDois;

    public Aluno (String nome, int ra, int notaUm, int notaDois){
      this.nome= nome;
      this.ra= ra;
      this.notaUm= notaUm;
      this.notaDois=notaDois;
    }
      

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNotaUm(int notaUm){
        this.notaUm=notaUm;
    }
    public void setNotaDois(int notaDois){
        this.notaDois=notaDois;
    }
    public void setRa(int ra){
        this.ra=ra;
    }
    public String getNome(){
        return nome;
    }
    public int getRa(){
        return ra;
    }
    public double getNotaUm(){
        return notaUm;
    }
    public double getNotaDois(){
        return notaDois;
    }
 
}

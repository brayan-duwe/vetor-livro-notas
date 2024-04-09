package LivroNotas;

import javax.swing.JOptionPane;
import java.util.Random;

public class LivroDeNotas {
    private String nomeDisciplina;
    private double notas1[];
    private double notas2[];
    private double medias[];
    private int qtdeAlunos;

    public LivroDeNotas(String nomeDisciplina, int qtdeAlunos){
        this.nomeDisciplina = nomeDisciplina;
        this.notas1 = new double [qtdeAlunos];
        this.notas2 = new double [qtdeAlunos];
        this.medias = new double [qtdeAlunos];
        this.qtdeAlunos = qtdeAlunos;
    }

    public String getNomeDisciplina(){
        return nomeDisciplina;
    }

    public void gerarNotas() {
        Random gerador = new Random();
        for(int i = 0; i<this.qtdeAlunos;i++){
            this.notas1[i] = gerador.nextDouble() * 10;
            this.notas2[i] = gerador.nextDouble() * 10;
        }
    }
    public void calcularMedias () {
        for (int i = 0; i < this.notas1.length; i++) {
            double media = (this.notas1[i] + this.notas2[i]) / 2;
            this.medias[i] = media;
        }
    }
    public void mostrarMedias ( ) {
        String todasAsMedias = "";
        for (int i = 0; i < qtdeAlunos; i++) {
            todasAsMedias += String.format("Aluno %d: %.2f\n", i + 1, medias[i]);
        }
        JOptionPane.showMessageDialog(null, todasAsMedias);
    }

    public void exibeMaior(){
        double maior = this.medias[0];

        for (int i = 1; i < this.qtdeAlunos; i++){
            if (this.medias[i] > maior)
                maior = this.medias[i];
        }
        JOptionPane.showMessageDialog(null, "Maior média: "+ maior);
    }

    public void mediaDaTurma(){
        double mediaDaTurma = 0;
        for(int i = 0; i < this.qtdeAlunos; i++){
            mediaDaTurma += this.medias[i];
        }
        JOptionPane.showMessageDialog(null, "Média da turma: "+ String.format("%.2f", (mediaDaTurma / this.qtdeAlunos)));
    }
    
}

package LivroNotas;

import LivroNotas.LivroDeNotas;

public class TesteLivroDeNotas {
        public static void main(String[] args) {
            LivroDeNotas livro = new LivroDeNotas("Programação", 10);
            livro.gerarNotas();
            livro.calcularMedias();
            livro.mostrarMedias();
            livro.exibeMaior();
            livro.mediaDaTurma();
        }
}


package siga;

/**
 * Demonstra os três deslizes acontecendo. Execute e observe a saída:
 * é dela que partem as etapas da ficha de atividade prática.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIGA - Aula 11: Decorator e Composite (codigo inicial) ===");

        System.out.println();
        System.out.println("1) Relatorios: uma subclasse por combinacao");
        Relatorio[] variantes = {
            new RelatorioDeAlunos(),
            new ComMarcaDagua(new RelatorioDeAlunos()),
            new ComMarcaDagua(new ComCabecalho( new RelatorioDeAlunos())),
            new ComNumeracao(new ComMarcaDagua( new RelatorioDeAlunos()))
        };

        for (Relatorio r : variantes) {
            System.out.println("   --- " + r.getClass().getSimpleName() + " ---");
            for (String linha : r.gerar().split("\n")) {
                System.out.println("   " + linha);
            }
        }
        
        System.out.println();
        Modulo curso = new Modulo("DSM — Desenvolvimento de Software Multiplataforma");

        Modulo primeiroSemestre = new Modulo("1º semestre");
        primeiroSemestre.adicionar(new Disciplina("Algoritmos", 80));
        primeiroSemestre.adicionar(new Disciplina("Banco de Dados I", 60));

        Modulo segundoSemestre = new Modulo("2º semestre");
        segundoSemestre.adicionar(new Disciplina("Técnicas de Programação II", 80));

        curso.adicionar(primeiroSemestre);
        curso.adicionar(segundoSemestre);
        curso.adicionar(new Disciplina("Projeto Integrador", 40));   // folha direta

        System.out.println("Carga total: " + curso.getCargaHoraria() + "h");
        curso.imprimir(0);
    }
}

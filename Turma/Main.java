public class Main {
    public static void main(String[] args) {
    Aluno a1 = new Aluno("Kadu", "123", 12205);
    Aluno a2 = new Aluno("Paulo", "456", 12206);
    Aluno a3 = new Aluno("Fatima", "789", 12207);
    Professor p1 = new Professor("Pedro", "234", 122, "CC");
    Disciplina d1 = new Disciplina("Física", 1, 3);
    Disciplina d2 = new Disciplina("Matemática", 2, 4);
    Turma t1 = new Turma(10, d1);
    Turma t2 = new Turma(11, d2);
    t1.incluirAluno(a1);
    t1.incluirAluno(a2);
    t1.incluirAluno(a3);

    t2.incluirAluno(a1);

    t1.atribuirNotaFinal(12205, 10);
    t1.atribuirNotaFinal(12206, 5);
    t1.atribuirNotaFinal(12207, 7);
    t2.atribuirNotaFinal(12205, 2);

    System.out.println("Kadu -> cra " + a1.getCra() + " -> creditos " + a1.getCreditos());
    System.out.println("Paulo -> cra " + a2.getCra() + " -> creditos " + a2.getCreditos());
    System.out.println("Fatima -> cra " + a3.getCra() + " -> creditos " + a3.getCreditos());

    System.out.println(t1.obterMediaDaTurma());
    }
}
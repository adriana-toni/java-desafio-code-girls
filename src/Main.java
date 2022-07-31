/**
 *  Classe principal do desafio de projeto - Santander Code Girls
 *
 */
import desafio.code.girls.dominio.*;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        System.out.println("Criando o Bootcamp ----");
        Curso curso1 = new Curso();
        curso1.setTítulo("Introdução ao Git e ao GitHub");
        curso1.setDescricao("Entenda o que é Git e sua importância");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTítulo("Dominando IDEs Java");
        curso2.setDescricao("Conheça as principais IDEs");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTítulo("Lógia condicional e Controle de Fluxos em Java");
        curso3.setDescricao("Conheça os operadores lógicos e as estruturas de controle de fluxo");
        curso3.setCargaHoraria(2);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        Mentoria mentoria = new Mentoria("Mentoria", "Santander Code Girls - Aula Inaugural", LocalDate.now());
        System.out.println(mentoria);

        // Criando o bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Santander Code Girls", "Inicie sua jornada na trilha de Java");

        // Adicionando os cursos e mentorias do bootcamp
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

        System.out.println("Período de Inscrição no Bootcamp ----");
        // Adicionando os alunos do bootcamp
        Aluno alunoAdriana = new Aluno("Adriana");
        Aluno alunoBruno = new Aluno("Bruno");

        // Matriculando os alunos ao bootcamp
        alunoAdriana.inscreverBootcamp(bootcamp);
        alunoBruno.inscreverBootcamp(bootcamp);

        // Listar os conteudos em que cada Aluno está inscrito.
        System.out.println("Conteúdos inscritos do(a) " + alunoAdriana.getNome());
        System.out.println(alunoAdriana.getConteudosInscritos());

        System.out.println("Conteúdos inscritos do(a) " + alunoBruno.getNome());
        System.out.println(alunoBruno.getConteudosInscritos());


        System.out.println("Progredindo no Bootcamp ----");
        // Fazendo os alunos progredirem no bootcamp
        System.out.println("Aluno " + alunoAdriana.getNome());
        alunoAdriana.progredir();
        System.out.println("- Conteúdos concluídos");
        System.out.println(alunoAdriana.getConteudosConcluidos());
        System.out.println("- Conteúdos inscritos");
        System.out.println(alunoAdriana.getConteudosInscritos());
        System.out.println("XP obtidos: " + alunoAdriana.calcularTotalXp());
        alunoAdriana.progredir();
        System.out.println("- Conteúdos concluídos");
        System.out.println(alunoAdriana.getConteudosConcluidos());
        System.out.println("- Conteúdos inscritos");
        System.out.println(alunoAdriana.getConteudosInscritos());
        System.out.println("XP obtidos: " + alunoAdriana.calcularTotalXp());
        alunoAdriana.progredir();
        System.out.println("- Conteúdos concluídos");
        System.out.println(alunoAdriana.getConteudosConcluidos());
        System.out.println("- Conteúdos inscritos");
        System.out.println(alunoAdriana.getConteudosInscritos());
        System.out.println("XP obtidos: " + alunoAdriana.calcularTotalXp());


        System.out.println("Aluno " + alunoBruno.getNome());
        alunoBruno.progredir();
        System.out.println("- Conteúdos concluídos");
        System.out.println(alunoBruno.getConteudosConcluidos());
        System.out.println("- Conteúdos inscritos");
        System.out.println(alunoBruno.getConteudosInscritos());
        System.out.println("XP obtidos: " + alunoBruno.calcularTotalXp());
    }
}

/**
 *  Classe Aluno
 *  - Quando o Aluno se increve em um Bootcamp, ele se inscreve em todo Conteudo do Bootcamp: Cursos e Mentorias
 *  - O Aluno deve concluir os Cursos e Mentorias na ordem em que estão definidos no Bootcamp
 *
 */
package desafio.code.girls.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
public class Aluno {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Aluno(String nome) {
        this.nome = nome;
    }
    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Adiciona todos os conteúdos do bootcamp no conteudosInscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        // Adiciona o Aluno corrente ao bootcamp, para indicar que o aluno está matriculado no bootcamp
        bootcamp.getAlunosInscritos().add(this);
    }

    public void progredir() {
        // Para progredir no bootcamp os conteudos do bootcamp deve ser inseridos no conteudosConcluidos na
        // ordem que os cursos foram inseridos na plataforma
        // Nota: O optional surgiu no Java 8 e serve para resolver as questões de retornos nulos
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum Bootcamp.");
        }
    }

    public double calcularTotalXp() {
        /* Equivalência de soluções
           1- Solução com o corpo da expressão lambda expandido
              return this.conteudosConcluidos.stream().mapToDouble(conteudo -> {
                 return conteudo.calcularXp();
              }).sum();

           2-Solução com expressão lambda em forma reduzida
             return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
         */

        // Solução com Method Reference
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome) && conteudosInscritos.equals(aluno.conteudosInscritos) && conteudosConcluidos.equals(aluno.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}

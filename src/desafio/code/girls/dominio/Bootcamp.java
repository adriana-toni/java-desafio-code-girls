/**
 *  Classe Bootcamp
 *  Define as regras para criação de um bootcamp
 *
 */
package desafio.code.girls.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
public class Bootcamp {

    // Nome do bootcamp
    private String nome;

    // Descrição do bootcamp
    private String descricao;

    // Data de inicio do bootcamp
    private final LocalDate dataInicial = LocalDate.now();

    // Data de termino do bootcamp é 45 dias após a data de inicio
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    // Alunos inscritos no bootcamp
    private Set<Aluno> alunosInscritos = new HashSet<>();

    // Cursos e Mentorias que compõe o BootCamp
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return nome.equals(bootcamp.nome) && descricao.equals(bootcamp.descricao) && dataInicial.equals(bootcamp.dataInicial) && dataFinal.equals(bootcamp.dataFinal) && alunosInscritos.equals(bootcamp.alunosInscritos) && conteudos.equals(bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, alunosInscritos, conteudos);
    }
}

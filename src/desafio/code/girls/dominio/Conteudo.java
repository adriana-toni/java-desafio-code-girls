/**
 *  Classe Conteudo
 *  - Todo Bootcamp tem Conteudo.
 *  - Cursos e Mentorias são Conteudos de um Bootcamp
 */
package desafio.code.girls.dominio;
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    private String título;
    private String descricao;

    public abstract double calcularXp();

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

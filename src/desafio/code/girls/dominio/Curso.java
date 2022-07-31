/**
 *  Classe Curso
 *  Possibilita a criação de um conteudo do tipo Curso que pode compor um bootcamp
 *
 */
package desafio.code.girls.dominio;
public class Curso extends Conteudo {
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "título='" + getTítulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", carga Horaria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}

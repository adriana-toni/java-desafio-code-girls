/**
 *  Classe Mentoria
 *  Possibilita a criação de um conteudo do tipo Mentoria que pode compor um bootcamp
 *
 */
package desafio.code.girls.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    // Data que será realizada a mentoria
    private LocalDate data;
    public Mentoria(String título, String descricao, LocalDate data) {
        this.setTítulo(título);
        this.setDescricao(descricao);
        this.data = data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Mentoria {" +
                "título='" + getTítulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + formato.format(data) +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}

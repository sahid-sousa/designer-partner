package exercicio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {

    private String nome;
    private Calendar vencimento;
    private Set<String> palavrasChave;

    public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) {
        this.nome = nome;
        this.vencimento = vencimento;
        this.palavrasChave = palavrasChave;
    }

    public String getNome() {
        return nome;
    }

    public Calendar getVencimento() {
        return vencimento;
    }

    public Set<String> getPalavrasChave() {
        return palavrasChave;
    }

    @Override
    public Campanha clone() {
        String nome = "Cópia da Campanha: " + this.nome;
        Calendar vencimento = (Calendar) this.vencimento.clone();
        Set<String> palavrasChave = new HashSet<>(this.palavrasChave);
        return new Campanha(nome, vencimento, palavrasChave);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("---------------\n");
        buffer.append("Nome da Campanha: ").append(this.nome).append("\n");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(this.vencimento.getTime());
        buffer.append("Vencimento: ").append(format).append("\n");

        buffer.append("Palavras-chave:\n");
        for (String palavraChave : this.palavrasChave) {
            buffer.append(" - ").append(palavraChave).append("\n");
        }

        buffer.append("---------------\n");
        return buffer.toString();
    }
}


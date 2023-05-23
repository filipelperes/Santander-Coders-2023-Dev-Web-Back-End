package curso.java.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class aula4_manipulacao_str_datas {
    public static void main(String[] args) {
        String nome = "João";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nome2 = "Jessé";
        System.out.println(nome.equals(nome2)); //Case sensitive
        System.out.println(nome.equalsIgnoreCase(nome2)); //Case isensitive

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String weekDay = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else {
            saudacao = "Boa noite";
        }
        System.out.println(saudacao);

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, weekDay, saudacao.toUpperCase());
    }
}

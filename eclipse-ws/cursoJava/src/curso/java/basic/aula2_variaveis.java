package curso.java.basic;

public class aula2_variaveis {
    public static void main(String[] args) {
        // Variaveis String
        String nome;

        nome = "Jessé!";
        nome = "Brasil";

        System.out.println("Olá, " + nome);


        //Variaveis Numericas
        int a;
        int b = 2;

        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);


        //Variaveis Boolean
        boolean result = false;

        System.out.println(result);

        boolean fds = true;
        boolean fazSol = true;
        boolean vamosAPraia = fds && fazSol;

        System.out.println(vamosAPraia);

        // Tabela Verdade

        // Operador && (and)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (or)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // Operador ! (not)
        // !true = false
        // !false = true

        //Operador ternário
        String msg = fds ? "É fim de semana" : "Não é fim de semana";

        System.out.println(msg);
    }
}

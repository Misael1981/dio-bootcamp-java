// O Operador de (+), quando utilizado em variáveis do tipo txto, realizará a
// concatenação

/*
 * public class OperadoresAritmetico {
 * public static void main(String[] args) throws Exception {
 * String nomeCompleto = "Linguagem " + "Java";
 * System.out.println(nomeCompleto);
 * }
 * }
 */

public class OperadoresAritmetico {
    public static void main(String[] args) throws Exception {

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}

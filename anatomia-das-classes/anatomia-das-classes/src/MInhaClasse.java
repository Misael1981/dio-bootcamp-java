public class MInhaClasse {
    public static void main(String[] args) throws Exception {

        String nome = "Misael";
        String sobrenome = "Borges";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return "Resultado do método " + nome.concat(" ").concat(sobrenome);
    }
}

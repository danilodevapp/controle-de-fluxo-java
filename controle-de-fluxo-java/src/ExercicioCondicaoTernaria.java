public class ExercicioCondicaoTernaria {
    public static void main(String[] args) {
        int quantidadeDeSapato = 10;

        String consulta = quantidadeDeSapato < 50 ? "Repor o estoque" : quantidadeDeSapato >= 50 ? "Estoque suficiente" : "Repor o Estoque";
        System.out.println(consulta);
    }
}

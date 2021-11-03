import notas.Notas;

public class LivroNotas {
    public static void main(String[] args) throws Exception {
        Notas notas1 = new Notas("Matematica");
        notas1.mostrarMensagem();
        notas1.mediaClasse(95, 55, 24, 88, 74, 65, 11, 39, 71, 68);
        notas1.Conceito();

        Notas notas2 = new Notas("Ciecias");
        notas2.mostrarMensagem();
        notas2.mediaClasse(91, 92, 93, 94, 95, 96, 97, 98, 99, 99);
        notas2.Conceito();

        Notas notas3 = new Notas("Sociologia");
        notas3.mostrarMensagem();
        notas3.mediaClasse(81, 82, 83, 84, 85, 86, 87, 88, 89, 89);
        notas3.Conceito();;

        Notas notas4 = new Notas("Biologia");
        notas4.mostrarMensagem();
        notas4.mediaClasse(61, 62, 63, 64, 65, 66, 67, 68, 69, 70);
        notas4.Conceito();

        Notas notas5 = new Notas("Historia");
        notas5.mostrarMensagem();
        notas5.mediaClasse(21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
        notas5.Conceito();

        Notas notas6 = new Notas("Artes");
        notas6.mostrarMensagem();
        notas6.mediaClasse(11, 12, 13, 14, 15, 16, 17, 18, 19, 9);
        notas6.Conceito();
    }
}

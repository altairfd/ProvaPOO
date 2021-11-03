package notas;

public class Notas {
    private String nomeCurso;
    int media;


    public Notas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void mostrarMensagem() {
        System.out.println("------------------");
        System.out.println("Bem-vindo ao curos de: " + this.nomeCurso);
    }

    public void mediaClasse(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10) {
        System.out.println("Abaixo iremos realizar a media da classe");
        media = (a1+a2+a3+a4+a5+a6+a7+a8+a9+a10)/10;
        System.out.println("A média da classe é: " + media);

    }

    public void Conceito() {
        if (media >= 95 && media <= 100) {
            System.out.println("A classe está com um conceito: A");
        }
        else if (media >= 80 && media <=94){
            System.out.println("A classe está com um conceito: B");
        }
        else if(media <= 79 && media >= 60) {
            System.out.println("A classe está com um conceito: C");
        }
        else if (media <= 59 && media >= 40) {
            System.out.println("A classe está com um conceito: D");
        }
        else if (media <= 39 && media >= 20) {
            System.out.println("A classe está com um conceito: E");
        }
        else if (media <=19 && media >= 0) {
            System.out.println("A classe etá com um conceito: F");
        }
        
    }
}

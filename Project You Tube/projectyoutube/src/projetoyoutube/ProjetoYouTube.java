package projetoyoutube;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video ("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Thyago", 31, "M", "Luiz");
        u[1] = new Usuario("Camila", 33, "F", "Mila"); 
        
        Visualizacao ver[] = new Visualizacao[2];
        ver[0] = new Visualizacao(u[0], v[1]);
        ver[0].avaliar();
        System.out.println(ver[0].toString());
        ver[1] = new Visualizacao(u[0], v[2]);
        ver[1].avaliar(80.0f);
        System.out.println(ver[1].toString());


        /* 
        System.out.println("Vídeos\n---------------------------");
        System.out.println(v[0].toString());
        System.out.println("\nUsuários\n---------------------------");
        System.out.println(u[0].toString()); */
    }
    
}

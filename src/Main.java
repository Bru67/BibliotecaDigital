import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<ItemBibliotecaDigital> ebooks = new ArrayList<ItemBibliotecaDigital>();
        ebooks.add(new Ebook("De Sangue e Cinzas (Vol. 1)","Jennifer L. Armentrout",588));
        ebooks.add(new Ebook("Orgulho e Preconceito", "Jane Austen", 424));
        ebooks.add(new Ebook("Teto para Dois", "Beth O'Leary", 400));
        ebooks.add(new Ebook("Arquipélago", "Leslie Cadero", 496));

        ArrayList<ItemBibliotecaDigital> videos = new ArrayList<ItemBibliotecaDigital>();
        videos.add(new VideoDigital("Happy Together(feat. Ray Toro)", "Gerard Way"));
        videos.add(new VideoDigital("Pangeia(clipe oficial)", "Fabio Brazza"));
        videos.add(new VideoDigital("Sunflower - Spider-Man", "Post Malone"));
        videos.add(new VideoDigital("Exagerado", "Cazuza"));

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("O que você deseja encontrar hoje??\n" +
                    "[ 1 ] - Ebooks\n" +
                    "[ 2 ] - Vídeos Digitais");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Ebooks Disponíveis:");
                    for (int i = 0; i < ebooks.size(); i++) {
                        System.out.println("[ " + i + " ] - " + ebooks.get(i).getTitulo());
                    }
                    int ebookId = sc.nextInt();
                    if (ebookId >= 0 && ebookId <= ebooks.size()) {
                        ItemBibliotecaDigital item = ebooks.get(ebookId);
                        item.descricao();
                        System.out.println();
                        item.menu(item);
                    }
                    else{
                        System.out.println("Opção Inválida!");
                    }
                    break;

                case 2:
                    System.out.println("Vídeos Digitais Disponíveis:");
                    for (int i = 0; i < videos.size(); i++) {
                        System.out.println("[ " + i + " ] - " + videos.get(i).getTitulo());
                    }
                    int videoId = sc.nextInt();
                    if (videoId >= 0 && videoId <= videos.size()) {
                        ItemBibliotecaDigital item = videos.get(videoId);
                        item.descricao();
                        System.out.println();
                        item.menu(item);
                    }
                    else{
                        System.out.println("Opção Inválida!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }

    }
}
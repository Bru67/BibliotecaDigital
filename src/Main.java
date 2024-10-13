import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<ItemBibliotecaDigital> ebooks = new ArrayList<ItemBibliotecaDigital>();
        ebooks.add(new Ebook("titulo","",1));
        ebooks.add(new Ebook("Orgulho e Preconceito", "Jane Austen", 424));
        ebooks.add(new Ebook("Teto para Dois", "Beth O'Leary", 400));
        ebooks.add(new Ebook("Arquipélago", "Leslie Cadero", 496));

        ArrayList<ItemBibliotecaDigital> videos = new ArrayList<ItemBibliotecaDigital>();
        videos.add(new VideoDigital("Happy Together(feat. Ray Toro)", "Gerard Way"));
        videos.add(new VideoDigital("Pangeia(clipe oficial)", "Fabio Brazza"));
        videos.add(new VideoDigital("Sunflower - Spider-Man", "Post Malone"));
        videos.add(new VideoDigital("Exagerado", "Cazuza"));

        Scanner sc = new Scanner(System.in);
        System.out.println("O que você deseja encontrar hoje??\n" +
                "[ 1 ] - Ebooks\n" +
                "[ 2 ] - Vídeos Digitais");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Ebooks Disponíveis:");
                for (int i = 1; i < ebooks.size(); i++) {
                    System.out.println("[ " + i + " ] - " + ebooks.get(i).getTitulo());
                }
//                ItemBibliotecaDigital item;
//                int item = sc.nextInt();
//                item.visualizar();
//                        break;

            case 2:
                System.out.println("Vídeos Digitais Disponíveis:");
                for(ItemBibliotecaDigital i : videos){
                    System.out.println("[ "+ videos.indexOf(i) +" ] - " + i.getTitulo());
                }
                break;
            default:
            //code
            break;
        }



    }
}
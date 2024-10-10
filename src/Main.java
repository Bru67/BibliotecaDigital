public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ItemBibliotecaDigital livro1 = new Ebook("Orgulho e Preconceito", "Jane Austen", 424);
        ItemBibliotecaDigital livro2 = new Ebook("Teto para Dois", "Beth O'Leary", 400);
        ItemBibliotecaDigital livro3 = new Ebook("Arquipélago", "Leslie Cadero", 496);

        ItemBibliotecaDigital video1 = new VideoDigital("Primeira aula de Python", "Gustavo Guanabara");
        ItemBibliotecaDigital video2 = new VideoDigital("", "");
        ItemBibliotecaDigital video3 = new VideoDigital("","");

    }
}
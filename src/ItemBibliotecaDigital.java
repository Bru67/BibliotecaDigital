import java.util.Scanner;

public abstract class ItemBibliotecaDigital implements Visualizavel, Baixavel{
    private String titulo;
    private String autor;

    public ItemBibliotecaDigital(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;

    }
    public void menu(ItemBibliotecaDigital item){
        Scanner sc = new Scanner(System.in);
        System.out.println("[ 1 ] - Baixar\n" +
                "[ 2 ] - Visualizar");
        int menu = sc.nextInt();
        if (menu == 1){
            item.baixar();
        }
        else if (menu == 2){
            item.visualizar();
        }
    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }

    public abstract void descricao();
}

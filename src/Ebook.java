public class Ebook extends ItemBibliotecaDigital {
    private double paginas;
    public Ebook(String titulo, String autor, double paginas){
        super(titulo, autor);
        this.paginas = paginas;
    }

    public void baixar() {
        System.out.println("Download realizado com sucesso!");
    }
    public void descricao() {
        System.out.println("O eBook " + getTitulo() + " do autor " + getAutor() + " possui " + getPaginas() + " páginas" );
    }
    public void visualizar() {
        System.out.println("Você esta visualizando o eBook " + getTitulo());
        System.out.println();
    }

    public double getPaginas() {
        return paginas;
    }
}

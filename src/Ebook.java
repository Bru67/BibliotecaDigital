public class Ebook extends ItemBibliotecaDigital {
    private double paginas;
    public Ebook(String titulo, String autor, double paginas){
        super(titulo, autor);
        this.paginas = paginas;
    }

    public void baixar() {
        System.out.println("Download realizado com sucesso!");
    }
    public String descricao() {
        return "O eBook " + getTitulo() + " do autor " + getAutor() + " possui " + getPaginas() + " páginas" ;
    }
    public void visualizar() {
        System.out.println("Você esta visualizando o eBook " + getTitulo() + " com " + getPaginas() + " páginas ");
    }

    public double getPaginas() {
        return paginas;
    }
}

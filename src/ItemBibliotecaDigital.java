public abstract class ItemBibliotecaDigital implements Visualizavel, Baixavel{
    private String titulo;
    private String autor;

    public ItemBibliotecaDigital(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;

    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }

    public abstract String descricao();
}

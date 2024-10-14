public class VideoDigital extends ItemBibliotecaDigital{

    public VideoDigital(String titulo, String autor){
        super(titulo, autor);
    }

    public String descricao(){
        return "O vídeo " + getTitulo() + " com o autor " + getAutor() ;
    }

    public void baixar() {
        System.out.println("Item não disponível para download!");
    }

    public void visualizar() {
        System.out.println("Video visualizado!");
        System.out.println();
    }
}

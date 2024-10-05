public class VideoDigital extends ItemBibliotecaDigital{
    public String descricao(){
        return null;
    }
    public VideoDigital(String titulo, String autor){
        super(titulo, autor);
    }


    public void baixar() {
        System.out.println("Item não disponível para download!");
    }

    public void visualizar() {
        System.out.println("Video visualizado!");

    }
}

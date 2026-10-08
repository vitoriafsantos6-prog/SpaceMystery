public abstract class  Personagem implements Acao{

    private String nome;
    private boolean vivo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Personagem (String nome) {

        this.nome = nome;
        this.vivo = true;

    }

    public abstract void realizaracao();
}

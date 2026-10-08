public class Tarefa{

    private String nome;
    private String descricao;
    private boolean concluida;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir(){

        concluida = true;
    }



    public Tarefa (String nome, String descricao) {

        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false;




    }

}

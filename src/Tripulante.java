public class Tripulante extends Personagem{


    private Tarefa tarefa;

    @Override
    public void executarAcao() {

    }

    public Tripulante(String nome) {
        super(nome);

    }

    @Override
    public void realizaracao() {
        realizartarefa();

    }


    public void realizartarefa() {
        System.out.println ("o tribulante realizou uma tarefa!");

    }

    public void adicionartarefa ( Tarefa tarefa){
        this.tarefa = tarefa;
    }

    public void concluirTarefa(){
        tarefa.concluir();
    }

}




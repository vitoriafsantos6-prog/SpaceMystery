public class Infiltrado  extends Personagem{



    private boolean disfaçado;


        private Tarefa tarefa;


    public Infiltrado (String nome){
            super (nome);
            disfaçado = true;

    }

    @Override
    public void realizaracao() {

    }

    public void sabotar (){

        System.out.println ("o infiltrado sabotou a nave!");
    }

    @Override
    public void executarAcao() {

    }
}





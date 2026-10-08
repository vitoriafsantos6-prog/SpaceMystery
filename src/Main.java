public class Main {


    public static void main(String[] args) {

        Tripulante tripulante = new Tripulante("Vitoria");
        Infiltrado infiltrado = new Infiltrado("Alex");


        Tarefa tarefa = new Tarefa("Consertar motor", "Consertar o motor da nave");

        tripulante.adicionartarefa(tarefa);


        tripulante.realizartarefa();
        infiltrado.sabotar();


        infiltrado.executarAcao();

        System.out.println("Tarefa concluída: " + tarefa.isConcluida());
    }
}
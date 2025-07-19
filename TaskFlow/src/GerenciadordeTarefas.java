import java.util.HashMap;
import java.util.Map;

public class GerenciadordeTarefas {

    private String id;
    private String tarefa;
    private boolean tarefaConcluida;

    private Map<String, Tarefa> tarefas = new HashMap<>();

    public GerenciadordeTarefas() {
    }

    public void concluirTarefa(String ID) {

        this.tarefaConcluida = true;
    }

    public boolean isTarefaConcluida() {

        return tarefaConcluida;
    }

    public String toString() {
        return tarefa + (tarefaConcluida ? " (concluída) " : "");
    }

    public void adicionarTarefa(String id, String descricao) {
        Tarefa t = new Tarefa(id, descricao);
        tarefas.put(id, tarefa);
    }

    public void removerTarefa(String ID) {

        tarefas.remove(ID);
    }


    public Map<String, String> getTarefas() {

        return ger;
    }

    public void listarTarefas() {
        System.out.println("# TAREFAS #\n ");
        int n = 1;

        for (Tarefa t : tarefas.values()) {
            System.out.println(n + ". ID: " + item.getKey() + " -> TAREFA: " + item.getValue() + "\n");
            n++;
        }
    }
}



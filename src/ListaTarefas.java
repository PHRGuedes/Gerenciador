public class ListaTarefas {

private int id;
private date dataTarefa;
private String descricao;
private String observacao;
private Responsavel responsavel;
private Prioridade prioridade;  

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public date getDataTarefa() {
    return dataTarefa;
}

public void setDataTarefa(date dataTarefa) {
    this.dataTarefa = dataTarefa;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public String getObservacao() {
    return observacao;
}

public void setObservacao(String observacao) {
    this.observacao = observacao;
}

public Responsavel getResponsavel() {
    return responsavel;
}

public void setResponsavel(Responsavel responsavel) {
    this.responsavel = responsavel;
}

public Prioridade getPrioridade() {
    return prioridade;
}

public void setPrioridade(Prioridade prioridade) {
    this.prioridade = prioridade;
}
public ListaTarefas(int id, date dataTarefa, String descricao, String observacao, Responsavel responsavel, Prioridade prioridade) {
    this.id = id;
    this.dataTarefa = dataTarefa;
    this.descricao = descricao;
    this.observacao = observacao;
    this.responsavel = responsavel;
    this.prioridade = prioridade;
}

public ListaTarefas() {
    // Default constructor
}
}

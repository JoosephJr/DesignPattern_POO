package model;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(int id, String nome, String descricao, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

       private Produto id(int id){
        this.id = id;
        return this;
    }
        private Produto nome(String nome){
        this.nome = nome;
        return this;
    }

       private Produto descricao(String descricao){
        this.descricao = descricao;
        return this;
    }

       private Produto preco(double preco){
        this.preco = preco;
        return this;
    }

       private Produto quantidade(int quantidade){
        this.quantidade = quantidade;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    


    

    
    
}

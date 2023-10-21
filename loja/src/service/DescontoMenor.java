package service;


import model.Produto;

public class DescontoMenor extends Desconto {

    private Produto produto;


    public DescontoMenor(Produto produto){
        super(produto);
       
    }

    @Override
    public boolean aplicarDesconto() {
        return produto.getQuantidade() > 5;

    }


    @Override
    public double calcular() {

        return produto.getPreco() * 0.05;
    }

    
}
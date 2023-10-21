package service;

import java.math.BigDecimal;

import model.Produto;

public class DescontoMaior extends Desconto {

    private Produto produto;


    public DescontoMaior(Produto produto){
        super(produto);
     
    }

    @Override
    public boolean aplicarDesconto() {
        return produto.getQuantidade() > 10;
    

    }


    @Override
    public double calcular() {

        return produto.getPreco() * 0.1;
    }

    
}

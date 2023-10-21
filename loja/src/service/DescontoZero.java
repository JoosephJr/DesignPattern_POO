package service;

import model.Produto;

public class DescontoZero extends Desconto {
    


    private Produto produto;


    public DescontoZero(Produto produto){
        super(produto);
        
    }

    @Override
    public boolean aplicarDesconto() {
        return false ;
    }

    @Override
    public double calcular() {
        return 0;
    }

    
}
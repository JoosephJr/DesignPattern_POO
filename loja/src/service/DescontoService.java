package service;

import java.math.BigDecimal;

import model.Produto;

public class DescontoService {

   public double calcularDesconto(Produto produto){
       var desconto = 0 ;

       desconto =  new DescontoMaior(produto).ou(new DescontoMenor(produto)).ou(new DescontoZero(produto))
            .calcular();
            return desconto;
    }
}

    


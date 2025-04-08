package controller;

import br.edu.fateczl.fila.Fila;
import model.Cliente;

public class OperacaoController {

    public void caixa(Fila<Cliente> flCliente) throws Exception {
        float totalGeral = 0;
        while(!flCliente.isEmpty()){
            Cliente cl = flCliente.remove();
            totalGeral += cl.getQuantidadePecas() * cl.getValorPecas();
            System.out.println("Total da compra do cliente "+cl.getNome()+" é igual a "+(cl.getValorPecas()*cl.getQuantidadePecas()));
        }
        System.out.println("Total dos totais: "+ totalGeral);
    }
}

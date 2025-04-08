package view;

import br.edu.fateczl.fila.Fila;
import model.Cliente;

import java.util.Scanner;
import controller.OperacaoController;

public class Principal {
    public static void main(String[] args) throws Exception {
        Fila<Cliente> filaClientes = new Fila<>();
        OperacaoController oc = new OperacaoController();
        Scanner sc = new Scanner(System.in);
        int quantidadePecas;
        float valorPecas;

        while(true){
            System.out.println("*===== SISTEMA DE CAIXA =====*" +
                    "\n1. Cadastrar clientes." +
                    "\n2. Verificar caixa." +
                    "\n3. Encerrar programa.");
            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    for(int i = 0; i < 5; i++){
                        System.out.print("Digite o nome do cliente "+i+": ");
                        String nome = sc.next();
                        do{
                            System.out.print("Digite a quantidade de peças: ");
                            quantidadePecas = sc.nextInt();
                            if(quantidadePecas > 50 || quantidadePecas < 20){
                                System.out.println("Não pode!");
                            }
                        }while(quantidadePecas > 50 || quantidadePecas < 20);
                        do{
                            System.out.print("Digite o valor das peças: ");
                            valorPecas = sc.nextFloat();
                        }while(valorPecas > 100.00 || valorPecas < 5.00);
                        Cliente novoCliente = new Cliente(nome,quantidadePecas,valorPecas);
                        filaClientes.insert(novoCliente);
                        System.out.println("Adicionado!");
                    }
                    break;
                case 2:
                    if(filaClientes.isEmpty()){
                        System.out.println("Fila vazia!");
                    }else{
                        oc.caixa(filaClientes);
                    }
                    break;
                case 3:
                    System.out.println("Encerrando....");
                    return;
                default:
                    System.out.println("Opção desconhecida!");
            }

        }

    }
}

import Entidades.Hamburguer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criação das variáveis para utilização
        String  escolhaVerdura, escolhaMolho, escolhaTipo, escolhaQueijo, nomeCliente;


        //Criação dos Objetos
        Scanner sc = new Scanner(System.in);
        Hamburguer pedido1 = new Hamburguer();

        //Inicio do sistema
        System.out.println("Para inciar o atendimento, digite seu nome: ");
        nomeCliente = sc.nextLine();
        pedido1.setNomeCliente(nomeCliente);


        System.out.println("Olá " + pedido1.getNomeCliente() + "! Bem vindo a Hamburgueria Moderna!");
        System.out.println("                           ");
        System.out.println("Escolha o tipo da Carne: ");
        System.out.println("Carne: R$ 10,00 \nFrango: R$ 7,00");
        escolhaTipo = sc.nextLine();
        pedido1.pedidoHamburguerCarne(escolhaTipo);

        System.out.println("Deseja Acrescentar Verdura?");
        System.out.println("Sim R$ 2,00  \nNão R$ 0,00");
        escolhaVerdura = sc.nextLine();
        pedido1.pedidoHamburguerVerdura(escolhaVerdura);

        System.out.println("Deseja Acrescentar Molho?");
        System.out.println("Sim R$ 3,00  \nNão R$ 0,00");
        escolhaMolho = sc.nextLine();
        pedido1.pedidoHamburguerMolho(escolhaMolho);

        System.out.println("Deseja Acrescentar Queijo?");
        System.out.println("Sim R$ 5,00  \nNão R$ 0,00");
        escolhaQueijo = sc.nextLine();
        pedido1.pedidoHamburguerQueijo(escolhaQueijo);

        System.out.println("                           ");
        System.out.println("Pedido Realizado, Você pode ver seu pedido enquanto aguarda! ");
        System.out.println("                           ");

            pedido1.ImprimirPedido();


   }
}

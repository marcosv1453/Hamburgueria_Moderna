package Entidades;

public class Hamburguer {

    //Criação das Variáveis
    private String nomeCliente;
    private String tipoCarne;
    private String verdura;
    private String molho;
    private String queijo;
    private int valor;

//Criação dos Gets e Sets


    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoCarne(String escolhaTipo) {
        return tipoCarne;
    }
    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getVerdura(String escolhaVerdura) {
        return verdura;
    }
    public void setVerdura(String verdura) {
        this.verdura = verdura;
    }

    public String getMolho(String escolhaMolho) {
        return molho;
    }
    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getQueijo(String escolhaQueijo) {
        return queijo;
    }
    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        valor = valor;
    }


    public void pedidoHamburguerCarne(String escolhaTipo){

        if (escolhaTipo.equalsIgnoreCase("carne")){
            tipoCarne = "Carne";
            valor += 10;
        } else if(escolhaTipo.equalsIgnoreCase("frango")){
            tipoCarne = "Frango";
           valor += 7;
        }else{
            System.out.println("Sabor Inválido");
        }
    }

    public void pedidoHamburguerVerdura(String escolhaVerdura){

        if (escolhaVerdura.equalsIgnoreCase("Sim")){
            verdura = "Sim";
            valor += 2;
        } else if(escolhaVerdura.equalsIgnoreCase("Não")){
            verdura = "Não";
        }else{
            System.out.println("Inválido");
        }
    }

    public void pedidoHamburguerMolho(String escolhaMolho){
        if (escolhaMolho.equalsIgnoreCase("Sim")){
           molho = "Sim";
            valor += 3;
        } else if(escolhaMolho.equalsIgnoreCase("Não")){
            molho = "Não";
        }else{
            System.out.println("Inválido");
        }
    }

    public void pedidoHamburguerQueijo(String escolhaQueijo){
        if (escolhaQueijo.equalsIgnoreCase("Sim")){
            queijo = "Sim";
            valor += 5;
        } else if(escolhaQueijo.equalsIgnoreCase("Não")){
            queijo = "Não";
        }else{
            System.out.println("Inválido");
        }
    }

    public void ImprimirPedido(){
        System.out.println("Pedido Hamburguer de " + this.nomeCliente);
        System.out.println("                 ");
        System.out.println("Tipo da carne: " + tipoCarne);
        System.out.println("Verdura: " +  verdura);
        System.out.println("Molhor: " + molho);
        System.out.println("Queijo: " + queijo);
        System.out.println("Valor Total : R$ " + valor);
    }
}

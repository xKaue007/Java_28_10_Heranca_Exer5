public class Principal{

    public static void main(String args[]){

    Novo novo=new Novo();
    Velho velho=new Velho();

    novo.setEndereco("Rua José Pereira Mendes");
    novo.setPreco(250000);
    novo.setAdicionalPreco(0.2*novo.getPreco());
    System.out.println(novo.getPreco()+novo.getAdicionalPreco());

    System.out.println("Imovel usado:");

    velho.setEndereco("Vitor Eusébio da Silva");
    velho.setPreco(230000);

    velho.setDescontoPreco(0.1*velho.getPreco());
    System.out.println("Preço do imóvel velho: "+(velho.getPreco()-velho.getDescontoPreco()));

    }
}
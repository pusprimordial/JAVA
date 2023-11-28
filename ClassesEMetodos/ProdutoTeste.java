package ClassesEMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.90;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "caneta preta";
        p2.preco = 20.0;
        p2.desconto = 0.10;
        
        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);




    }                                                                      
}


import produto.model.preco;

    public static void main(String[] args) {
        preco p = new preco();

        p.setNome("Caneta");
        p.setPreco(2.50);
        p.setQuantidade(10);

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preco: R$" + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());


        p.setPreco(-2.50);
        p.setQuantidade(-3);

        System.out.println("Apos tentativa de valores invalidos:");
        System.out.println("Preco: R$" + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }

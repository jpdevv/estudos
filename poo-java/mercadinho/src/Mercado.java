public class Mercado {
    Produto[] produtos = new Produto[20];
    private int quantidade;

    public String addProduto(String nomeProduto, double valorProduto) {
        if(this.quantidade < produtos.length) {
            produtos[quantidade] = new Produto(nomeProduto, valorProduto);
            quantidade++;
            return "ok";
        } else {
            return null;
        }
    }

    public Produto pesquisarProduto(String nomeProduto) {
        int camposNulos = 0;
        for(int i = 0; i < produtos.length; i++) {
            if(produtos[i] == null) {
                camposNulos++;
            }
        }
        if(camposNulos >= produtos.length) return null;

        for(int i = 0; i < produtos.length; i++) {
            if(nomeProduto.equals(produtos[i].getNome()) && produtos[i] != null) {
                return produtos[i];
            }
        }
        return null;
    }

    public String excluirProduto(String nomeProduto) {
        int camposNulos = 0;
        for(int i = 0; i < produtos.length; i++) {
            if(produtos[i] == null) {
                camposNulos++;
            }
        }
        if(camposNulos >= produtos.length) return null;
        
        for(int i = 0; i < produtos.length; i++) {
            if(nomeProduto.equals(produtos[i].getNome())) {
                produtos[i] = null;
                return "ok";
            }
        }
        return null;
    }
}

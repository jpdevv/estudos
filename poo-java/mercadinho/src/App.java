import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        String opcoes[] = {"Pesquisar produto", "Adiconar produto", "Excluir produto", "Fechar"};
        
        while (true) {
            int select = JOptionPane.showOptionDialog(null, "Bem vindo(a) ao mercado!", "Escolha uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            if(select == 0) {
                String selectPesquisa = JOptionPane.showInputDialog(null, "Insira o nome do produto que deseja procurar", "Mercado", JOptionPane.INFORMATION_MESSAGE);
                if(mercado.pesquisarProduto(selectPesquisa) != null) {
                    JOptionPane.showMessageDialog(null, String.format("Nome do produto: %s\nValor: R$%.2f", selectPesquisa, mercado.pesquisarProduto(selectPesquisa).getValor()), "Mercado - Produto encontrado!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, String.format("O produto '%s' não existe no mercado, ou o estoque está vazio!", selectPesquisa), "Mercado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if(select == 1) {
                JTextField nomeField = new JTextField();
                JTextField valoField = new JTextField();
                Object[] mensagem = {
                    "Nome do produto:", nomeField,
                    "Valor do produto:", valoField
                };
                int selectAdd = JOptionPane.showConfirmDialog(null, mensagem, "Mercado", JOptionPane.OK_CANCEL_OPTION);
                if(selectAdd == JOptionPane.OK_OPTION) {
                    String nomeProd = nomeField.getText();
                    double valorProd = Double.parseDouble(valoField.getText());
                    if(mercado.addProduto(nomeProd, valorProd) != null) {
                        JOptionPane.showMessageDialog(null, String.format("O produto '%s' foi adicionado com sucesso!", nomeProd), "Mercado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "O estoque do mercado está cheio!", "Mercado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            if(select == 2) {
                String selectExcluir = JOptionPane.showInputDialog("Insira o nome do produto para excluir");
                if(mercado.excluirProduto(selectExcluir) != null) {
                    JOptionPane.showMessageDialog(null, String.format("O produto '%s' foi excluído com sucesso!", selectExcluir), "Mercado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, String.format("O produto '%s' não existe no mercado!", selectExcluir), "Mercado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if(select == 3) {
                //Fecha o loop
                break;
            }
        }
    }
}

public class Concessionaria {
    Veiculo[] veiculos = new Veiculo[10];
    private int vagas;

    public String adicionarVeiculo(Veiculo veiculo) {
        if(vagas == veiculos.length) return "Não há mais vagas na concessionária!";
        if(vagas >= 0) {
            veiculos[vagas++] = veiculo;
            return "Veículo adicionado com sucesso!";
        }
        return null;
    }

    public void listarVeiculos() {
        for(int i = 0; i < veiculos.length; i++) {
            if(veiculos[i] != null) {
                System.out.println(veiculos[i].getInfoVeiculo());
            }
        }
    }

    public String buscarVeiculoPorModelo(String modelo) {
        for(int i = 0; i < veiculos.length; i++) {
            if(veiculos[i].getModelo().equalsIgnoreCase(modelo)) {
                return "Veículo encontrado:\n" + veiculos[i].getInfoVeiculo();
            }
        }
        return "Não há esse veículo na concessionária!";
    }
}

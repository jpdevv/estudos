public class Main {
    public static void main(String[] args) {
        Concessionaria conce = new Concessionaria();
        Veiculo[] v = {
            new Veiculo("GT-R R35", "Nissan", 134578, 10),
            new Veiculo("Civic", "Honda", 234567, 6),
            new Veiculo("Duster", "Renault", 100000, 7),
            new Veiculo("T-Cross", "Volkswagen", 150000, 11),
            new Veiculo("Corolla", "Toyota", 130000, 3)
        };
        
        for(int i = 0; i < v.length; i++) {
            System.out.println(conce.adicionarVeiculo(v[i]));
        }
        System.out.println();

        conce.listarVeiculos();

        System.out.println(conce.buscarVeiculoPorModelo("civic"));
        System.out.println(conce.buscarVeiculoPorModelo("corolla"));
    }
}

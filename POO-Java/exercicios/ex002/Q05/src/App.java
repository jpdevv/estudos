public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario(1212, "Douglas Ferreira", 65478612309l, "Rua Baixias", 83999845573l, 25, 17685f);
        
        System.out.println(f.toString());
        f.setSalario(18765f);
        System.out.println(f.toString());
    }
}

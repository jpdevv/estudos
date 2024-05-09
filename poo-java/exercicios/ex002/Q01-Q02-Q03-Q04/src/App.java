public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q = new Quadrado(198);
        Retangulo r = new Retangulo(26, 48);
        Circulo c = new Circulo(55);
        Fita f1 = new Fita("Herói por Acidente", 5.9f);
        Fita f2 = new Fita("Batman", 8.7f);
        
        q.imprimir();
        r.imprimir();
        c.imprimir();

        System.out.println(f1.toString());
        System.out.println(f1.getValorAluguel(5));

        System.out.println(f2.toString());
        System.out.println(f2.getValorAluguel(15));
    }
}


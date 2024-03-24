public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q = new Quadrado(12);
        Retangulo r = new Retangulo(10, 10);
        Circulo c = new Circulo(15);
        Fita f[] = new Fita[3];

        f[0] = new Fita("Herói por Acidente", 5.9f);
        f[1] = new Fita("Batman", 7.9f);
        f[2] = new Fita("Homem Aranha: Sem Volta Para Casa", 9.9f);
        
        System.out.println(q.imprimir());
        System.out.println(r.imprimir());
        System.out.println(c.imprimir());

        System.out.println(f[0].toString());
        System.out.println(f[0].getValorAluguel(5));

        System.out.println(f[1].toString());
        System.out.println(f[1].getValorAluguel(2));

        System.out.println(f[2].toString());
        System.out.println(f[2].getValorAluguel(15));
    }
}


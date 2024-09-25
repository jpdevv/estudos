public class App {
    public static void main(String[] args) throws Exception {
        Calendario c1 = new Calendario(12, 1, 2024);
        Calendario c2 = new Calendario(30, 5, 2058);

        c1.mostrarData();
        c1.anoBissexto();
        
        c2.mostrarData();
        c2.anoBissexto();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Professor prof = new Professor("Borges", 120865, "Pedagogia");
        System.out.println(prof.toString());
        
        Porta porta = new Porta("Marrom", 2.1f, 0.8f, true);
        System.out.println(porta.toString());

        Televisor tv = new Televisor(0, 0, false);
        ControleRemoto ctrl = new ControleRemoto(tv);

        ctrl.ligar();
        ctrl.aumentarVolume();
        ctrl.trocarCanal(16);
        System.out.println(tv.toString());
    }
}

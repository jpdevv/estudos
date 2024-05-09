public class Calendario {
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int m) {
        String nmes = "";
        switch (m) {
            case 1:
                nmes = "Janeiro";
                break;
            case 2:
                nmes = "Fevereiro";
                break;
            case 3:
                nmes = "Março";
                break;
            case 4:
                nmes = "Abril";
                break;
            case 5:
                nmes = "Maio";
                break;
            case 6:
                nmes = "Junho";
                break;
            case 7:
                nmes = "Julho";
                break;
            case 8:
                nmes = "Agosto";
                break;
            case 9:
                nmes = "Setembro";
                break;
            case 10:
                nmes = "Outubro";
                break;
            case 11:
                nmes = "Novembro";
                break;
            case 12:
                nmes = "Dezembro";
                break;
        }
        return nmes;
    }

    public void mostrarData() {
        System.out.println(this.dia + " de " + nomeMes(this.mes) + " de " + this.ano);
    }
    public void anoBissexto() {
        if (this.ano % 4 == 0) {
            System.out.println("O ano " + this.ano + " é bissexto!\n");
        } else System.out.println("O ano " + this.ano + " não é bissexto!\n");
    }
}

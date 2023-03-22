public class Main {
    public static void main(String[] args) {
        Meses mes;
        mes = Meses.dez;

        System.out.println(mes);
        mes = mes.getNext();
        System.out.println(mes);
    }
}
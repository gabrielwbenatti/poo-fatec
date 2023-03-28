import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> baralho;

    private void alimentarBaralho() {
        Carta c1;

        //COPAS
        c1 = new Carta("as","Copas",11);
        inserir(c1);
        c1 = new Carta("dois","Copas",2);
        inserir(c1);
        c1 = new Carta("tres","Copas",3);
        inserir(c1);
        c1 = new Carta("quatro","Copas",4);
        inserir(c1);
        c1 = new Carta("cinco","Copas",5);
        inserir(c1);
        c1 = new Carta("seis","Copas",6);
        inserir(c1);
        c1 = new Carta("sete","Copas",7);
        inserir(c1);
        c1 = new Carta("oito","Copas",8);
        inserir(c1);
        c1 = new Carta("nove","Copas",9);
        inserir(c1);
        c1 = new Carta("dez","Copas",10);
        inserir(c1);
        c1 = new Carta("valete","Copas",10);
        inserir(c1);
        c1 = new Carta("dama","Copas",10);
        inserir(c1);
        c1 = new Carta("rei","Copas",10);
        inserir(c1);

        //PAUS
        c1 = new Carta("as","Paus",11);
        inserir(c1);
        c1 = new Carta("dois","Paus",2);
        inserir(c1);
        c1 = new Carta("tres","Paus",3);
        inserir(c1);
        c1 = new Carta("quatro","Paus",4);
        inserir(c1);
        c1 = new Carta("cinco","Paus",5);
        inserir(c1);
        c1 = new Carta("seis","Paus",6);
        inserir(c1);
        c1 = new Carta("sete","Paus",7);
        inserir(c1);
        c1 = new Carta("oito","Paus",8);
        inserir(c1);
        c1 = new Carta("nove","Paus",9);
        inserir(c1);
        c1 = new Carta("dez","Paus",10);
        inserir(c1);
        c1 = new Carta("valete","Paus",10);
        inserir(c1);
        c1 = new Carta("dama","Paus",10);
        inserir(c1);
        c1 = new Carta("rei","Paus",10);
        inserir(c1);

        //OURO
        c1 = new Carta("as","Ouro",11);
        inserir(c1);
        c1 = new Carta("dois","Ouro",2);
        inserir(c1);
        c1 = new Carta("tres","Ouro",3);
        inserir(c1);
        c1 = new Carta("quatro","Ouro",4);
        inserir(c1);
        c1 = new Carta("cinco","Ouro",5);
        inserir(c1);
        c1 = new Carta("seis","Ouro",6);
        inserir(c1);
        c1 = new Carta("sete","Ouro",7);
        inserir(c1);
        c1 = new Carta("oito","Ouro",8);
        inserir(c1);
        c1 = new Carta("nove","Ouro",9);
        inserir(c1);
        c1 = new Carta("dez","Ouro",10);
        inserir(c1);
        c1 = new Carta("valete","Ouro",10);
        inserir(c1);
        c1 = new Carta("dama","Ouro",10);
        inserir(c1);
        c1 = new Carta("rei","Ouro",10);
        inserir(c1);

        //ESPADAS
        c1 = new Carta("as","Espadas",11);
        inserir(c1);
        c1 = new Carta("dois","Espadas",2);
        inserir(c1);
        c1 = new Carta("tres","Espadas",3);
        inserir(c1);
        c1 = new Carta("quatro","Espadas",4);
        inserir(c1);
        c1 = new Carta("cinco","Espadas",5);
        inserir(c1);
        c1 = new Carta("seis","Espadas",6);
        inserir(c1);
        c1 = new Carta("sete","Espadas",7);
        inserir(c1);
        c1 = new Carta("oito","Espadas",8);
        inserir(c1);
        c1 = new Carta("nove","Espadas",9);
        inserir(c1);
        c1 = new Carta("dez","Espadas",10);
        inserir(c1);
        c1 = new Carta("valete","Espadas",10);
        inserir(c1);
        c1 = new Carta("dama","Espadas",10);
        inserir(c1);
        c1 = new Carta("rei","Espadas",10);
        inserir(c1);

    }

    private void inserir(Carta carta) {
        this.baralho.add(carta);
    }

    public ArrayList<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(ArrayList<Carta> baralho) {
        this.baralho = baralho;
    }
}

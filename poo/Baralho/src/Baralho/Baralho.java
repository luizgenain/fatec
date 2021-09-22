package Baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    public List<Carta> Cartas = new ArrayList<>();
    Carta carta = new Carta();

    public Baralho(){
        montar();
        embaralhar();
        exibir();
    }

    private void montar(){
        for (Naipe n: Naipe.values()) {
            for (Valor v: Valor.values() ) {
                Carta carta = new Carta();
                carta.setNaipe(n);
                carta.setValor(v);
                Cartas.add(carta);
            }
        }
    }

    private void embaralhar(){
         Collections.shuffle(Cartas);
    }

    private void exibir(){
        for (Carta c : Cartas) {
            System.out.println("Carta: " + c.getValor() + " de " + c.getNaipe());
        }
    }

}

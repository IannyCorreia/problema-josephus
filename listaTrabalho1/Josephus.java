package listaTrabalho1;

import java.util.LinkedList;
import java.util.Random;

public class Josephus {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        Random random = new Random();

        for (int i = 1; i <= 20; i++) {
            pessoas.add(new Pessoa("Nome" + i, " Telefone" + i, " CPF" + i, " Endereço" + i));
        }

        int m = random.nextInt(20) + 1; 
        System.out.println("Valor da m-ésima posição: " + m);

        int index = 0;
        while (pessoas.size() > 1) {
            index = (index + m - 1) % pessoas.size();
            System.out.println("Pessoa eliminada: " + pessoas.remove(index));
        }
        System.out.println("Pessoa sobrevivente: " + pessoas.get(0));
    }
}
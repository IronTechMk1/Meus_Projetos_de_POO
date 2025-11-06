package Contato;

import java.util.ArrayList;

public class agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void armazenarContato(Contato contato){
        this.contatos.add(contato);

    }

    public void removerContato(Contato contato){
        this.contatos.remove(contato);

    }

    public int encontrarContato(String nome){
        for(int i = 0; i < contatos.size(); i++){
            if (contatos.get(i).get_nome().equals(nome)){
                return i;
            }
        }return -1;
    }

    public void imprimirContatos(){
        System.out.println("===========ÍNICIO===========");
        for (Contato contato: contatos){// Para cada contato dentro de contatos
            contato.imprimeInformacoes();
            System.out.println("");
        }
        System.out.println("========FIM========");
    }


    public void imprimirContato(int posicao){
        this.contatos.get(posicao).imprimeInformacoes();
    }

}

package Controller;// Parte de Controller.Agenda e suas propriedades !

import java.util.ArrayList;

public class Agenda {
        ArrayList<Contato> contatos;

        public Agenda(){
            contatos = new ArrayList<>();
        }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public ArrayList<Contato> buscarContato(String termo){
            ArrayList<Contato> resultado = new ArrayList<>();
            for (Contato contato : contatos){
                if (contato.getNome().contains(termo) ||
                        contato.getTelefone().contains(termo) ||
                        contato.getEmail().contains(termo)) {
                    resultado.add(contato);
                }

            }
        return resultado;
    }


}

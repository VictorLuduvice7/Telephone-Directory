
//genda e suas propriedades !

package Controller;
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

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato na agenda.");
        } else {
            System.out.println("Contatos na agenda:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

}

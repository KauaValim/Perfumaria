package br.ulbra.dao;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author KauaValim
 */
public class Perfumes {
    ArrayList<String> listaPerfumes;

    public Perfumes() {
        listaPerfumes = new ArrayList<>();
    }

    public void salvar(String elemento) {
        listaPerfumes.add(elemento);
        JOptionPane.showMessageDialog(null,
                "Item salvo com sucesso!");
    }

    public void excluir(int i) {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A lista está vazia");
        } else {
            if ((i - 1) >= 0 && (i - 1) < listaPerfumes.size()) {
                listaPerfumes.remove(i-1);
                JOptionPane.showMessageDialog(null,
                        "Item excluído");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Digite um número válido");
            }
        }
    }

    public void editar(int i, String novo) {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A lista está vazia");
        } else {
            if ((i - 1) >= 0 && (i - 1) < listaPerfumes.size()) {
                listaPerfumes.set((i-1), novo);
                JOptionPane.showMessageDialog(null,
                        "Item alterado");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Digite um número válido");
            }
        }
    }

    public String listar() {
        String res = "";
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A lista está vazia");
        } else {
            for (int i = 0; i < listaPerfumes.size(); i++) {
                res += (i + 1) + " - " + listaPerfumes.get(i)
                        + "\n";
            }
        }
        return res;
    }

    public void ordenarAsc() {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A lista está vazia");
        } else {
            Collections.sort(listaPerfumes, String.CASE_INSENSITIVE_ORDER);
        }
    }

    public void ordenarDesc() {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A lista está vazia");
        } else {
            Collections.sort(listaPerfumes, String.CASE_INSENSITIVE_ORDER);
            Collections.reverse(listaPerfumes);
        }
    }

    public void pesquisar(String nome) {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "A lista está vazia");
        } else {
            if ((listaPerfumes.indexOf(nome)) >= 0) {
                JOptionPane.showMessageDialog(null,"O item: " + listaPerfumes.get(listaPerfumes.indexOf(nome)) + " é o item de código: " + (listaPerfumes.indexOf(nome)+1));
            } else {
                JOptionPane.showMessageDialog(null,
                        "Cadeia de texto não encontrada na lista");
            }
        }
    }
}
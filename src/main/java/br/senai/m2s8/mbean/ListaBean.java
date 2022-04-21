package br.senai.m2s8.mbean;

import br.senai.m2s8.model.ItemDeLista;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Named
@SessionScoped
public class ListaBean implements Serializable {

    private ItemDeLista item = new ItemDeLista();

    private List<ItemDeLista> listaItens = new ArrayList<>();
    private List<ItemDeLista> itensSelecionados = new ArrayList<>();

    public String adicionar() {
        listaItens.add(item);
        item = new ItemDeLista();
        return null;
    }

    public String remover() {
        itensSelecionados.forEach(itemSelecionado -> listaItens.remove(itemSelecionado));
        itensSelecionados = new ArrayList<>();
        return null;
    }

    public List<String> getMedidas() {
        return Arrays.asList("unidades", "quilos", "litros", "garrafas", "pacotes");
    }


    public ItemDeLista getItem() {
        return item;
    }

    public void setItem(ItemDeLista item) {
        this.item = item;
    }

    public List<ItemDeLista> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<ItemDeLista> listaItens) {
        this.listaItens = listaItens;
    }

    public List<ItemDeLista> getItensSelecionados() {
        return itensSelecionados;
    }

    public void setItensSelecionados(List<ItemDeLista> itensSelecionados) {
        this.itensSelecionados = itensSelecionados;
    }
}

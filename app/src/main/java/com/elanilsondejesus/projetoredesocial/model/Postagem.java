package com.elanilsondejesus.projetoredesocial.model;

public class Postagem {
    private String nome;
    private String postagem;
    private int imagem;
    private Boolean itemSelecionado;

    public Postagem() {
    }

    public Postagem(String nome, String postagem, int imagem) {
        this.nome = nome;
        this.postagem = postagem;
        this.imagem = imagem;
    }

    public Boolean getItemSelecionado() {
        return itemSelecionado;
    }

    public void setItemSelecionado(Boolean itemSelecionado) {
        this.itemSelecionado = itemSelecionado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

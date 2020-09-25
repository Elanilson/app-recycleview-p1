package com.elanilsondejesus.projetoredesocial.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.elanilsondejesus.projetoredesocial.R;
import com.elanilsondejesus.projetoredesocial.adapter.PostagemAdapter;
import com.elanilsondejesus.projetoredesocial.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem>postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewPostagem);


        //Configuração Layout
            configuracaoPostagem();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Configuração Adapter

        PostagemAdapter postagemAdapter = new PostagemAdapter(postagens);
        recyclerView.setAdapter(postagemAdapter);
    }

    public void configuracaoPostagem (){

        Postagem postagem = new Postagem("Maria Luiza","#tbt Saudades",R.drawable.imagem1);
        postagens.add(postagem);
        postagem = new Postagem("Juliana ","#tbt Saudades",R.drawable.imagem2);
        postagens.add(postagem);
        postagem = new Postagem("Pedro ","#tbt Saudades",R.drawable.imagem3);
        postagens.add(postagem);
        postagem = new Postagem("Cristiano Araujo","#tbt Saudades",R.drawable.imagem4);
        postagens.add(postagem);
        postagem = new Postagem("Juliana ","#tbt Saudades",R.drawable.imagem2);
        postagens.add(postagem);
        postagem = new Postagem("Pedro ","#tbt Saudades",R.drawable.imagem3);
        postagens.add(postagem);
        postagem = new Postagem("Cristiano Araujo","#tbt Saudades",R.drawable.imagem4);
        postagens.add(postagem); postagem = new Postagem("Pedro ","#tbt Saudades",R.drawable.imagem3);
        postagens.add(postagem);
        postagem = new Postagem("Cristiano Araujo","#tbt Saudades",R.drawable.imagem4);
        postagens.add(postagem);
        postagem = new Postagem("Juliana ","#tbt Saudades",R.drawable.imagem2);
        postagens.add(postagem);
        postagem = new Postagem("Pedro ","#tbt Saudades",R.drawable.imagem3);
        postagens.add(postagem);
        postagem = new Postagem("Cristiano Araujo","#tbt Saudades",R.drawable.imagem4);
        postagens.add(postagem); postagem = new Postagem("Pedro ","#tbt Saudades",R.drawable.imagem3);
        postagens.add(postagem);
        postagem = new Postagem("Cristiano Araujo","#tbt Saudades",R.drawable.imagem4);
        postagens.add(postagem);
        postagem = new Postagem("Juliana ","#tbt Saudades",R.drawable.imagem2);
        postagens.add(postagem);
        postagem = new Postagem("Pedro ","#tbt Saudades",R.drawable.imagem3);
        postagens.add(postagem);
        postagem = new Postagem("Cristiano Araujo","#tbt Saudades",R.drawable.imagem4);
        postagens.add(postagem);

    }
    }


package com.elanilsondejesus.projetoredesocial.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elanilsondejesus.projetoredesocial.R;
import com.elanilsondejesus.projetoredesocial.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {
private List<Postagem>postagens;

    public PostagemAdapter(List<Postagem> postagens) {
        this.postagens = postagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listaDeItens = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhes,parent,false);
        return new MyViewHolder(listaDeItens);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Postagem postagem = postagens.get(position);
        holder.nome.setText(postagem.getNome());
        holder.postagem.setText(postagem.getPostagem());
        holder.imagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public  class  MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView postagem;
        private ImageView imagem, imagemselecionada;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.txtnome);
            postagem = itemView.findViewById(R.id.txtpostagem);
            imagem = itemView.findViewById(R.id.imageViewFoto);
        }
        void teste (final Postagem postagem){

        }
    }
}

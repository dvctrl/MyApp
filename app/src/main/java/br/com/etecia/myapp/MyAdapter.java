package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContexto;
    private List<Jogadoras> lstJogadoras;

    public MyAdapter(Context mContexto, List<Jogadoras> lstJogadoras) {
        this.mContexto = mContexto;
        this.lstJogadoras = lstJogadoras;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idTitulojogadora;
        ImageView idImagemjogadora;
        CardView idCardJogadora;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTitulojogadora = itemView.findViewById(R.id.idTitulojogadora);
            idImagemjogadora = itemView.findViewById(R.id.idImagemjogadora);
            idCardJogadora = itemView.findViewById(R.id.idCardjogadora);
        }
    }

}

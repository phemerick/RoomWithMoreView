package com.example.roomwithview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private MainActivity.RecyclerViewItemClicklistener recyclerViewItemClicklistener;
   // public int position=0;
    private final LayoutInflater mInflater;
    private List<Word> mWords; // Cached copy of words


    class WordViewHolder extends RecyclerView.ViewHolder {
        private final TextView wordItemView;
        private final TextView titleItemView;
        private final TextView numItemView;

        private WordViewHolder(View itemView) {
            super(itemView);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {

                    // AQUI AQUI AQUI AQUI
                    //Toast.makeText(this, "Action", Toast.LENGTH_SHORT).show();

                    return false;
                }
            });
            wordItemView = itemView.findViewById(R.id.text_content);
            titleItemView = itemView.findViewById(R.id.text_titulo);
            numItemView = itemView.findViewById(R.id.text_num);
        }
    }


    WordListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        if (mWords != null) {
            Word current = mWords.get(position);
            holder.wordItemView.setText(current.getWord());
            holder.titleItemView.setText(current.getTitle());
            holder.numItemView.setText(current.getNum());

        } else {
            // Covers the case of data not being ready yet.
            holder.wordItemView.setText("No Word");
        }
    }

    void setWords(List<Word> words){
        mWords = words;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (mWords != null)
            return mWords.size();
        else return 0;
    }

    public void setRecyclerViewItemClicklistener(MainActivity.RecyclerViewItemClicklistener recyclerViewItemClicklistener){
        this.recyclerViewItemClicklistener=recyclerViewItemClicklistener;
    }


}
package com.jnu.myfirstapplication.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.myfirstapplication.R;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.LinearViewHoder> {
    private List<Book> bookList;

    public BookListAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }//构造函数

    private Context mContext;
    public BookListAdapter(Context context){
        this.mContext=context;
    }
    @Override
    public BookListAdapter.LinearViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return new LinearViewHoder(LayoutInflater.from(mContext).inflate(R.layout.layout_booklist_item,parent,false));
        View itemview=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_booklist_item,parent,false);
        LinearViewHoder linearViewHoder=new LinearViewHoder(itemview);
        return linearViewHoder;
}

    @Override
    public void onBindViewHolder(@NonNull BookListAdapter.LinearViewHoder holder, int position) {
        //holder.textView.setText("成了!");
        Book book=bookList.get(position);
        holder.textView.setText(book.getTitle());
        holder.head.setImageResource(book.getHeadId());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
//    class LinearViewHoder extends RecyclerView.ViewHolder{
//        private TextView textView;
//        public LinearViewHoder(@NonNull View itemView) {
//            super(itemView);
//            textView=itemView.findViewById(R.id.text_view_book_title);
//        }
//    }
    class LinearViewHoder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView head;
        public LinearViewHoder(@NonNull View itemView) {
            super(itemView);
            this.textView=itemView.findViewById(R.id.text_view_book_title);
            this.head=itemView.findViewById(R.id.image_view_book_cover);
    }
}


}

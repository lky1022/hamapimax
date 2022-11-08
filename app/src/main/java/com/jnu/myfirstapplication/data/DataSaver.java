package com.jnu.myfirstapplication.data;

import android.content.Context;

import androidx.annotation.NonNull;

import com.jnu.myfirstapplication.recyclerview.Book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class DataSaver {
    public void save(Context context,ArrayList<Book>data){
        try{
            FileOutputStream dataStream=context.openFileOutput("mydata.dat",Context.MODE_PRIVATE);
            ObjectOutputStream out=new ObjectOutputStream(dataStream);
            out.writeObject(dataStream);
            out.close();
            dataStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @NonNull
    public ArrayList<Book> Load(Context context){
        ArrayList<Book>data=null;
        try{
            FileInputStream filein=context.openFileInput("mydata.dat");
            ObjectInput in=new ObjectInputStream(filein);
            data=(ArrayList<Book>)in.readObject();
            in.close();
            filein.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}

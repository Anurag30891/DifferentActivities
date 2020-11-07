package android.example.differentactivities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        //2nd arguyment is not going to be used because it is used when we ar epopualting single textView
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get object located at this position in list
        Word currentWord = getItem(position);

        //find textview in list_item.xml layout with ID version name
        TextView trasnlatedTv = listItemView.findViewById(R.id.translated_tv);
        trasnlatedTv.setText(currentWord.getTranslation());

        TextView defaultTv = listItemView.findViewById(R.id.default_tv);
        defaultTv.setText(currentWord.getDefaultTranslation());

        ImageView iconView =  listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()){
            iconView.setImageResource(currentWord.getmImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

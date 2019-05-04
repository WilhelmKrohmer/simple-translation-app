package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * This app displays miwok words and their translation.
 *
 * The app derives from the android basics course at udacity:
 * https://eu.udacity.com/course/android-basics-nanodegree-by-google--nd803
 *
 * See the original here: https://github.com/udacity/ud839_Miwok
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.words_list_item, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.list_item_image);
        assert currentWord != null;
        imageView.setImageResource(currentWord.getResourceImageId());

        TextView defaultWordTextView = listItemView.findViewById(R.id.default_word);
        defaultWordTextView.setText(currentWord.getDefaultTranslation());

        // First find the correct view out of the resources
        TextView miwokWordTextView = listItemView.findViewById(R.id.miwok_word);
        // Next set the text by finding the text from currentWord and using the method defined in the word class
        miwokWordTextView.setText(currentWord.getMiwokTranslation());

        return listItemView;
    }
}

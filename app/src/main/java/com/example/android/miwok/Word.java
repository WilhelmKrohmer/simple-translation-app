package com.example.android.miwok;

/**
 * This app displays miwok words and their translation.
 *
 * The app derives from the android basics course at udacity:
 * https://eu.udacity.com/course/android-basics-nanodegree-by-google--nd803
 *
 * See the original here: https://github.com/udacity/ud839_Miwok
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }
    public int getResourceImageId () { return mImageResourceId; }
}

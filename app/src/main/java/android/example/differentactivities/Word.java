package android.example.differentactivities;

public class Word {

    private String defaultTranslation;
    private String translation;
    private int mImageResourceId = -1;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String translation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.translation = translation;
        this.mImageResourceId = imageResourceId;
    }

    public Word(String defaultTranslation, String translation, int mImageResourceId, int mAudioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.translation = translation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getTranslation() {
        return translation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;//that means there will be a valid image
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}

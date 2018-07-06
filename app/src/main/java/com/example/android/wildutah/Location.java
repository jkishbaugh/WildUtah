package com.example.android.wildutah;

public class Location {
    //constant to determine if there is no image
    private final int NO_INFO_PROVIDED = -1;

    //Image resource id variable
    private int mImageResourceId = NO_INFO_PROVIDED;

    //trail name variable
    private String mTrailName;
    //description variable
    private String mTrailDescription;
    //Distance variable
    private String mTrailDistance;
    //address storage variable
    private String mTrailAddress;
    //store difficulty rating
    private String mDifficulty;
    //store fee information
    private String mFee;
    //store number of campsites
    private String mNumberCampSites;


    //Hiking and Backpacking Object
    public Location(int imageResourceId, String trailName, String trailDescription, String trailDistance,
                    String trailAddress, String difficulty){
      mImageResourceId =  imageResourceId;
      mTrailName = trailName;
      mTrailDescription = trailDescription;
      mTrailDistance = trailDistance;
      mTrailAddress = trailAddress;
      mDifficulty= difficulty;
    }
    //Campsite Object
    public Location(String trailName, String trailDescription, String fee, String numberCampSites){
        mTrailName = trailName;
        mTrailDescription = trailDescription;
        mFee = fee;
        mNumberCampSites = numberCampSites;
    }
    //Drives Object
    public Location(int imageResourceId, String trailName, String trailDescription, String trailDistance){
        mImageResourceId =  imageResourceId;
        mTrailName = trailName;
        mTrailDescription = trailDescription;
        mTrailDistance = trailDistance;

    }

    //National Park Object
    public Location(int imageResourceId, String trailName, String trailDescription){
        mImageResourceId =imageResourceId;
        mTrailName = trailName;
        mTrailDescription = trailDescription;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public String getTrailName(){
        return mTrailName;
    }

    public String getTrailDescription(){
        return mTrailDescription;
    }

    public String getTrailDistance(){
        return mTrailDistance;
    }

    public String getTrailAddress(){
        return mTrailAddress;
    }

    public String getFee(){return mFee; }

    public String getmNumberCampSites(){return mNumberCampSites; }

    public boolean hasImage(){
        return mImageResourceId != NO_INFO_PROVIDED;
    }

    public String getDifficulty(){
        return mDifficulty;
    }

    public boolean hasDifficulty(){ return mDifficulty != null; }

    public boolean hasDistance(){return  mTrailDistance != null; }

    public boolean hasFee(){return mFee != null;}

    public boolean hasCampsites(){return mNumberCampSites != null;
    }

}

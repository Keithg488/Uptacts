package com.example.keith_000.uptacts;

import android.graphics.Bitmap;

/**
 * Created by keith_000 on 2/21/2015.
 */
public class PhoneBook {

    private Bitmap mAvatar;
    private String mName;
    private String mPhone;
    private String mEmail;

    public Bitmap getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(Bitmap mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public PhoneBook(Bitmap mAvatar, String mName, String mPhone, String mEmail) {
        this.mAvatar = mAvatar;
        this.mName = mName;
        this.mPhone = mPhone;
        this.mEmail = mEmail;


    }

}

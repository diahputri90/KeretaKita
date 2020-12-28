package com.diahl.keretakita.model;

public class HistoryModel {

    private String mIdBook;
    private String mTanggal;
    private String mWaktu;
    private String mRiwayat;
    private String mTotal;
    private int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public HistoryModel(String idBook, String tanggal, String waktu, String riwayat, String total, int imageResourceId) {
        mIdBook = idBook;
        mTanggal = tanggal;
        mWaktu = waktu;
        mRiwayat = riwayat;
        mTotal = total;
        mImageResourceId = imageResourceId;

    }

    public String getIdBook() {
        return mIdBook;
    }


    public String getTanggal() {
        return mTanggal;
    }

    public String getWaktu() {
        return mWaktu;
    }

    public String getRiwayat() {
        return mRiwayat;
    }


    public String getTotal() {
        return mTotal;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

}

package com.londonappbrewery.destini;

import android.graphics.pdf.PdfDocument;

public class CYOA{
    private int mStoryid;
    private int mPageNo;
    private int mOption1PageNo;
    private int mOption2PageNo;
    private int mOption1id;
    private int mOption2id;

    public  CYOA(int Storyid, int Option1id, int Option2id, int PageNo, int Option1PageNo, int Option2PageNo){
        mStoryid = Storyid;
        mPageNo = PageNo;
        mOption1PageNo = Option1PageNo;
        mOption2PageNo = Option2PageNo;
        mOption1id = Option1id;
        mOption2id = Option2id;

    }

    public CYOA(int Storyid,int Option1id, int Option2id, int PageNo){
        mStoryid = Storyid;
        mPageNo = PageNo;
        mOption1id = Option1id;
        mOption2id = Option2id;
        mOption1PageNo = 0;
        mOption2PageNo = 0;

    }

    public int getStoryid() {
        return mStoryid;
    }

    public void setStoryid(int storyid) {
        mStoryid = storyid;
    }

    public int getPageNo() {
        return mPageNo;
    }

    public void setPageNo(int pageNo) {
        mPageNo = pageNo;
    }

    public int getOption1PageNo() {
        return mOption1PageNo;
    }

    public void setOption1PageNo(int option1PageNo) {
        mOption1PageNo = option1PageNo;
    }

    public int getOption2PageNo() {
        return mOption2PageNo;
    }

    public void setOption2PageNo(int option2PageNo) {
        mOption2PageNo = option2PageNo;
    }

    public int getOption1id() {
        return mOption1id;
    }

    public void setOption1id(int option1id) {
        mOption1id = option1id;
    }

    public int getOption2id() {
        return mOption2id;
    }

    public void setOption2id(int option2id) {
        mOption2id = option2id;
    }
}

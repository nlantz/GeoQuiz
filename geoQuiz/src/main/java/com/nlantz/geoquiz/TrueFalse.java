package com.nlantz.geoquiz;

/**
 * Created by nick on 3/29/14.
 */


public class TrueFalse {

    private boolean mTrueQuestion;
    private int mQuestion;


    public TrueFalse(int question, boolean TrueQuestion){
        mQuestion = question;
        mTrueQuestion = TrueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }



}

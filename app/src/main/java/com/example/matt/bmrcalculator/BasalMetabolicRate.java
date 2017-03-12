package com.example.matt.bmrcalculator;

/**
 * Created by Matt on 2017-03-11.
 */

public class BasalMetabolicRate {
    private int mGender;
    private int mHeightInCentimeters;
    private int mAge;
    private int mWeightInKilograms;
    private double mBmr;
    public static final int MALE = 0;
    private static final int FEMALE = 1;

    public BasalMetabolicRate(int gender, int height, int age, int weight){
        mGender = gender;
        mAge = age;
        mHeightInCentimeters = height;
        mWeightInKilograms = weight;
        calculateBasalMetabolicRate();
    }

    private double calculateBasalMetabolicRate(){
        switch (mGender){
            case MALE:
                mBmr = 66.5 + (13.75 * mWeightInKilograms) + (5.003 * mHeightInCentimeters) - (6.755 * mAge);
                break;
            case FEMALE:
                mBmr = 655.1 + (9.563 * mWeightInKilograms) + (1.850 * mHeightInCentimeters) - (4.676 * mAge);
                break;
        }
        return mBmr;
    }

    public String getGender(){
        String gender = new String();
        switch (mGender){
            case MALE:
                gender = "Male";
                break;
            case FEMALE:
                gender = "Female";
                break;
        }
        return gender;
    }

    public int getHeight(){
        return mHeightInCentimeters;
    }

    public int getAge(){
        return mAge;
    }

    public int getWeight(){
        return mWeightInKilograms;
    }

    public double getBmr(){
        return mBmr;
    }
}


package com.company;
/**
 * Created by davidstone on 6/27/16.
 */
public class Stoplight {
    String mLightColor;

    public Stoplight (String lightColor) {  // constructor
        mLightColor = lightColor;
    }

    public boolean isRed () {
        if (mLightColor.equals("red")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isYellow () {
        if (mLightColor.equals("red")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGreen () {
        if (mLightColor.equals("red")) {
            return true;
        } else {
            return false;
        }
    }

    public void setLightColor(String lightColor) {     //setter
        mLightColor = lightColor;
    }

        public static void main(String[] args) {
            // write your code here

            Stoplight red = new Stoplight("red");

        }

}

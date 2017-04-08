/**
 * Created by rajkumarpurushothaman on 4/8/17.
 */
public class Main {

    public static void main(String[] args){

        // integer has a width of 32; hence int's width is 2^32

        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647; // _ is a java 8 feature

        int myTotal = (myMinValue/2);

        System.out.println("myTotal : "+myTotal);
        // byte has a width of 8; hence int's width is 2^8

        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        byte myNewByteValue = (byte)(myMaxByteValue/2);

        System.out.println("myNewByteValue : "+myNewByteValue);

        // short has a width of 16; hence int's width is 2^16

        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        short myNewShortValue = (short)(myMaxShortValue/2);

        System.out.println("myNewShortValue : " + myNewShortValue);

        // long has a width of 64; hence int's width is 2^64

        long myMinLongValue = -9_223_372_036_854_775_808L; // the suffix can be small 'l' or capital 'L'
        long myMaxLongValue = 9_223_372_036_854_775_807L;


        long calculatedValue = (long) (50000 + (10* (myNewByteValue + myMaxShortValue +myTotal)));

        System.out.println(calculatedValue);
    }
}

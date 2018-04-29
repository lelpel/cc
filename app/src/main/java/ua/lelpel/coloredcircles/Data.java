package ua.lelpel.coloredcircles;

import android.support.annotation.ColorRes;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author bruce
 * @date 22.04.2018
 */
class Data {
    static List<Integer> getRandNumbers() {
        Random rand = new Random();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            numbers.add(1 + rand.nextInt(98));
        }

        return numbers;
    }

    @ColorRes
    static int getRandColor() {
        Random rand = new Random();
        int col = 1 + rand.nextInt(7);
        switch (col) {
            case 1:
                return R.color.circleColor1;
            case 2:
                return R.color.circleColor2;
            case 3:
                return R.color.circleColor3;
            case 4:
                return R.color.circleColor4;
            case 5:
                return R.color.circleColor5;
            case 6:
                return R.color.circleColor6;
            case 7:
                return R.color.circleColor7;
            case 8:
                return R.color.circleColor8;
            default:
                return R.color.colorAccent;
        }
    }
}

package com.data.lessons;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FrogJump {

    public static void main(String[] args) {
        calculateJumps(BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(2));
    }

    private static int calculateJumps(BigDecimal currentPosition, BigDecimal desiredPosition, BigDecimal jumpSize) {

        if (desiredPosition.compareTo(currentPosition) < 0) {
            System.out.println("The frog jumped 0 times");
            return 0;
        }

        BigDecimal jumpsWithoutConsideringActualPosition = desiredPosition.divide(jumpSize, 2, RoundingMode.HALF_UP);
        BigDecimal jumpsFromCurrentPosition = currentPosition.divide(jumpSize, 2, RoundingMode.HALF_UP);
        BigDecimal jumps = jumpsWithoutConsideringActualPosition.subtract(jumpsFromCurrentPosition).setScale(0, RoundingMode.UP);

        System.out.println("The frog jumped " + jumps.intValue() + " times");
        return jumps.intValue();
    }

}

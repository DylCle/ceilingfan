package org.main.fan;
import org.main.datecomparison.DateComparisonUtils;

import java.time.LocalDate;

public class CeilingFan implements Fan {
    private int speed;
    private String direction = "Normal";
    private boolean reversed;
    private static final int MAX_SPEED = 3;

    @Override
    public void pullSpeedCord() {
        if(checkAndHandleChristmas())
            return;
        if (speed == MAX_SPEED) {
            this.speed = 0;
            System.out.println("Fan has been turned off");
        } else {
            this.speed++;
            System.out.println("Fan speed set to " + this.speed);
        }
    }

    @Override
    public void pullReverseCord() {
        if(checkAndHandleChristmas())
                return;
        this.reversed = !this.reversed;
        if (this.reversed) {
            this.direction = "Reversed";
        } else {
            this.direction = "Normal";
        }
        System.out.println("Fan Direction is " + getDirection());
    }

    @Override
    public String getDirection() {
        return this.direction;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    private boolean checkAndHandleChristmas(){
        if(DateComparisonUtils.isDateRestricted(LocalDate.now())){
            this.speed = 0;
            System.out.println("Fan has been turned off for Christmas");
            return true;
        }
        return false;
    }
}

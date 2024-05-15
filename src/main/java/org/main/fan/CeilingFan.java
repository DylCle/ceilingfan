package org.main.fan;
import org.main.datecomparison.DateComparisonUtils;
import java.time.LocalDate;

public class CeilingFan implements Fan {
    private static final int MAX_SPEED = 3;
    private int speed;
    private Direction direction;
    private boolean reversed;
    public CeilingFan() {
        this.speed = 0;
        this.direction = Direction.CLOCKWISE;
    }
    private boolean checkAndHandleChristmas(){
        if(DateComparisonUtils.isDateRestricted(LocalDate.now())){
            setSpeed(0);
            System.out.println("Fan has been turned off for Christmas");
            return true;
        }
        return false;
    }
    @Override
    public void pullSpeedCord() {
        if(checkAndHandleChristmas())
            return;
        if (speed == MAX_SPEED) {
            setSpeed(0);
            System.out.println("Fan has been turned off");
        } else {
            setSpeed(speed + 1);
            System.out.println("Fan speed set to " + getSpeed());
        }
    }
    @Override
    public void pullReverseCord() {
        if(checkAndHandleChristmas())
            return;
        this.reversed = !this.reversed;
        if (this.reversed) {
            setDirection(Direction.COUNTERCLOCKWISE);
        } else {
            setDirection(Direction.CLOCKWISE);
        }
        System.out.println("Fan Direction is " + getDirection());
    }
    @Override
    public Direction getDirection() {
        return this.direction;
    }
    @Override
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }
}

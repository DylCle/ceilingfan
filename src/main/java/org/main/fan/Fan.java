package org.main.fan;

public interface Fan {
    void pullSpeedCord();
    void pullReverseCord();
    Direction getDirection();
    void setDirection(Direction direction);
    void setSpeed(int speed);
    int getSpeed();
    enum Direction {
        CLOCKWISE,
        COUNTERCLOCKWISE
    }
}

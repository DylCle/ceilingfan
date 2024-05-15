package org.main.datecomparison;
import java.time.LocalDate;

public class DateComparisonUtils  {
    public static boolean isDateRestricted(LocalDate date){
        DateCheck christmasCheck = new ChristmasCheck();
        return christmasCheck.isDateRestricted(date);
    }
}

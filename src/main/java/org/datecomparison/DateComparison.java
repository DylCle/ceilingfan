package org.datecomparison;
import java.time.LocalDate;
import java.time.MonthDay;

public class DateComparison implements Date {
    private static final MonthDay CHRISTMAS = MonthDay.of(12, 25);
    @Override
    public boolean isTodayChristmas() {
        LocalDate todayDate = LocalDate.now();
        MonthDay todayMonthDay = MonthDay.from(todayDate);
        return todayMonthDay.equals(CHRISTMAS);
    }
}

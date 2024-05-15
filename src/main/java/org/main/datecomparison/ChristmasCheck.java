package org.main.datecomparison;
import java.time.LocalDate;
import java.time.MonthDay;

public class ChristmasCheck implements DateCheck {
    private static final MonthDay CHRISTMAS = MonthDay.of(12, 25);
    @Override
    public boolean isDateRestricted(LocalDate date) {
        return MonthDay.from(date).equals(CHRISTMAS);
    }
}

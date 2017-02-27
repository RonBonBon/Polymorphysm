package com.arichafamily.java;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by hackeru on 23/02/2017.
 */
public class DateTimeUtils {

    public static long getDifferenceInYears(LocalDateTime from, LocalDateTime to){
        return from.until(to, ChronoUnit.YEARS);
    }

    public static long howManyYearsFromNow(LocalDateTime date){
        return getDifferenceInYears(date, LocalDateTime.now());
    }

}

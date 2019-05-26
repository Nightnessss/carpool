package com.fehead.carpool.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @author Nightnessss 2019/5/26 17:05
 */
public class TimeUtil {

    public static String timestampToString(Timestamp timestamp) {
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return myFmt.format(timestamp);
    }
}

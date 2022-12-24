package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DifferenceTime {

    public static int days(String date1, String date2) {
        long difference_In_Days = 0;
        try {

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date date3 = df.parse(date1);
            Date date4 = df.parse(date2);
            long difference_In_Time = date4.getTime() - date3.getTime();
            difference_In_Days = TimeUnit.MILLISECONDS
                    .toDays(difference_In_Time);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return (int) difference_In_Days;
    }

    public static void main(String[] args) {

        // System.out.println(days(date3, date4));
    }
}
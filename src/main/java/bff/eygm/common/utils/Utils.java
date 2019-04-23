package bff.eygm.common.utils;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.http.HttpHeaders;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

/**
 * @author Nimesha on 10/10/2018 10:13 AM
 */
public class Utils {
    private static HttpHeaders applicationJsonHeader;
    private static final SimpleDateFormat dateFull = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat dateId = new SimpleDateFormat("yyyyMMdd");

    public String generatedUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public String getFullDate() {
        dateFull.setTimeZone(TimeZone.getTimeZone("Asia/Colombo"));
        return dateFull.format(new Date());
    }

    public int getDateId() {
        dateId.setTimeZone(TimeZone.getTimeZone("Asia/Colombo"));
        return Integer.parseInt(dateId.format(new Date()));
    }

    public String getUtcTime() {
        dateFull.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFull.format(new Date());
    }

    public boolean isValidEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }

    public int calculateAge(LocalDate date, LocalDate currentDate) {
        if ((date != null) && (currentDate != null)) {
            return Period.between(date, currentDate).getYears();
        } else {
            return 0;
        }
    }

    public static HttpHeaders getApplicationJsonHeader() {
        if (applicationJsonHeader == null) {
            applicationJsonHeader = new HttpHeaders();
            applicationJsonHeader.add("Content-Type", "application/json");
        }
        return applicationJsonHeader;
    }
}

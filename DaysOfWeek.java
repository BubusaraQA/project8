package module8;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class DaysOfWeek {

    public static final Logger logger = LogManager.getLogger(DaysOfWeek.class);
    String result;

    public String getDay(Integer dayNumber) {

        ArrayList<String> daysList = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        if (dayNumber == null) {
            throw new NullPointerException("The value is null");
//            result = "The number should not be null";
//            logger.error(result);
        } else if (dayNumber < 1) {
            result = "The number should be equal or larger than 1";
            logger.info(result);
        } else if (dayNumber > 7) {
            result = "The number should be equal or smaller than 7";
            logger.info(result);
        } else {
            result = daysList.get(dayNumber-1);
            logger.info("The result is: " + result);
        }

        return result;
    }

    }


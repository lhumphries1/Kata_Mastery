package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        return 0;
    }

    protected int convertTime(int inputTime) {
        if (inputTime <= 23 && inputTime >= 17) {
            return inputTime - 17;
        } else {
            return inputTime + 7;
        }
    }


    protected int calculateHoursFromStartShiftToBedTime(int startingHour, int endingHour, int bedtime) {
//        startingHour = convertTime(startingHour);
//        endingHour = convertTime(endingHour);
//        bedtime = convertTime(bedtime);
        if (endingHour < bedtime) {
            return endingHour - startingHour;
        } else {
            int workedHours = bedtime - startingHour;
            if (workedHours < 0) {
                return 0;
            } else {
                return workedHours;
            }
        }
    }

    protected boolean isEndShiftAfterMidnight(Integer endingHour) {
        if (endingHour.toString().length() == 1) {
            return true;
        } else {
            return false;
        }

    }

}

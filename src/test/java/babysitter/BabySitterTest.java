package babysitter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BabySitterTest {

    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 18, 20);
        assertThat(wage).isEqualTo(12);
    }

    @Test
    public void canConvertTimeBeforeMidnight() {
        WageCalculator underTest = new WageCalculator();
        int actualResult = underTest.convertTime(20);
        assertThat(actualResult).isEqualTo(3);

        actualResult = underTest.convertTime(0);
        assertThat(actualResult).isEqualTo(7);
    }

    @Test
    public void canConvertTimeAfterMidnight() {
        WageCalculator underTest = new WageCalculator();
        int actualResult = underTest.convertTime(2);
        assertThat(actualResult).isEqualTo(9);
    }

    @Test
    public void canCalculateHoursFromStartShiftToBedTime() {
        WageCalculator underTest = new WageCalculator();
        int actualHours = underTest.calculateHoursFromStartShiftToBedTime(18, 2, 20);
        assertThat(actualHours).isEqualTo(2);

        actualHours = underTest.calculateHoursFromStartShiftToBedTime(21, 2, 20);
        assertThat(actualHours).isEqualTo(0);

        actualHours = underTest.calculateHoursFromStartShiftToBedTime(17, 19, 20);
        assertThat(actualHours).isEqualTo(0);
    }
}

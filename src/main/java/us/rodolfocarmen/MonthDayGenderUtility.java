package us.rodolfocarmen;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MonthDayGenderUtility {
    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {
        try {
            LocalDate birthDate = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw new InvalidBirthdayException(year, month, day);
        }

        if (genderCode != CODE_MALE && genderCode != CODE_FEMALE) {
            throw new UnknownGenderCodeException(genderCode);
        }
        if (genderCode == CODE_MALE) {
            return ((month - 1) * 40) + day + CODE_MALE;
        } else return ((month - 1) * 40) + day + CODE_FEMALE;
    }
}
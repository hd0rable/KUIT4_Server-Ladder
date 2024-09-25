package ladder;

import ladder.exception.ExceptionMessage;

public class GreaterThanOne {

    private final int number;

    private GreaterThanOne(int number) {
        validate(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static GreaterThanOne from(int number) {
        return new GreaterThanOne(number);
    }

    private void validate(int number) {
        if (!isGreaterThanOne(number)) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LADDER_NUMBER.getMessage());
        }
    }

    private static boolean isGreaterThanOne(int number) {
        return number > 1;
    }
}

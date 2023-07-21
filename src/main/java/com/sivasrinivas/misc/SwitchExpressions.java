package com.sivasrinivas.misc;


import static com.sivasrinivas.misc.SwitchExpressions.DAY.FRIDAY;

// Article on Java switch expressions - https://www.happycoders.eu/java/switch-expression/

public class SwitchExpressions {
    public static void main(String[] args) {
        // Standard
        var day = FRIDAY;
        int numLetters;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = (int) Math.pow(2, 3);
                break;
            case WEDNESDAY:
                int three = 1 + 2;
                numLetters = three * three;
                break;
            default:
                throw new IllegalStateException("Unknown day: " + day);
        }
        System.out.println(numLetters);

        // Java 14, with arrow
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> numLetters = 6;
            case TUESDAY -> numLetters = 7;
            case THURSDAY, SATURDAY -> numLetters = (int) Math.pow(2, 3);
            case WEDNESDAY -> {
                int three = 1 + 2;
                numLetters = three * three; }
            default -> throw new IllegalStateException("Unknown day: " + day);
        }
        System.out.println(numLetters);

        // Java 14, with yield
        numLetters = switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                yield 6;
            case TUESDAY:
                yield 7;
            case THURSDAY:
            case SATURDAY:
                yield  (int) Math.pow(2, 3);
            case WEDNESDAY:
                int three = 1 + 2;
                yield three * three;
            default:
                throw new IllegalStateException("Unknown day: " + day);
        };
        System.out.println(numLetters);

        // Java 14, yield and arrow
        numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> (int) Math.pow(2,3);
            case WEDNESDAY -> {
                int three = 1+2;
                yield three*three;
            }
            default -> throw new IllegalStateException("Unknown day: " + day);
        };
        System.out.println(numLetters);
    }

    enum DAY {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}

package Unit2_OOP.Enums;

public class Main {
    public static void main(String[] args) {
        whichSeason(Month.MARCH);
        whichSeason(Month.FEBRUARY);
        whichSeason(Month.JULY);
        whichSeason(Month.OCTOBER);
        whichSeason(Month.APRIL);
        whichSeason(Month.SEPTEMBER);
    }

    public static void whichSeason(Month month) {
        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY:
                System.out.printf("%s is in the winter season.\n", month);
                break;
            case MARCH, APRIL, MAY:
                System.out.printf("%s is in the spring season.\n", month);
                break;
            case JUNE, JULY, AUGUST:
                System.out.printf("%s is in the summer season.\n", month);
                break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
                System.out.printf("%s is in the fall season.\n", month);
                break;




        }

    }
}

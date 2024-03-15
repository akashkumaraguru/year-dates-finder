import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = inp.nextInt();
        System.out.print("Enter a Month : ");
        int month = inp.nextInt();
        if (year % 4 == 0) {
            System.out.println("it's a leap year");
            if (month > 12) {
                System.out.println("Error");
            } else if (month <= 0) {
                System.out.println("Error");
            }
            switch (month) {
                case 1:
                    System.out.println(" Total days in January are 31");
                    break;
                case 2:
                    System.out.println(" Total days in February are 29");
                    break;
                case 3:
                    System.out.println("Total days in March are 31");
                    break;
                case 4:
                    System.out.println("Total days in April are 30");
                    break;
                case 5:
                    System.out.println("Total days in Mayare 31");
                    break;
                case 6:
                    System.out.println("Total days in June are 30");
                    break;
                case 7:
                    System.out.println("Total days in July are 31");
                    break;
                case 8:
                    System.out.println("Total days in August are 31");
                    break;
                case 9:
                    System.out.println("Total days in September are 30");
                    break;
                case 10:
                    System.out.println("Total days in October are 31");
                    break;
                case 11:
                    System.out.println("Total days in November are 30");
                    break;
                case 12:
                    System.out.println("Total days in December are 31");
                    break;

            }

        } else {
            System.out.println("it's not a leap year");
            if (month > 12) {
                System.out.println("Error");
            } else if (month <= 0) {
                System.out.println("Error");
            }
            switch (month) {
                case 1:
                    System.out.println("Total days in January are 31");
                    break;
                case 2:
                    System.out.println("Total days in February are 28");
                    break;
                case 3:
                    System.out.println("Total days in March are 31");
                    break;
                case 4:
                    System.out.println("Total days in April are 30");
                    break;
                case 5:
                    System.out.println("Total days in May are31");
                    break;
                case 6:
                    System.out.println("Total days in June are 30");
                    break;
                case 7:
                    System.out.println("Total days in July are 31");
                    break;
                case 8:
                    System.out.println("Total days in August are 31");
                    break;
                case 9:
                    System.out.println("Total days in September are 30");
                    break;
                case 10:
                    System.out.println("Total days in October are 31");
                    break;
                case 11:
                    System.out.println("Total days in November are 30");
                    break;
                case 12:
                    System.out.println("Total days in December are 31");
                    break;

            }
        }

    }
}
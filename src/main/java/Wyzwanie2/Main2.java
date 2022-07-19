package Wyzwanie2;

import java.util.Scanner;

public class Main2 {
    /*
      input String as two time and receive difference between them.
      EXAMPLE:
      input
      9:00am-10:00am
      output
      60
       */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj czas w 12 godzinnej formacie (h)h:mm-(h)h:mm, użyj odpowiednio am i pm");
        System.out.println("Przykład: 9:00am-10:00am");
        String time = input.nextLine();

        System.out.println(returnMinutes(time));
    }

    public static int returnMinutes(String time) {
        String[] data = time.split("-");
        String firstTime = data[0];
        String secondTime = data[1];
        int timeDifference = timePart(secondTime) + partDay(secondTime) - timePart(firstTime) + partDay(firstTime);
        if (timeDifference < 0) {
            timeDifference = timeDifference + 24 * 60;
        }
        return timeDifference;
    }

    private static int timePart(String time) {
        String newTime = time.substring(0, time.length() - 2);
        String[] data = newTime.split(":");
        int hours = Integer.parseInt(data[0]);
        int minutes = Integer.parseInt(data[1]);
        return hours * 60 + minutes;
    }

    private static int partDay(String time) {
        String am = "am";
        String pm = "pm";
        int afterNoon = 12 * 60;
        int beforeNoon = 0;

        String dayPart = time.substring(time.length() - 2);
        if (dayPart.equals(am)) {
            return beforeNoon;
        } else if (dayPart.equals(pm)) {
            return afterNoon;
        }
        return -1;
    }
}

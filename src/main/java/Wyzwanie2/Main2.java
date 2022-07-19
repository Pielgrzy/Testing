package Wyzwanie2;

public class Main2 {
    /*
      input String as two time and receive difference between them.
      EXAMPLE:
      input
      11:30am-12:30pm
      output
      01:00
       */
    public static void main(String[] args) {
        /*        ---PO TESTACH AKTYWOWAĆ---
        Scanner input = new Scanner(System.in);
        System.out.println("podaj czas w 12 godzinnej formacie (h)h:mm-(h)h:mm, użyj odpowiednio am i pm");
        String time = input.nextLine();
        */


        String time = "1:23am-1:08am";
        //-----TESTY-----
        String time1 = "9:00am-10:00pm";
        String time2 = "10:00pm-11:00am";
        //-----TESTY-----

        returnMinutes(time);
        returnMinutes(time1);
        returnMinutes(time2);
    }

    public static int returnMinutes(String time) {
        String[] data = time.split("-");
        String firstTime = data[0];
        String secondTime = data[1];
        System.out.println("Rozwiązanie");
        int timeDifference = timePart(firstTime) + partDay(firstTime) - timePart(secondTime) + partDay(secondTime);
        if (timeDifference > 0) {
            timeDifference = timeDifference - 24 * 60 * -1;
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

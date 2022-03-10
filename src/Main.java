import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 10:30 to 14:55
        String input = scanner.nextLine();
        int pointerIndex = input.indexOf("to");
        System.out.println(pointerIndex);
        System.out.println(input.charAt(6));

        String start = input.substring(0, pointerIndex).trim();
        String end = input.substring(pointerIndex + 2).trim();

        int totalTime = calcMinutes(end) - calcMinutes(start);
        System.out.println(totalTime);
    }

    public static int calcMinutes(String time) {
        int pointerIndex = time.indexOf(':');
        String hour = time.substring(0, pointerIndex);
        String minute = time.substring(pointerIndex + 1);
        return Integer.parseInt(hour)*60 + Integer.parseInt(minute);
    }
}


public class SpringSeason {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please provide exactly two integer values for month and day.");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean isSpringSeason = (m > 3 || (m == 3 && d >= 20)) && (m < 6 || (m == 6 && d <= 20));

        System.out.println(isSpringSeason);
    }
}

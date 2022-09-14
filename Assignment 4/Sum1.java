public class Sum1 {
    public static void main(String[] args) {
        // Variables
        int sum = 0;

        // Loop Checking
        if (args.length == 0)
            System.out.println("No arguments");
        else {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum);
        }
    }
}

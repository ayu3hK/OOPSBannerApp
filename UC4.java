public class UC4 {
    public static void main(String[] args) {

        // Construct banner lines and store in array
        String[] banner = {
            " *****   *****   *****   ***** ",
            "**   ** **   ** **   ** **     ",
            "**   ** **   ** **   ** **     ",
            "**   ** **   ** *****   *****  ",
            "**   ** **   ** **           **",
            "**   ** **   ** **     **    **",
            " *****   *****   **      ***** "
        };

        // Loop through array and print each line
        for (String line : banner) {
            System.out.println(line);
        }

        // Program exits automatically after main ends
    }
}
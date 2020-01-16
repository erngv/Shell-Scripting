package comp290;

import java.util.Scanner;

public class Jrep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
       // When run with zero arguments, print usage       
        if (args.length == 0) {   
            System.out.println("Usage: jrep [PATTERN]");
            System.exit(1);
        }        

        // When run with --help argument, print usage
        if (args[0].equals("--help")) {
            System.out.println("Usage: jrep [PATTERN]");
            System.exit(1); 
        }
 
        // When run with single argument, use that argument as search term
        while (scan.hasNextLine()) {
            // Continue reading line by line
            String argToRead = scan.nextLine();

            // If line contains search term, print to standard output
            if (argToRead.contains(args[0])) {
                System.out.println(argToRead);
            }
        }
        scan.close();
        System.exit(0);
    }
}


import java.text.BreakIterator;

public class Homework6 {
    public static void main(String[] args) {
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        //   double studentScore = 400;
        //   double maxScore = 700;
        //   String Grade = "";
        //   if (studentScore >= 91 && studentScore <= 100){
        //       System.out.println("Grade: A");
        //   } else if (studentScore >= 81 && studentScore <= 90){
        //       System.out.println("Grade: B");
        //   } else if (studentScore >= 71 && studentScore <= 80){
        //        System.out.println("Grade: C");
        //    } else if (studentScore >= 61 && studentScore <= 70){
        //       System.out.println("Grade: D");
        //  } else if (studentScore >= 51 && studentScore <= 60){
        //      System.out.println("Grade: E");
        //   } else if (studentScore <= 50) {
        //      System.out.println("Grade: F");
        //  }else{
        //      System.out.println();
        //  }
        // calculate percentage
        // Your percentage: XX.yy and your Grade is: Z

        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */

        // int number;
        // String= "";
        //if (number/3: ){
        //     System.out.println("divisible by 3");
        // } else if (number/5){
        //     System.out.println("divisible by 5");
        // } else if (number/3 && number/5){
        //     System.out.println("divisible by both");
        // }else{
        //      System.out.println(number);
        // }
/**
 * Checking car gear (P, D, N, R)           // switch
 * if car gear is P, display "you can park the car"
 * if car gear is D,
 *      if drive type is Snow, display "You are on Snow mode"
 *      if drive type is Sport, display "You are on Sport mode"
 *      if drive type is Eco, display "You are on Eco mode"
 * if car gear is N, display "put car in car wash"
 * if car gear is R, display  "revere the car"
 */
        char carGear = 'D';
        String driveType = "Snow";
        switch (carGear) {
            case 'P':
                System.out.println("you can park the car");
                break;
            case 'D':
                System.out.println("you can drive the car");
                break;
                case "Snow":
                    System.out.println("You are on Snow mode");
                    break;
                case "Sport":
                    System.out.println("You are on Sport mode");
                    break;
                case "Eco":
                    System.out.println("You are on Eco mode");
                    break;
                case 'N':
                System.out.println("Put car in carwash");
                break;
                case 'R':
                System.out.println("Reverse the car");
                break;
        }

    }
}


import java.util.Scanner;  

class q6 {  
    public static void main(String args[]) {  
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter your exam score:");  // Prompt the user to enter their exam score
        int score = scan.nextInt();  
        
        char grade; 

        // Use a switch statement to determine the grade based on the score
        switch (score / 10) {
            case 10:  // Fall through to case 9 for scores 100
            case 9:
                grade = 'A';
                System.out.println(grade+" - Excellent");
                break;
            case 8:
                grade = 'B';
                System.out.println(grade+" - Very Good");
                break;
            case 7:
                grade = 'C';
                System.out.println(grade+" - Good");
                break;
            case 6:
                grade = 'D';
                System.out.println(grade+" - Satisfactory");
                break;
            default:
                if (score >= 0 && score < 60) { 
                    grade = 'F';
                    System.out.println(grade+" - Fail");
                } else {
                    System.out.println("Invalid score");  // Handle invalid score inputs
                }
                break;
        }
    }
}

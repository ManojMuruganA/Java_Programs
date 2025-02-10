class q7 {
    public static void main(String args[]){
        // Outer loop to handle the number of rows
        for(int i = 1; i <= 5; i++){
            // Inner loop to handle the number of columns
            for(int j = 1; j <= i; j++){
                // Print star without newline
                System.out.print("*");
            }
            // Print newline character after each row
            System.out.print("\n");
        }
    }
}


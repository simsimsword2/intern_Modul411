package star;

public class StarGen {

    // user enters the size of the diamond
    //  the program draws a diamond of that size into the console
    public void diamond(int size){

        // first half of the diamond
        for(int i = size; i > 0; i--){
            drawLine(i, size);
        }

        // second half of the diamond
        // first half of the diamond
        for(int i = 0; i <= size; i++){
            drawLine(i, size);
        }

    }

    // position of the star is given and the program draws the necessary line
    //  boolean is needed to mark the endpoints (only one star)
    private void drawLine(int position, int size){

        int cursor = 0;

        // spaces
        while(cursor < position){
            System.out.print(" ");

            cursor++;
        }

        System.out.print("*");

        // if not at an endpoint we need two stars
        if(position != size){

            // get the number of spaces between the two stars
            int difference = size - position;
            position += 1 + 2 * (difference - 1);

            // spaces
            while(cursor < position){
                System.out.print(" ");

                cursor++;
            }

            System.out.print("*");
        }

        System.out.print("\n");
    }
}

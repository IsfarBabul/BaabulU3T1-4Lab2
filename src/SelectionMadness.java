public class SelectionMadness {


// no instance variables //


    public SelectionMadness() {
    }


    /* Returns 1 of 5 randomly generated fortunes as a string;
    you should write your own 5 fortunes! (see output for examples)
    */
    public String fortune() {
        int randomInt = (int) (Math.random() * 5);
        if (randomInt == 0) {
            return "You will become a famous internet meme through a song you create in the future.";
        }
        if (randomInt == 1) {
            return "You will get a 5 in AP Chemistry in your dream and then wake up to 65 on your Chemistry regents.";
        }
        if (randomInt == 2) {
            return "You will burn 1 calorie in the future.";
        }
        if (randomInt == 3) {
            return "You will be transported into an alternate timeline where the twin towers is taken over by Mr.Beast and is called the Beast Towers.";
        }
        return "You will die and resurrect into the last thing you thought of when you died.";
    }


    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else if (num2 != num3) {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
        return num1;
    }

    /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
   */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int largestSide = largest(side1, side2, side3);
        if (largestSide == side1) {
            return Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2);
        } else if (largestSide == side2) {
            return Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2);
        } else {
            return Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2);
        }
    }
}

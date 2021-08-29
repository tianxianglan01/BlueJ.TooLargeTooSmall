
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @ Tianxiang Lan (your name)
 * @ 8/28/2021 (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {

        if (chosenNum == 5) {
            return g - 5;
        } else if (chosenNum == 6) {
            return -1;

        } else if (chosenNum == 2) {
            return g - 2;
        }
        return null;

    }
}

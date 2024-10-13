public class TriangleSolver {

    public int numAngles = 0;
    private int numSides = 0;
    private double angleA;
    private double angleB;
    private double angleC;
    private double sideA;
    private double sideB;
    private double sideC;
    private final String initalTriangle = "         c\r\n" + //
                "         ‸ \r\n" + //
                "        / \\\r\n" + //
                "       /   \\\r\n" + //
                "    A /     \\ B\r\n" + //
                "     /       \\\r\n" + //
                "    /         \\\r\n" + //
                "  b ‾‾‾‾‾‾‾‾‾‾‾ a\r\n" + //
                "         C\n";

    /**
     * Reads input from user and initializes "numAngles" and "numSides" variables (error checks till correct bounds)
     */
    public void setTriangle()
    {
        while((numAngles + numSides) < 3)
        {
            numSides = UtilityBelt.readInt("How many sides do you know in your triangle? ", 1, 3);
            numAngles = UtilityBelt.readInt("How many angles do you know in your triangle? ", 0, 3);
            if((numAngles + numSides) < 3)
            {
                System.out.println("Not enough information available to parse rest of triangle, please find more information!");
            }
        }
    }

    /**
     * Reads input from user and initializes "sides" and "angles" variables (error checks till correct bounds and count)
     */
    public void setSidesAndAngles()
    {
        System.out.println("\n" + initalTriangle);
        System.out.println("Write down what corresponds to the triangle\n");
        System.out.println("Sides first please!");
        while(!(sidesCountCheck()))
        {
            sideA = UtilityBelt.readDouble("A: ", 0, 9999);
            sideB = UtilityBelt.readDouble("B: ", 0 , 9999);
            sideC = UtilityBelt.readDouble("C: ", 0 , 9999);
            if (!sidesCountCheck())
            {
                System.out.println("That doesn't match what you told me earlier, try again liar!");
            }
        }
        System.out.println("Sides done, now angles (radians) please!");
        while(!(anglesCountCheck()))
        {
            angleA = UtilityBelt.readDouble("a: ", 0, 9999);
            angleB = UtilityBelt.readDouble("b: ", 0 , 9999);
            angleC = UtilityBelt.readDouble("c: ", 0 , 9999);
            if (!anglesCountCheck())
            {
                System.out.println("That doesn't match what you told me earlier, try again liar!");
            }
        }
        System.out.println("Perfect! Now your triangle is properly initialized.\n");
    }

    /**
     * Checks if the user input the right amount of sides
     * 
     * @return returns true if the amount of sides given matches what was told in intialization, returns false other wise
     */
    public boolean sidesCountCheck()
    {
        int countedSides = 0;
        if (sideA > 0)
        {
            countedSides++;
        }
        if (sideB > 0)
        {
            countedSides++;
        }
        if (sideC > 0)
        {
            countedSides++;
        }
        return countedSides == numSides;
    }

    /**
     * Checks if the user input the right amount of angles
     * 
     * @return returns true if the amount of angles given matches what was told in intialization, returns false other wise
     */
    public boolean anglesCountCheck()
    {
        int countedAngles = 0;
        if (angleA > 0)
        {
            countedAngles++;
        }
        if (angleB > 0)
        {
            countedAngles++;
        }
        if (angleC > 0)
        {
            countedAngles++;
        }
        return countedAngles == numAngles;
    }


}

/**
 * Linearly searches for an assigned target value to a given array.
 * Considered the slowest search
 */
public class LinearSearch implements Practice03Search {

    /**
     * Linearly searches for a target in a given array
     * @param myArray the given array
     * @param target the value to look for
     * @return the index where the target value is; or -1, if array does
     * not have target value
     */
    public int search(int[] myArray, int target)
    {
        for (int i = 0; i < myArray.length; i ++)
        {
            if (myArray[i] == target) // if current value matches target
            {
                return i;
            }
        }
        return -1; // if target not found

    }

    /**
     * Tells user the type of search
     * @return the type of search (linear, in this case)
     */
    public String searchName()
    {
        return "Linear Search";
    }
}

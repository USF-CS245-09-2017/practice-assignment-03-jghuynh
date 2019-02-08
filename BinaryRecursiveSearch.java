/**
 * Binary-recursively searches for a target value in the given array
 */
public class BinaryRecursiveSearch implements Practice03Search {

    /**
     * Sends information to another search() function that can better
     * search for the target in a given array
     * @param myArray the array to be searched
     * @param target the value to search for in the array
     * @return the index...eventually.
     */
    public int search(int[] myArray, int target)
    {
        return search(myArray, target, 0, myArray.length - 1);
    }

    /**
     * Binarily recursively searches for the target value in a given array
     * @param myArray the array to be searched
     * @param target the value to search for
     * @param start the start index
     * @param end the end index
     * @return the index where the target value is in the array; returns -1 if not found
     */
    private int search(int[] myArray, int target, int start, int end) {
        int mid = (start + end)/2;
        if (start >= end)
        {
            if (myArray[mid] == target) // if current position has our target
            {
                return mid;
            }
            else if (myArray[mid] < target) // if current position is too small, go right
            {
                return search(myArray, target, mid + 1, end);
            }
            else if (myArray[mid] > target) // if current position is too big, go left
            {
                return search(myArray, target, start, mid - 1);
            }

        }
        // even after the search, if target is not found
        return -1;
    }

    /**
     * Informs the user the type of search
     * @return the type of search (binary recursive, in this case)
     */
    public String searchName()
    {
        return "Binary Recursive Search";
    }
}

/**
 * Binary-iteratively searches for a target value in a given array
 */
public class BinaryIterativeSearch implements Practice03Search {

    /**
     * Searches for the target value in a given array...but first it sends it to
     * another search() function that can more efficiently search for the target value
     * @param myArray the given array
     * @param target the value to search for
     * @return the index where the target value is... eventually ;
     * returns -1 if the given array does not have the target value
     */
    public int search(int[] myArray, int target)
    {
        return search(myArray, target, 0, myArray.length - 1);
    }


    /**
     * Searches for the target value in a given array...but first it sends it to
     * another search() function that can more efficiently search for the target value
     * @param myArray the given array
     * @param target the value to search for
     * @return the index where the target value is;
     * returns -1 if the given array does not have the target value
     */
    private int search(int[] myArray, int target, int start, int end) {

        while (start <= end) // so we don't start to cross-over, cross the middle line
        {
            int mid = (start + end) / 2; // change the definition of mid each time
            if (myArray[mid] == target) // if the current "mid" is the target!
            {
                return mid;
            }
            else if (myArray[mid] < target) // if current index is too small, go right
            {
                start = mid + 1;
            } else if (myArray[mid] > target) // if current index is too big, go left
            {
                end = mid - 1;
            }
        }
        return -1; // myArray does not have target value
    }
    /**
     * Tells user the type of search
     * @return the type of search (binary iterative, in this case)
     */
    public String searchName()
    {
        return "Binary Iterative Search";
    }
}


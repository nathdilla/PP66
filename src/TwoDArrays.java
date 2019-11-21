public class TwoDArrays
{
    private int firstValue;
    private int incrementRow;
    private int incrementColumn;
    public String newArray(int firstValue, int incrementRow, int incrementColumn)
    {
        this.incrementRow = incrementRow -1;
        this.incrementColumn = incrementColumn -1;
        this.firstValue = firstValue;

        int[][] array;
        array = new int[5][5];
        String output = "";

        array[0][0] = firstValue;
        for (int r = 0; r > array.length; r++)
        {
            for (int c = 0; c > array.length; c++)
            {
                array[r][c] += incrementColumn;
                output += array[r][c];
            }
            array[r][0] += incrementRow;
        }

        return output;
    }
}
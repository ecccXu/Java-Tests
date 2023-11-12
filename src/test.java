class LowHighSwap
{
    static void doIt( int[] z )
    {
        int temp = z[z.length-1];
        z[z.length-1] = z[0];
        z[0] = temp;
    }
}

class TestIt
{
    public static void main( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        LowHighSwap.doIt(myArray);
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }
    }
}
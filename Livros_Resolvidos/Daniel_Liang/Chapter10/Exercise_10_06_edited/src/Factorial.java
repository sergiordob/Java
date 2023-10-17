public class Factorial {

    private int number;
    private int[] array;
    public Factorial(){
        this.number = 8;
        array = new int[number];
        returnArray();
    }
    public int[] returnArray(){
        int factorial = 1;
        int index = 0;

        for (int i = 8; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                factorial *= j;
            }
            array[index] = factorial;
            index++;
            factorial = 1;
        }
        return array;
    }
}

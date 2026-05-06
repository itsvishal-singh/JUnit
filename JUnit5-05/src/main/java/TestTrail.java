import java.util.Arrays;

public class TestTrail {
    public double computeSquareArea(double length)
    {
        return length*length;
    }
    public double computeCircleArea(double radius)
    {
        return 3.14*radius*radius;
    }
    public int[] sortingArray(int[] array){
        Arrays.sort(array);
        return array;
    }
    public int[] sortingArr(int[] arr){
        for(int i = 0; i < 100000; i++){
            Arrays.sort(arr);
        }
        return arr;
    }
}

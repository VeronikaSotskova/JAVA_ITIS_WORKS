/**
 * Created by Notebook on 05.03.2017.
 */
public class Program {
    public static void main(String[] args) {
        int array[] = {2, 5, -10, 1, -100, -9};
        System.out.println("Максимальное элемент в массиве = " + max(array));
    }

    public static int max(int array[]) {
        int m = array[0];
        for(int i = 0; i < array.length; i++) {
            if(m < array[i]) {
                m = array[i];
            }
        }
        return m;
    }
}

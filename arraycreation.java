public class arraycreation{
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
        marks[4] = 5;

        for(int loop:marks){
            System.out.print(" "+loop);

        }
        System.out.println();
        for(int array:marks){
             System.out.println(array);
        }
    }
}
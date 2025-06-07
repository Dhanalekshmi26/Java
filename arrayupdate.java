public class arrayupdate {
    public static void main(String[] args) {
        int []myarray = {2,6,8,9,10,3};
        System.out.println("original mark in 1st position: "+myarray[0]);
        myarray[0] = 20;
        System.out.println("updated mark in 1st position: "+myarray[0]);
        for(int i=0;i<myarray.length;i++){
            System.out.println("position "+i+ ": " +myarray[i]);
        }
    }
}

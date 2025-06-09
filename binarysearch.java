public class binarysearch {
    public static void main(String[] args) {
        int []numarray = {1,2,3,4,5};
        int target = 4;
        int mid;
        boolean found = false;
        int low = 0;
        int high = numarray.length-1;
        while(low<high){
            mid = (low+high) /2;
        
        if(numarray[mid]==target){
            System.out.println("Element found at index: "+mid);
            found = true;
            break;
        }
        else if (numarray[mid]<target) {
            low = mid+1;
        }
        else{
            high = mid-1;
        }}
        if(!found){
            System.out.println("Element is not found");
        }
    }
    }


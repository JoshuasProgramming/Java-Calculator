import java.util.Random;
public class BadMax
{
    // a random generator
    Random rg;
    
    public int[] randomArray(int length) {

        assert length>=1; // do not give me negative numbers or 0
        
        int res[] = new int[length];
        for (int i=0; i<length;i++) {
            res[i]=rg.nextInt(2*length)+1;
        }
        return res;
    }
    
    /**
     * Constructor for objects of class BadMax
     */
    public BadMax()
    {
        rg=new Random();
    }

    
    public int max(int arr[]) {
        int res=badmax(arr,arr.length-1);
        return res;
    }
    
    public int badmax(int arr[], int lastpos) {
        if (lastpos==0) return arr[0];
        if (arr[lastpos]>badmax(arr,lastpos-1)) {
            return arr[lastpos];
        } else {
            return badmax(arr,lastpos-1);
        }
    }
    
}
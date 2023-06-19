package Projects;

public class insertion {

    public static void sort(int[] val) {
        for(int i = 1; i<val.length; i++){
            int j = i;
            while (val[j-1]>= val[j] && j>0) {
                int temp = val[j-1];
                val[j-1] = val[i];
                val[i] = temp;
                j--;
                System.out.println(val[j-1]);
            }
        }
       
    }

    public static void main(String[] args) {
        int val[] =  {1,7,2,5,6,4};
        sort(val);
    }
}
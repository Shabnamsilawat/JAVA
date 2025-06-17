public class Ar13 {
    public static void main(String args[]){
        int [] CopyFrom = new int [] {1,2,3,4,5};
        int [] CopyInto = new int [CopyFrom.length];
        System.arraycopy(CopyFrom, 0, CopyInto, 0, CopyFrom.length);
        for(int i = 0 ; i<CopyInto.length; i++){
            System.out.println(CopyInto[i]);
        }
    }
    
}

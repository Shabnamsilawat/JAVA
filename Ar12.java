public class Ar12 {
    public static void main(String args[]){
      int [][] arr = new int [3][3];
      arr [0] [0] =0;
      arr [0] [1] = 1;
      arr [0] [2]= 2;
      arr [1] [0] = 3;
      arr [1] [1] = 4;
      arr [1] [2] = 5;
      arr [2] [0] = 6;
      arr [2] [1] = 7;
      arr [2] [2] = 8;
      for(int i = 0; i<arr.length;i++){
        for(int j = 0; j<arr[0].length; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
    
}

public class day10 {
    public static void main(String[] args) {
        int[][] arr1={{3,5,6},{2,7,4},{6,8,7}};
        int[][] arr2={{2,2,1},{4,1,5},{2,1,0}};
        int[][] arr3=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }
    }
}

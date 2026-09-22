public class habijabi {
    public static void main(String[] args){
        int [][] a =
        {
            {1},
            {2,3},
            {3, 4, 5}
        };
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.print("");
//            }
//        }

        int ans =  sumof_2D_Array(a);
        System.out.println(ans);



    }

    public static int sumof_2D_Array(int a[][]){
        int sum = 0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                sum += a[i][j];
            }
        }
        return sum;
    }
}

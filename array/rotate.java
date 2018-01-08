package array;

public class rotate {
	public void rotate90(int[][] mat)
	{
		int length=mat.length-1;
		int j=0;
		while(j<mat.length/2)
		{
			for(int i=j; i < length-j; i++){
                int temp = mat[j][i];
                mat[j][i] = mat[length-i][j];
                mat[length-i][j] = mat[length-j][length-i];
                mat[length-j][length-i] = mat[i][length-j];
                mat[i][length-j] = temp;
            }
            j++;
        }
    }
	public static void main(String[] args)
	{
		rotate r=new rotate();
		int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		r.rotate90(mat);
		for(int i=0; i < mat.length; i++){
            for(int j=0; j < mat.length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
	}
}

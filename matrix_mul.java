import java.io.*;
class matrix_mul{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no of rows for first matrix");
		int n1=Integer.parseInt(br.readLine());
		System.out.println("enter the no of columns for first matrix");
		int m1=Integer.parseInt(br.readLine());
		int a[][]=new int[n1][m1];
		for(int i=0;i<n1;i++){
			for(int j=0;j<m1;j++){
				System.out.println("a["+i+"]"+"["+j+"]= ");
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}

		System.out.println("enter the no of rows for the second matrix");
		int n2=Integer.parseInt(br.readLine());
		System.out.println("enter the no of columns for second matrix");
		int m2=Integer.parseInt(br.readLine());
		int b[][]=new int[n2][m2];
		for(int i=0;i<n2;i++){
			for(int j=0;j<m2;j++){
				System.out.println("a["+i+"]"+"["+j+"]= ");
				b[i][j]=Integer.parseInt(br.readLine());
			}
		}

		if(m1!=n2)
			System.out.println("matrix multiplication is not possible");
		//matrix multiplication
		int mul[][]=new int[n1][m2];
		for(int i=0;i<n1;i++){
			for(int j=0;j<m2;j++){
				int sum=0;
				for(int k=0;k<m1;k++){
					sum=sum+a[i][k]*b[k][j];
				}
				mul[i][j]=sum;
			}
		}
		
		System.out.println("first matrix:");
		for(int i=0;i<n1;i++){
			for(int j=0;j<m1;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}	
		System.out.println("second matrix:");
		for(int i=0;i<n2;i++){
			for(int j=0;j<m2;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("multiplied matrix:");
		for(int i=0;i<n1;i++){
			for(int j=0;j<m2;j++){
				System.out.print(mul[i][j]+"\t");
			}
			System.out.println("");
		}	

	}
}

import java.io.*;
class binary{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of elements in an array: ");
		int n=Integer.parseInt(br.readLine());
		float a[]=new float[100];
		System.out.println("enter the elements one by one in an ascending order");
		for(int i=0;i<n;i++){
			System.out.println("a["+i+"] = ");
			a[i]=Float.parseFloat(br.readLine());
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1])
				{
					float temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		float s_a[]=new float[100];
		for(int i=0;i<n;i++)
			s_a[i]=a[i];

		for(int i=0;i<n;i++)
		{
			System.out.println(s_a[i]);
		}
		System.out.println("enter the key element to be searched in an array: ");
		Float key=Float.parseFloat(br.readLine());
		//binary search
		int high=n,low=0,pos=0,mid=0,flag=0;
		while(low<=high){
			mid=(high+low)/2;
			if (s_a[mid]==key){
				flag=1;
				pos=mid;
				break;
			}
			else if(s_a[mid]>key){
				high=mid-1;
			}
			else if(s_a[mid]<key){
				low=mid+1;
			}
		}
		if (flag==1)
			System.out.println("the key element is found in : "+pos);
		else
			System.out.println("the key element is not found: ");

	}
}
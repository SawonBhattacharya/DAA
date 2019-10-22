import java.io.*;

class sort
{
	float a[]=new float [20];
	int n;
	sort(float array[],int size)
	{
		n = size;
		for(int i=0;i<n;i++)
		{
			a[i] = array[i];
		}
	}
	public void quick_sort(float a[],int low,int high)
	{
		
	if(low<high){
		int p_index=partition(a,low,high);
		quick_sort(a,low,p_index-1);
		quick_sort(a,p_index+1,high);
		}
	}
	public int partition(float a[],int low,int high)
	{
		float pivot=a[high];
		int p_index=low;
		for(int i=low;i<=high-1;i++){
			if(a[i]<=pivot){
				float temp=a[i];
				a[i]=a[p_index];
				a[p_index]=temp;
				p_index++;
			}
		}
		float temp1=a[p_index];
		a[p_index]=a[high];
		a[high]=temp1;
		return p_index;
	}
}

class quickf {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter the number of values: ");
		int n = Integer.parseInt(br.readLine());
		float a[] = new float[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("a[ "+i+" ]= ");
			a[i] = Float.parseFloat(br.readLine());
		}
		System.out.println("Unsorted list: ");
		System.out.println("Value \t Index");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t"+(i+1));
		}
		sort obj = new sort(a,n);
		int l=0,h=n-1;
		obj.quick_sort(a,l,h);
		System.out.println("Sorted list:");
		System.out.println("Value \t Index");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t"+(i+1));
		}
	}

}

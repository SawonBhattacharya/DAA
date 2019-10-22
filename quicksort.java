import java.io.*;

class sort
{
	int a[]=new int [20];
	int n;
	sort(int array[],int size)
	{
		n = size;
		for(int i=0;i<n;i++)
		{
			a[i] = array[i];
		}
	}
	public void quick_sort(int a[],int low,int high)
	{
		
	if(low<high){
		int p_index=partition(a,low,high);
		quick_sort(a,low,p_index-1);
		quick_sort(a,p_index+1,high);
		}
	}
	public int partition(int a[],int low,int high)
	{
		int pivot=a[high];
		int p_index=low;
		for(int i=low;i<=high-1;i++){
			if(a[i]<=pivot){
				int temp=a[i];
				a[i]=a[p_index];
				a[p_index]=temp;
				p_index++;
			}
		}
		int temp1=a[p_index];
		a[p_index]=a[high];
		a[high]=temp1;
		return p_index;
	}
}

class quicksort {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter the number of values: ");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("a[ "+i+" ]= ");
			a[i] = Integer.parseInt(br.readLine());
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

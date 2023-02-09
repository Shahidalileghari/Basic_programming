package programming.com;



public class DynamicArray {
    private int []array;
    private int count;
    private int size;
    
    // constructor
    
    public DynamicArray() {
		array=new int[1];
		count=0;
		size=1;
		
	}
    public void add(int data)
    {
    	if(count==size)
    	{
    		growSize();
    	}
    	array[count]=data;
    	count++;
    }
    
    public void growSize() {
    	
    	int temp[]=null;
    	if(count==size)
    	{
    		temp=new int[size*2];
    		{
    			for(int i=0;i<size;i++)
    			{
    				temp[i]=array[i];
    			}
    		}
    	}
    	array=temp;
    	
    	size=size*2;
    }
    
    public void shrinsize()
    {
    	int temp[]=null;
    	if(count>0)
    	{
    		temp=new int[count];
    		for(int i=0;i<count;i++)
    		{
    			temp[i]=array[i];
    			
    		}
    		size=count;
    		array=temp;
    	}
    }
    
    public void addAt(int index, int data)
    {
    	if(count==size)
    	{
    		growSize();
    	}
    	for(int i=count-1 ; i>=index;i--)
    	{
    		array[i+1]=array[i];
    		
    		
    	}
    	array[index]=data;
    	count++;
    }
    public void remove()
    {
    	if(count>0)
    	{
    		array[count-1]=0;
    				count--;
    	}
    }
    
    public void removeAt(int index)
    {
    	for(int i=index;i<count-1;i++)
    	{
    		array[i]=array[i+i];
    		
    		
    	}
    	array[count-1]=0;
    	count--;
    	
    }
    
	public static void main(String[] args) {
      
		
		DynamicArray da=new DynamicArray();
		
		da.add(52);
		da.add(12);
		da.add(76);
		da.add(72);
		da.add(13);
		da.add(62);
		da.add(16);
		da.add(342);
		da.add(56);
		
		System.out.println("Elements of an array");
		{
		for(int i=0;i<da.size;i++)
		{
			System.out.print(da.array[i]+" ");
		}
		}
		System.out.println();
		
		System.out.println("Size of an array   :"+da.size);
		System.out.println("Element of an array:"+da.count);
		
		System.out.println("Shrinking size of an array");
		
		da.shrinsize();
		{
			for(int i=0;i<da.size;i++)
			{
				System.out.print(da.array[i]+" ");
			}
			}
        System.out.println();
		
		System.out.println("Size of an array   :"+da.size);
		System.out.println("Element of an array:"+da.count);
		
		System.out.println();
		
		System.out.println("After adding new array");
		da.addAt(2, 4567);
		
		{
			for(int i=0;i<da.size;i++)
			{
				System.out.print(da.array[i]+" ");
			}
			}
        System.out.println();
		
		System.out.println("Size of an array   :"+da.size);
		System.out.println("Element of an array:"+da.count);
		
		da.remove();
		
		System.out.println("Elements of an array after removing ");
		
		{
			for(int i=0;i<da.size;i++)
			{
				System.out.print(da.array[i]+" ");
			}
			}
        System.out.println();
		
		System.out.println("Size of an array   :"+da.size);
		System.out.println("Element of an array:"+da.count);
		
		
		da.removeAt(3);
		
		System.out.println("Element after removing ");
		
		{
			for(int i=0;i<da.size;i++)
			{
				System.out.print(da.array[i]+" ");
			}
			}
        System.out.println();
		
		System.out.println("Size of an array   :"+da.size);
		System.out.println("Element of an array:"+da.count);
		
	}

}

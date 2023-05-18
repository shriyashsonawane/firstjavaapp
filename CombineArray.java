package combiningArrays;

public class CombineArray 
{
	
	    private int[] array1;
	    private int[] array2;
	    private int[] CombineArray;

	    public CombineArray(int[] array1, int[] array2) {
	        this.array1 = array1;
	        this.array2 = array2;
	        this.CombineArray = new int[array1.length + array2.length];
	        CombineArray();
	    }

	    private void CombineArray() 
	    {
	        int j = 0;  
	       for(int i=0;i<array1.length;i++, j++)
	       	{
	    	   CombineArray[j]=array1[i];
	       	}
	       for(int i=0;i<array2.length;i++,j++)
	       {
	    	   CombineArray[j]=array2[i];
	       }
	    }	    

	    public int[] getCombinedArray() {
	        return CombineArray;
	    }
	}



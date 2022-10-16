package ControlFlowStatement;

public class MultiDArray {

	public static void main(String[] args) 
	{
		Object array[][]= {{"mann@gmail.com","test@123"},{"aaru@gmail.com","test@234"},{"viru@gmail.com","test@345"},{"daksh@gmail.com","test@456"}};
		System.out.println("Length of row is:" +array.length);
		System.out.println("Length of column is:" +array[0].length);
		
		for(int r=0;r<array.length;r++)
		{
		for(int c=0;c<array[r].length;c++)
			{
				System.out.print(array[r][c]+"   "+"\t");
			}
			System.out.println();
		}

	}

}

class grade
{
	public static void main(String args[])
	{
		int marks;
		marks=Integer.parseInt(args[0]);
		if(marks>=60)
		{
			System.out.println("A grade");
		}
		if(marks<60 && marks>=50)
		{
			System.out.println("B grade");
		}
		if(marks<50 && marks>=40)
		{
			System.out.println("C grade");
		}
		if(marks<40 && marks>=35)
		{
			System.out.println("D grade");
		}
		if(marks<35 && marks>=30)
		{
			System.out.println("E grade");
		}
		if(marks<30)
		{
			System.out.println("F grade");
		}
	}
}

		
		
		
		
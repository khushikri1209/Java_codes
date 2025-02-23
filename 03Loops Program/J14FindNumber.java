class J14FindNumber
{
	public static void main(String[] args)
	{
		int i, sum=0;
		System.out.println("Numbers between 100 and 200, divisible by 9 : \n");
		for(i=101;i<200;i++)
		{
			if(i%9==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
        System.out.println("/n sum is "+ sum);
	}
}


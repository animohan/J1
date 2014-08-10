class Example2{
	public static void main(String args[]){
		System.out.println("Hello World2");
		
		//simple outputting the numbers
		int num=100;
		System.out.println("Number is " +num);
		
		//if control structure
		if(num>10)
			System.out.println("Number is >10");
		else
			System.out.println("Number is <10");
		
		
		//the for loop
		System.out.println("5 numbers are: ");
		for(int i=0;i<5;i++){
			System.out.println(+i);
		}
		
		//simple character demo
		char ch1, ch2;
		ch1=88;
		ch2='Y';
		System.out.println("ch1 and ch2 are: ");
		System.out.println(ch1 + " "+ch2);
		
		//type conversions
		int a=128;
		System.out.println("Integer a is: "+a);
		byte b;
		b=(byte) a;
		System.out.println("Typecasted a is: "+b);
		
		
		//declaring arrays
		int month_days[];
		month_days=new int[12];
		month_days[0]=31;
		month_days[1]=28;
		System.out.println("# days in 2nd month:"+month_days[1]);
		
		String month_names[]={"Jan","Feb","Mar"};
		System.out.println("First Month is: "+month_names[0]);
		
		//multidimensional array
		int twoD[][]=new int[4][5];
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				twoD[i][j]=i*j;
			}
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(" ");
				System.out.print(twoD[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}
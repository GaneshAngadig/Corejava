class Food
{
		public static void main(String []a)
	{
		break_fast();
		
		break_fast("idly");

		float result=Food.break_fast(0.0f);
		System.out.println(result);
		
		break_fast("idly",34.99f);
		
		break_fast("having idly",39.99f," sexy tasty");
		
		float total=Food.break_fast("having idly ", 39.99f , 2);
		System.out.println( total );
		
		int noOfpeoples=Food.breakfast("having idly", 39.99f, 2, 4);
		System.out.println( noOfpeoples );
	
	}


		static void break_fast()
		{
			System.out.println("having break fast");
		}


		static void break_fast(String name)
		{
			System.out.println("having  "+ name);
		}

		
		static float break_fast(float price)
		{
			price=39.99f;
			return price;
		}	


		static void break_fast(String name,float price)
		{
			System.out.println(name + price);	
		}


		static void break_fast(String name,float price,String taste)
		{
			System.out.println( name + " price=" + price + taste + "" );
		}


		static float break_fast(String name,float price,int quantity)
		{
			System.out.println(name + price + quantity);
			return price;
		}
		
		static float break_fast(String name,float price,int quantity,int noOfpeoples)
		{
		System.out.println(name + price + quantity + noOfpeoples);
		}		



}























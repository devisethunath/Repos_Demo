import java.util.Arrays;

public class Array_usingobject_sing_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int movieno[]    =     { 1,2,3,4,5,6,7,8};

		String Mov_name[]= { " Harry Potter and the Philosopher's Stone      ",
				" Harry Potter and the Chamber of Secrets       ",
				" Harry Potter and the Prisoner of Azkaban      ",
				" Harry Potter and the Goblet of Fire           ",
				" Harry Potter and the Order of the Phoenix     ",
				" Harry Potter and the Half-Blood Prince        ",
				" Harry Potter and the Deathly Hallows – Part 1 ",
		" Harry Potter and the Deathly Hallows – Part 2 "};

		int mov_year[]= {2001,2002,2004,2005,2007,2009,2010,2011};

		int index=Arrays.binarySearch(Mov_name," Harry Potter and the Goblet of Fire           ");
		System.out.println(index);

		for(int i=0; i<movieno.length;i++)
		{
			System.out.print(movieno[i]);
			System.out.print(Mov_name[i]);
			System.out.print( mov_year[i]);


			System.out.println();




		}

		/*//Array 	

		Object array[][]= {{1,"           Harry Potter and the Philosopher's Stone      ",2001},
				{2,"           Harry Potter and the Chamber of Secrets       ",2002},
				{3,"           Harry Potter and the Prisoner of Azkaban      ",2004},
				{4,"           Harry Potter and the Goblet of Fire           ",2005},
				{5,"           Harry Potter and the Order of the Phoenix     ",2007},
				{6,"           Harry Potter and the Half-Blood Prince        ",2009},
				{7,"           Harry Potter and the Deathly Hallows – Part 1 ",2010},
				{8,"           Harry Potter and the Deathly Hallows – Part 2 ",2011}};

		System.out.println("\nMovie Number           Movie Name                        Movie Year");

		for(int i=0;i<=7;i++)
		{ for(int j=0;j<=2;j++)

			System.out.print(array[i][j]+"");
		System.out.println();
		}*/



	}

}

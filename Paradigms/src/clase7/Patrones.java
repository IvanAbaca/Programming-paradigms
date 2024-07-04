package clase7;

public class Patrones {
	
	public static void main(String[] args) {
		
		int[][] numberList = {{1,2,3}, {4,5,6}, {7,8,9}};
		char[][] charList = {{'a','b','c','d'}, {'e','f','g','h'}, {'i','j','k','l'}};

		int i2 = 0;
		int j2 = 0;
		
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				if(numberList[i][j]%2 == 0 || numberList[i][j]%3 == 0)
				{
					j2++;
					if(j2==charList[i].length)
					{
						j2=0;
						i2++;
					}
					System.out.println(numberList[i][j]);
					
				}
		System.out.println(charList[i2][j2]);
	}
	
}

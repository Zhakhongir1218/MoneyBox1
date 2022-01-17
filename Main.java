import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		System.out.println("How much do you want to save? ");
		Scanner in = new Scanner(System.in);
		int wellSaved = in.nextInt();
		int savedMoney = 0;
		System.out.println("Enter your amount: ");

		for(int i=1; i<10000;i++){



			int plusMoney = in.nextInt();
			int plusMoneyInLoop = plusMoney + savedMoney;
			System.out.println("put " + plusMoney);
			savedMoney = plusMoneyInLoop;
			
			if(wellSaved==savedMoney){
				System.out.println("you have saved " + wellSaved);
				break;
			}else if(wellSaved<savedMoney){
				int odd = savedMoney-wellSaved;
				System.out.println("You have saved "+ wellSaved + " money, here is your odd " + odd);
				break;

			}



		}

		
	}
}
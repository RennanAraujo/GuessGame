public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random()*100);
		System.out.println("Thinking about a number: ...");
		//Thread.sleep(1000);

		while(true){
			System.out.println("The number to guess is " + targetNumber);
			//Thread.sleep(1000);

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Player 1 guess:" + guessp1);
			guessp2 = p2.number;
			System.out.println("Player 2 guess:" + guessp2);
			guessp3 = p3.number;
			System.out.println("Player 3 guess:" + guessp3);

			if(guessp1 == targetNumber){
				p1isRight = true;
			}
			if(guessp2 == targetNumber){
				p2isRight = true;
			}
			if(guessp3 == targetNumber){
				p3isRight = true;
			}
			/*
			if(p1isRight || p2isRight || p3isRight){
				System.out.println("We've got a champion");
				System.out.println("Did player 1 nailed it? " + p1isRight);
				System.out.println("Did player 2 nailed it? " + p2isRight);
				System.out.println("Did player 3 nailed it? " + p3isRight);
				System.out.println("End of the game \n");
				break;
			}*/
			if(p1isRight){
				System.out.println("P1 is champion");
				System.out.println("End of the game \n");
				break;				
			}
			else if(p2isRight){
				System.out.println("P2 is champion");
				System.out.println("End of the game \n");
				break;				
			}
			else if(p3isRight){
				System.out.println("P3 is champion");
				System.out.println("End of the game \n");
				break;				
			}			
			else {
				System.out.println("Try again \n");
			}
		}
	}
}
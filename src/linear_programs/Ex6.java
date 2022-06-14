package linear_programs;

public class Ex6 {

	public static void main(String[] args) {
		// Написать код для решения задачи. В n малых бидонах 80 л молока.
		// Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12
		// л. больше, чем в малом?
		int sumMilkN = 80;
		int sumMilkM;
		int n = 10; // количество малых бидонов
		int m = 5; // количество больших бидонов
		int smallBid; // количество литров в одном малом бидоне
		int bigBid; // количество литров в одном большом бидоне
		int difference = 12; // разница между бидонами
		smallBid = sumMilkN / n;
		bigBid = smallBid + difference;
		sumMilkM = bigBid * m;
		System.out.println("sum of milk = " + sumMilkM);

	}

}

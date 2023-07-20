import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Date date1 = new Date(2, 8, 2023);
		Date date2 = new Date(25, 6, 2024);
		Date date3 = new Date(10, 2, 2024);
		
		Producer produce1 = new Producer("Duy Khanh", "Viet Nam");
		Producer produce2 = new Producer("Vu Huong", "Viet Nam");
		Producer produce3 = new Producer("Du Thin", "Viet Nam");
		
		Movie movie1 = new Movie("Xac Song", 2021, produce1, 80000, date1);
		Movie movie2 = new Movie("Love", 2022, produce2, 90000, date3);
		Movie movie3 = new Movie("Fantasic", 2022, produce3, 70000, date3);
		
		double arraymovie[] ={movie1.getPriceTicket(),movie2.getPriceTicket(),movie3.getPriceTicket()};
				
		System.out.println(movie1.checkCheapPrice(movie2)?"The price ticket of movie 1 is Cheaper than movie2": "More expensive");
		System.out.println(movie1.checkCheapPrice(movie3)?"The price ticket of movie 1 is Cheaper than movie3": "More expensive");
		
		
	}
}

import java.util.Objects;

public class Movie {
	private String nameMovie;
	private int yearProduce;
	private Producer producer;
	private double priceTicket;
	private Date date;
	
	public Movie(String nameMovie, int yearProduce, Producer producer,double priceTicket, Date date) {
		this.nameMovie = nameMovie;
		this.yearProduce = yearProduce;
		this.producer = producer;
		this.priceTicket  = priceTicket;
		this.date = date;
	}
	public boolean checkCheapPrice(Movie otherMovie) {
		return this.priceTicket < otherMovie.priceTicket;
	}
	public String getNameMovie() {
		return nameMovie;
	}

	public void setNameMovie(String nameMovie) {
		this.nameMovie = nameMovie;
	}

	public int getYearProduce() {
		return yearProduce;
	}

	public void setYearProduce(int yearProduce) {
		this.yearProduce = yearProduce;
	}

	public double getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(double priceTicket) {
		this.priceTicket = priceTicket;
	}



	
	
	
}
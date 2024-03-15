package package1;

public class Disco extends Multimedia{
private String genre;
//contructor

public Disco(String title, String author, String format, double duration, String genre) {
	super(title, author, format, duration);
	this.genre = genre;
}
//setters and getters
public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}
public static boolean validaDisco (String genero)
{
	if (genero.equals("") || genero == null)
	{
		System.out.println("El género no puede ser nulo o estar en blanco.");
		return false;
	}
	else {return true;}
}






}

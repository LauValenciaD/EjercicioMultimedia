package package1;

public class Disco extends Multimedia{
private String Genre;
//contructor
public Disco(String title, String author, String format, double duration, String genre) {
	super(title, author, format, duration);
	Genre = genre;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
@Override
public String toString() {
	return "Disco [Genre=" + Genre + "]";
}






}

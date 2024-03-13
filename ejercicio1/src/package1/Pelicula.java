package package1;

public class Pelicula extends Multimedia{
	private String MainActor;
	private String MainActress;
	
	
	//constructor
	public Pelicula(String title, String author, String format, double duration, String mainActor, String mainActress) {
		super(title, author, format, duration);
		setMainActor(mainActor);
		setMainActress(mainActress);
	}

//getter and setter
	public String getMainActress() {
		return MainActress;
	}


	public void setMainActress(String mainActress) {
		MainActress = mainActress;
	}


	public String getMainActor() {
		return MainActor;
	}


	public void setMainActor(String mainActor) {
		MainActor = mainActor;
	}
	

	

}

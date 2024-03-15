package package1;

public class Pelicula extends Multimedia{
	private String mainActor;
	private String mainActress;
	
	
	
	//constructor
	public Pelicula(String title, String author, String format, double duration, String mainActor, String mainActress) {
		super(title, author, format, duration);
		this.mainActor = mainActor;
		this.mainActress = mainActress;
	}

	//getter and setter

	public String getMainActor() {
		return mainActor;
	}




	public void setMainActor(String mainActor) {
		this.mainActor = mainActor;
	}




	public String getMainActress() {
		return mainActress;
	}




	public void setMainActress(String mainActress) {
		this.mainActress = mainActress;
	}

	@Override
	public String toString() {
		return "Pelicula [mainActor=" + mainActor + ", mainActress=" + mainActress + "]";
	}

	

}

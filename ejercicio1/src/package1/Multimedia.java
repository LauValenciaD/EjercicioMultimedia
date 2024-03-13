package package1;

public abstract class Multimedia {
//attributes
	protected String title;
	protected String author;
	protected String format;
	protected double duration;
	
		//Constructor
	public Multimedia(String title, String author, String format, double duration) {
		if (title == null || author == null || format == null || duration <= 0 || duration > 100 ||
                (!format.equals("wav") && !format.equals("mp3") && !format.equals("avi") && !format.equals("dvd"))) {
            System.out.println("Error: Los atributos no pueden ser nulos, la duración debe estar en el intervalo (0,100] y el formato debe ser wav, mp3, avi o dvd");
        } else {
		
		this.title = title;
		this.author = author;
		this.format = format;
		this.duration = duration;
	}
	}
	//Getters and setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	//To string

	@Override
	public String toString() {
		return "Multimedia [title=" + title + ", author=" + author + ", format=" + format + ", duration=" + duration
				+ "]";
	}
	
	


}

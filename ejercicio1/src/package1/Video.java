package package1;

public class Video extends Multimedia{

	public Video(String title, String author, String format, double duration) {
		super(title, author, format, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", author=" + author + ", format=" + format + ", duration=" + duration + "]";
	}
	

}

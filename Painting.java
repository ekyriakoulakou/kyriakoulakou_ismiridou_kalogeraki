
public class Painting {
	static Painting painting[]= new Painting[10];
	private String title;
	private Painter painter;
	private int date;
	static int counterPainting=0;

	public Painting(String title,Painter painter,int date) {
			this.title=title;
			this.painter=painter;
			this.date=date;
			painting[counterPainting]=this;
			++counterPainting;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public Painter getPainter() {
		return painter;
	}
	public void setPainter(Painter painter) {
		this.painter=painter;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		if(date>0){
		this.date=date;
		}
		else{
		System.out.println("Date hasn't changed");
		}
	}
	public String toString() {
		return "Painting [title=" +title + ",painter=" +painter+ ",date=" +date+ "]";
	}

}

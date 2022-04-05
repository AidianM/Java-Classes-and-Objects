
public class Book {
	
	private String title;
	private String author;
	private int pageCount;
	private String bookReport;
	private boolean isSeries;
	private boolean haveFinished;
	
	public Book() {
		
	}
	
	public Book(String title, String author) {
		
	}
	
	public Book(String title, String author, int pageLength, boolean isSeries, boolean haveFinished) {
		
	}
	
	public String getTitle() {
		return "This book is called "+title+". ";
	}
	public String getAuthor() {
		return "The author is "+author+". ";
	}
	public int getPageCount() {
		return pageCount;
	}
	
	public String getHaveFinished(){
		if (haveFinished == true) {
			return "I have finished this book.";
		} else {
			return "I have not finished this book yet.";
		}
	}
	
	public String getIsSeries() {
		if (isSeries == true) {
			return "This book is part of a series.";
		} else {
			return "This is a standalone book.";
		}
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public void setIsSeries(boolean isSeries) {
		this.isSeries = isSeries;
	}
	public void setHaveFinished(boolean haveFinished) {
		this.haveFinished = haveFinished;
	}
	
	public String bookReport() {
		return getTitle()+getAuthor()+"\nIt has "+pageCount+" pages. "+getIsSeries()+" "+getHaveFinished();
	}
	
	
	public static void main(String[] args) {
		
		Book notw = new Book();
		
		notw.setTitle("The Name of the Wind");
		notw.setAuthor("Patrick Rothfuss");
		notw.setPageCount(662);
		notw.setIsSeries(true);
		notw.setHaveFinished(true);

		
		System.out.println(notw.bookReport());
		
		System.out.println("\nTesting the private fields:");
		
		Book siasl = new Book("Stranger In A Strange Land", "Robert Heinlein", 408, false, true);
		System.out.println(siasl.bookReport());
		//private fields, y'all!
	}

}

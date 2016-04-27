public class Photo {
	
	// local variables (predifined)
	private String photographer;
	private String date;
	private int[][] picture;
	
	// creator
	public Photo(String photographer, String date, int[][] picture) 
	{
		this.photographer = photographer;
		this.date = date;
		this.picture = picture;
	}
	
	// gets the "author"/photographer
	public String getPhotographer() 
	{
		return photographer;
	}
	
	// gets the date
	public String getDate() 
	{
		return date;
	}
	
	// gets the photo
	public int[][] getPicture() 
	{
		return picture;
	}
}

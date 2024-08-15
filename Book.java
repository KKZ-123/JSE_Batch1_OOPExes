package book_model;

public class Book {

		public String title;
		public String subtitle;
		private static int totalBooks = 0;
		
		public Book(String title, String subtitle) {
			this.title =  title;
			this.subtitle = subtitle;
			totalBooks++;
		}
		public Book(String title) {
			this.title = title;
			totalBooks++;
		}
		public void display() {
			System.out.println("\nBook Title :" + title);
			System.out.println("Book Subtitle : " + subtitle);
		}
		public static int getTotalBooks() {
			return totalBooks;
		}
}

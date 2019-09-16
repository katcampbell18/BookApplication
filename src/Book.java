public class Book {
    private String title;
    private String author;
    private String description;
    private int price;
    private boolean isInStock = true;

    public Book() {
    }
    public Book(String title, String author, String description, int price){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }
    public String getDisplayText(){
        return title + " written by " + author + " is about " +description;
    }
    public String getTotalPrice(){
        int total = 0;
        if(isInStock){
            total += price;
        }
        else{
            total+=0;
            System.out.println("The book is not available");
        }
        return "You total price is " + total;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public boolean getisInStock() {
        return isInStock;
    }
    public void setisInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
}



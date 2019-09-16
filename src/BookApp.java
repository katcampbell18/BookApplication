public class BookApp {
    public static void main(String[]args){

        Book b = new Book();
        b.setTitle("Their Eyes were Watching God");
        b.setAuthor("Toni Morrissey");
        b.setDescription("a journey through life");
//        String message = b.getDisplayText();
        System.out.println(b.getDisplayText());
    }
}

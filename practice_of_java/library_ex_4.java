package practice_of_java;
class library{
    String [] books;
    int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void add_book(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added!..");
    }
    void show_available_books(){
        System.out.println("available books are: ");
        for (String book : this.books) {
            if (book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issuedbooks(String book){
        for(int i=0;i<books.length;i++){
            if(this.books[i].equals(book)){
                System.out.printf("the %s has been issued\nand the ",book);
                this.books[i]=null;
                return;
            }


        }
    }
    void returnbook(String book){
        add_book(book);
    }

}

public class library_ex_4 {
    public static void main(String[] args) {
        library central=new library();
        central.add_book("think and grow more");
        central.add_book("c++");
        central.add_book("education");
        central.show_available_books();
        central.issuedbooks("c++");
        central.show_available_books();
        central.returnbook("c++");
        central.show_available_books();

    }
    
}

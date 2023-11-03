public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book(){
        numberOfPages = 1;
        title = "";
        author = "";
    }
    @Override
    public String toString(){
        return("Book: "+
                title + " by " + author +
                ",Pages: "+ numberOfPages + ".");
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Book temp){
            return (this.title.equals(temp.title) &&
                    this.author.equals(temp.author) &&
                    this.numberOfPages == temp.numberOfPages);
        }
        else
            return false;

    }
}

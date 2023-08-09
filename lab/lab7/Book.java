class Book{
    private String author, title;
    protected int pages;
    
    public Book(String author, String title, int pages){
        if(author.length()<2 || title.length()<4){
            throw new IllegalArgumentException();
        }
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public Book(){
        this.author = "John Steinbeck";
        this.title = "Of Mice and Men";
        this.pages = 107;
    }

    public String getShortName(){
        return author.substring(0, 2) + ": " + title.substring(0, 4) + ", " + pages + " pages";
    }

    @Override
    public String toString(){
        return "Author: " + author + ", title: " + title + " with " + pages + " pages";
    }

}

enum CoverType{
    SoftCover,
    HardCover;
}

class PrintedBook extends Book{
    protected CoverType cover;

    public PrintedBook(){
        super();
        this.pages += 6;
        this.cover = CoverType.HardCover;
    }

    public PrintedBook(String author, String title, int pages, CoverType cover){
        super(author, title, pages+6);
        this.cover = cover;
    }

    public int getPrice(){
        if(cover == CoverType.SoftCover){
            return pages*2;
        }
        else {
            return pages*3;
        }
    }

    @Override
    public String toString(){
        return super.toString() + ", " + cover;
    }
}

class EBook extends Book{
    protected int PDF_size;

    public EBook(String author, String title, int pages, int PDF_size){
        super(author, title, pages);
        this.PDF_size = PDF_size;
    }

    public int getPrice(){
        return pages + PDF_size;
    }
}
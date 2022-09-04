public class Author {
   private String nameAuthor;
   private String familyAuthor;

    public Author(String nameAuthor, String familyAuthor){
        this.nameAuthor = nameAuthor;
        this.familyAuthor=familyAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }
    public String getFamilyAuthor() {
        return familyAuthor;
    }
    public String getAuthor() {
        return familyAuthor + " "+ nameAuthor;
    }

}

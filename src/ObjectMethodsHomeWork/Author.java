package ObjectMethodsHomeWork;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String familyAuthor;

    public Author(String nameAuthor, String familyAuthor) {
        this.nameAuthor = nameAuthor;
        this.familyAuthor = familyAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getFamilyAuthor() {
        return familyAuthor;
    }

    public void setFamilyAuthor(String familyAuthor) {
        this.familyAuthor = familyAuthor;
    }

    @Override
    public String toString() {
        return  nameAuthor + " " + familyAuthor ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(familyAuthor, author.familyAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, familyAuthor);
    }
}

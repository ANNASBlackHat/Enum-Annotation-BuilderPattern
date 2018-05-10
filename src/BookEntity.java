import anotations.Entity;

@Entity(tableName = "table", primaryKey = {"isbn"})
public class BookEntity {
    String isbn;
    String author;

    public BookEntity() {
    }
}

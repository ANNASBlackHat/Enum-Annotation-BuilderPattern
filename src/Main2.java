import anotations.Entity;

import java.lang.annotation.Annotation;

public class Main2 {

    public static void main(String[] args) {
        BookEntity book = new BookEntity();

        Class cls = book.getClass(); //reflection
        Annotation anotation = cls.getAnnotation(Entity.class);
        Entity entity = (Entity) anotation;

        System.out.println("Table name : "+entity.tableName());
    }
}

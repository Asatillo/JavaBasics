import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import static org.junit.Assert.assertFalse;

public class BookTest {

    @Before
    public void setUp() {
        Book.resetId();
    }
    @After
    public void tearDown() {
        Book.resetId();
    }

    @Test
    public void Book_setParam() {
        Book b1 = Book.make("abc", "name", "EDUCATIONAL", "100" );
        Book b2 = Book.make("abc", "name", "EDUCATIONAL", "100" );

        assertEquals(100, b1.getReservePrice());
        assertEquals(100, b2.getReservePrice());

        assertEquals(0,b1.getId());
        assertEquals(1,b2.getId());
    }
    @Test
    public void make_checkValues() {
        //covers title string null check
        assertEquals(null, Book.make("abc",null, "EDUCATIONAL", "100" ));

        //covers title string length check
        assertEquals(null, Book.make("abc", "n", "EDUCATIONAL", "100" ));

        //covers reserve price positivity check
        assertEquals(null, Book.make("abc", "name", "EDUCATIONAL", "0" ));
        assertEquals(null, Book.make("abc", "name", "EDUCATIONAL", "-100" ));
    }

    @Test
    public void make_checkTitleContents() {
        //cover letter-digit-whitespace
        assertEquals(null, Book.make("abc", "$$$", "EDUCATIONAL", "100" ));

        //covers letter check success
        assertNotEquals(null, Book.make("abc", "name", "EDUCATIONAL", "100" ));

        //covers digit check success
        assertNotEquals(null, Book.make("abc", "123", "EDUCATIONAL", "100" ));

        //covers whitespace check success
        assertNotEquals(null, Book.make("abc", "  ", "EDUCATIONAL", "100" ));
    }

    //test isSameGenre()
    @Test
    public void make_checkIsSameGenre(){
        // success case
        assertEquals(true, Book.make("abc", "  ", "EDUCATIONAL", "100" ), Book.make("abc", "123", "EDUCATIONAL", "100" ));

        // different genres
        assertNotEquals(false, Book.make("abc", "  ", "PHILOSOPHY", "100" ), Book.make("abc", "123", "EDUCATIONAL", "100" ));

    }

    //test case for comapare() //1,-1,0
    @Test
    public void make_compare(){
        // throws an exception because different genres
        assertEquals(-1, Book.make("abc", "  ", "PHILOSOPHY", "100" ), Book.make("abc", "123", "EDUCATIONAL", "100" ));

        // prices are different
        assertEquals(0, Book.make("abc", "  ", "PHILOSOPHY", "200" ), Book.make("abc", "123", "PHILOSOPHY", "100" ));

        // prices are the same
        assertEquals(1, Book.make("abc", "  ", "PHILOSOPHY", "100" ), Book.make("abc", "123", "PHILOSOPHY", "100" ));
    }


}
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    Cipher c;
    String nullString = null;
    String str = "test";

    @BeforeEach
    void setUp() {
        c = new Cipher();
    }

    @Test
    void encrypt() {
        assertEquals("CDE", c.encrypt(3, "ABC"));
    }

    @Test
    void encryptNotNullIfEmptyString() {
        assertNotNull(c.encrypt(-3, ""));
    }

    @Test
    void encryptPolishWord(){
        assertEquals("aąb",c.encrypt(3,"zźż"));
    }

    @Test
    void decrypt() {
        assertEquals("ABC", c.decrypt(3, "CDE"));
    }

    @Test
    void decryptThrowError() {
        assertNotNull(c.decrypt(3,"Mój test decryptowania"));
    }

    @Test
    void decryptNotNullIfEmptyString() {
        assertNotNull(c.decrypt(-3, ""));
    }

    @Test
    void cipherObjectIsNotNull() {
        assertNotNull(c);
    }
    
    @Test
    void encryptedMessageIsNotNull() { assertNotNull(c.encrypt(3,"Test"));}
}
package test.easy;

import easy.AddBinary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    private AddBinary obj;

    @BeforeEach
    void setUp() {
        obj = new AddBinary();
    }

    @Test
    void addBinary() {
        System.out.println(obj.addBinary("11", "1"));
    }
}
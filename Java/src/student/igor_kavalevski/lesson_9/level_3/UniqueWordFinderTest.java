package student.igor_kavalevski.lesson_9.level_3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordFinderTest {

    @Test
    void find() {

        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

        Set<String> expected = new HashSet<>();

        expected.add("Book");
        expected.add("Java");

        Set<String> actual = uniqueWordFinder.find("Book Book Java Java");

        Assert.assertEquals(expected, actual);

    }
}
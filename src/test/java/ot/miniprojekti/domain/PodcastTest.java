package ot.miniprojekti.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PodcastTest {

    private Podcast p;

    @Before
    public void setUp() {
        this.p = new Podcast(0, "otsikko", "nimi", "kuvaus");
    }

    @Test
    public void toStringTest() {
        String result = p.toString();
        String expected = p.toString();

        assertEquals(result, expected);
    }
}

package by.jrr.jcore.polymorphism;

import by.jrr.jcore.abstractiondemo.bean.interfaces.ElvisPresley;
import by.jrr.jcore.abstractiondemo.bean.interfaces.MichaelJackson;
import by.jrr.jcore.abstractiondemo.bean.interfaces.Singer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.*;

public class MagicServiceTest {

    MagicService magicService;

    @Before
    public void setUp() {
        magicService = new MagicService();
    }

    @Test
    public void singSongs() {
        magicService.singSongs();
    }

    @Test(expected = ClassCastException.class)
    public void cast() {
        Singer elvis = new ElvisPresley();
        Singer jackson = new MichaelJackson();

        elvis.sign();
        jackson.sign();

        ElvisPresley elvis2 = (ElvisPresley) elvis;
        ElvisPresley elvis3 = (ElvisPresley) jackson;

        elvis2.flyToTheMoon();
        elvis3.flyToTheMoon();
    }

    @Test
    public void calculateShapes() {
        magicService.calculateShapes();
    }
}

package pl.mesayah.publictransport.board;

import javafx.geometry.Point2D;
import org.junit.Assert;
import org.junit.Test;
import pl.mesayah.publictransport.model.stop.BusStop;
import pl.mesayah.publictransport.model.stop.Stop;

import java.util.Collections;

public class BoardTest {

    @Test
    public void testStopSpawning() {

        Board board = new Board(800, 800);
        Stop sampleStop = new BusStop("Sample Bus Stop", new Point2D(10, 10), Collections.emptyList());
        board.spawn(Collections.singleton(sampleStop));
        Assert.assertTrue(board.getStops().contains(sampleStop));
    }
}

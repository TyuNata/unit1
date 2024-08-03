import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTestJUnit4 {

    @Test
    public void testcorrect1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testcorrect2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testcorrect3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }
}


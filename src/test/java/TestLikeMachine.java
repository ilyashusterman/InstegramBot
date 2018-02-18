import org.junit.Before;
import org.junit.Test;

public class TestLikeMachine {

    LikeMachine likeMachine ;

    @Before
    public void setUp() throws Exception {
        likeMachine = new LikeMachine();
    }

    @Test
    public void testConnectionLike() throws Exception{
        LikeMachine connected = likeMachine.getSession("nikita1@gmail.com", "password");
        assert connected.isConnected == true;
    }
}

package springcourse.exercises.exercise7.dao.impl;

import org.junit.Before;
import springcourse.exercises.exercise7.dao.api.IMemberDaoBlackBoxTest;

/**
 * @author amira
 * @since 4/17/2014
 */
public class MemberInMemoryDaoBlackBoxTest extends IMemberDaoBlackBoxTest {

    @Before
    public void setUp2() throws Exception {
        uut = new MemberInMemoryDao();
    }
}

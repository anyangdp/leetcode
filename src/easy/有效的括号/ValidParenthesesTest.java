package easy.有效的括号;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author anyang
 * @CreateTime 2018/8/31
 * @Des
 */
public class ValidParenthesesTest {
    @Test
    public void test1() {
        Assert.assertTrue("失败",ValidParentheses.isValid("()[]{}"));
    }

    @Test
    public void test2() {
        System.out.println(ValidParentheses.isValid("()"));
        Assert.assertTrue("失败",ValidParentheses.isValid("()"));
    }
    @Test
    public void test3() {
        Assert.assertTrue("失败",ValidParentheses.isValid("(]"));
    }

    @Test
    public void test4() {
        Assert.assertTrue("失败",ValidParentheses.isValid("([)]"));
    }

    @Test
    public void test5() {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().plusYears(1L));
        System.out.println(new Date());
        System.out.println(new Date().getTime());
    }
}

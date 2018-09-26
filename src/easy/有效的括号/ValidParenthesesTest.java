package easy.有效的括号;

import org.junit.Assert;
import org.junit.Test;

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

}

import org.example.P181943;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TT {
    @Test
    public void ptest() {
        String a = "abc";
        int sum = 1 + 2;

        assertThat(a, is("abc")); // 테스트 변수 대상, 일치한지 확인할 결과
        assertThat(sum, is(3)); //노란줄은 테스트 실패, 프로그램은 돌아감

    }

    @Test
    public void p181943_test() {
        String result = P181943.solution("aaaaaa", "bbb", 3);
        assertThat(result, is("aaabbb"));
    }
}


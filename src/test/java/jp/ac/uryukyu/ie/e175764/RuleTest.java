package jp.ac.uryukyu.ie.e175764;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {
    @Test
    public void testTotal() {
        String[] hands ={"ハート(1)","スペード(2)","クローバー(3)"};
        Rule rule = new Rule();
        int total = rule.Total(hands);
        assertEquals(6,total);
    }
}

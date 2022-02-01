package com.example.damo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    public void test_意味のないテスト(){
        System.out.println("--------テスト開始------------");
        assertEquals(1,1);
        System.out.println("--------テスト終了------------");
    }
}

package com.example.damo;

import com.example.damo.Repository.SlipRepository;
import com.example.damo.service.SlipService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SlipServiceTest {

    // メソッドをモックする対象クラス
    @Spy
    private SlipRepository slipRepository = new SlipRepository();

    // モックしたメソッドを持つクラスを利用している、テスト対象となるクラス
    @InjectMocks
    private SlipService slipService;

    @Test
    public void test_Slipが取得できる(){
        Mockito.doReturn("Salse").when(this.slipRepository).getSlip();
        boolean result = this.slipService.getSlip();
        Assertions.assertTrue(result);
    }

    @Test
    public void test_Slipが取得できない(){
        Mockito.when(this.slipRepository.getSlip()).thenReturn("");
        boolean result = this.slipService.getSlip();
        Assertions.assertFalse(result);
    }
}

package com.example.damo;

import com.example.damo.service.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

// この記載がないとMockが作成されません。
@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    // モック（空実装）となるインスタンス（テスト対象のクラスで、依存しているクラスをここで定義）
    @Mock
    private SampleService sampleService;

    // テスト対象となるクラス。Mockしたクラスは、このテスト対象となるクラスで利用する。
    @InjectMocks
    private UserController userController;

    /**
     * テストの実行前に実行されます。
     */
    @BeforeEach
    public void prepare(){
        System.out.println("befor-test");
    }

    @Test
    public void test_サービスクラスのモック利用(){
        Mockito.when(this.sampleService.getActiveUserName()).thenReturn("御坂美琴");
        String result = this.userController.user();

        Assertions.assertEquals(result,"ようこそ御坂美琴さん");
    }

    @Test
    public void test_その２(){
        Mockito.when(this.sampleService.getActiveUserName()).thenReturn("1234567890123456");
        String result = this.userController.user();

        Assertions.assertEquals(result,"ロングネーム");
    }
}

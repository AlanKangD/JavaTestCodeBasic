package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴를 생성합니다.")
    @Test
    void createTest() {
        assertThatCode(() -> new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
    }
}

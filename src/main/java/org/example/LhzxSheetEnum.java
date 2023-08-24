package org.example;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor(access=AccessLevel.PRIVATE)
@Getter
public enum LhzxSheetEnum {
    test("测试",1);
    private String name;
    private int index;
}

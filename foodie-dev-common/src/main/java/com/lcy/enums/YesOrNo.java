package com.lcy.enums;

/**
 * @Desc: 是否 枚举
 */
public enum YesOrNo {
    NO(0, "No"),
    YES(1, "Yes");

    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}

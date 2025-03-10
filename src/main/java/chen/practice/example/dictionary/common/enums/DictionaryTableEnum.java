package chen.practice.example.dictionary.common.enums;


public enum DictionaryTableEnum {
    //证件类型代码表
    DICTIONARY_CERTIFICATE_CODE("CD000001", "queryZjlxdmbList"),
    //币种代码表
    DICTIONARY_COIN_TYPE_CODE("CD000002", "queryBzdmbList"),
    //关联交易业务类型代码表
    DICTIONARY_RELATED_TRADE_TYPE_CODE("CD000003", "queryGljyywlxdmbList");

    private final String code;

    private final String desc;

    DictionaryTableEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDescByCode(String code) {
        for (DictionaryTableEnum value : DictionaryTableEnum.values()) {
            if (value.code.equals(code)) {
                return value.desc;
            }
        }
        return null;
    }


}

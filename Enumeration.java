// ini adalah cara membuat alias pada enumeration jadi enak bisa di manipulasi
public enum TierBenefitEnum {
    PERCENTAGE("percentage", "Percentage"),
    AMOUNT("amount", "Amount");

    private final String code ;
    private final String value;

    TierBenefitEnum(String code, String value){
        this.code = code;
        this.value = value;
    }

    public String getId(){
        return code;
    }

    public String getValue(){
        return value;
    }

    public static TierBenefitEnum getByCode(String code){
        for(TierBenefitEnum t : values()){
            if(t.code.equalsIgnoreCase(code)) return t;
        }
        return null;
    }

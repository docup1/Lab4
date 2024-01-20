package enums;

public enum MaterialType {
    Plastic("проволочный"), Unknown("uncnown");

    private String code;
    MaterialType(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}

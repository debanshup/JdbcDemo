package insert_info;

public class InsertInfo {
    private String name;
    private String mobile_no;
    private String full_address;
    private String pin_code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public String getPin_code() {
        return pin_code;
    }

    public void setPin_code(String pin_code) {
        this.pin_code = pin_code;
    }

    public InsertInfo(String name, String mobile_no, String full_address, String pin_code) {
        this.name = name;
        this.mobile_no = mobile_no;
        this.full_address = full_address;
        this.pin_code = pin_code;
    }

    public InsertInfo() {
        super();
    }


}

package com.study.study_space.basic.enumDemo;

public enum CompanyEnum {
    SF("顺丰速运", 1001), YTO("圆通速递", 1002),STO("申通物流",1003),YD("韵达快运",1004),YZPY("中国邮政",1005);
    private CompanyEnum(String company, int code) {
        this.company = company;
        this.code = code;
    }
    private String company; // 公司名称
    private int code; // 公司编码
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}

class Test{

    public static void main(String[] args) {

        String company = CompanyEnum.SF.getCompany();
        System.out.println(company);
        for(CompanyEnum com:CompanyEnum.values()){
            String s = com.toString();
            System.out.println(s);
        }
    }

}
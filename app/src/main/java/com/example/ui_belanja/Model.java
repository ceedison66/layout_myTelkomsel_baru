package com.example.ui_belanja;

public class Model {

    Integer Logo;
    String Satu, Dua, Tiga, Empat, Lima;

    public Model(Integer logo, String satu, String dua, String tiga, String empat, String lima) {
        this.Logo = logo;
        this.Satu = satu;
        this.Dua = dua;
        this.Tiga = tiga;
        this.Empat = empat;
        this.Lima = lima;
    }

    public Integer getLogo() {
        return Logo;
    }

    public String getSatu() {
        return Satu;
    }

    public String getDua() {
        return Dua;
    }

    public String getTiga() {
        return Tiga;
    }

    public String getEmpat() {
        return Empat;
    }

    public String getLima() {
        return Lima;
    }

}

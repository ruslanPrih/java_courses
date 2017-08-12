package com.prikhodko;

public class enum1208 {
    public static void main(String[] args) {
        System.out.println(Month.JAN.days);


    }

    enum Month{
        JAN(31,"January","Січень"),
        FEB(28,"February","Лютий");

        private int days;
        private String nameEn;
        private String nameUa;

        Month(int days, String nameEn, String nameUa) {
            this.days = days;
            this.nameEn = nameEn;
            this.nameUa = nameUa;
        }

        public int getDays() {
            return days;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public String getNameEn() {
            return nameEn;
        }

        public void setNameEn(String nameEn) {
            this.nameEn = nameEn;
        }

        public String getNameUa() {
            return nameUa;
        }

        public void setNameUa(String nameUa) {
            this.nameUa = nameUa;
        }
    }
}

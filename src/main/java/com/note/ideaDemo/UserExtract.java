package com.note.ideaDemo;

/**
 * foo函数中有较多的字符串，可以选择将字符创定义为一个变量,如此，当字符串变量值发生变化时，只需要更改变量
 */
public class UserExtract {
    private String firstName;
    private String lastName;

    private String getFullName(String lastName, String firstName) {
        String fullName = firstName + "\t" + lastName;

        return fullName;
    }

    public void foo() {
        lastName = "san";
        validate();

        loadDataFromDB();

        calculate();

    }

    /**
     *  抽取函数
     */
    private void calculate() {
        getFullName(lastName, this.firstName);
        getFullName(lastName, this.firstName);
    }

    private void loadDataFromDB() {
        getFullName(lastName, this.firstName);
        getFullName(lastName, this.firstName);
    }

    private void validate() {
        getFullName(lastName, this.firstName);
        getFullName(lastName, this.firstName);
    }


//    private String firstName;
//
//    private String getFullName(String lastName) {
//        String fullName = this.firstName + "\t" + lastName;
//
//        return fullName;
//    }
//
//    public void foo() {
//        getFullName("san");
//        getFullName("san");
//        getFullName("san");
//        getFullName("san");
//        getFullName("san");
//        getFullName("san");
//        getFullName("san");
//
//    }


}

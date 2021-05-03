package com.sliit.mtit.microservice.orderservice.dto;

public class OrderRequest {

    private String fullName;
    private String age;
    private String OrderType;
    private String OrderDetails;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public String getOrderDetails() {
        return OrderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        OrderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", OrderType='" + OrderType + '\'' +
                ", OrderDetails='" + OrderDetails + '\'' +
                '}';
    }
}

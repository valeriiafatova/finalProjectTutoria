package com.epam.dto;

public class StudentDTO {
    private String name;
    private String phone;
    private boolean accepted;

    public StudentDTO(String name, String phone, boolean accepted) {
        this.name = name;
        this.phone = phone;
        this.accepted = accepted;
    }

    public StudentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}

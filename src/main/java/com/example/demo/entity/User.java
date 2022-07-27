package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotEmpty( message = "Không được để trống")
    private String name;
    @NotEmpty( message = "Không được để trống")
    private String address;
    @Size(min = 10,max = 10,message = "Phone 10 số")
    @Pattern(regexp = "0[0-9]{9}")
    private String phone ;
}

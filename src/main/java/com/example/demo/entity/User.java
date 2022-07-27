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
    @NotNull( message = "Không được để trống")
    private String name;
    @NotNull( message = "Không được để trống")
    private String address;
    @NotNull(message = "Không được để trống")
    @Pattern(regexp = "^0.*$")
    private String phone ;
}

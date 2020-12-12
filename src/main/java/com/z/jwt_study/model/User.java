package com.z.jwt_study.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mr zhang
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private String desc;
    private String password;
}

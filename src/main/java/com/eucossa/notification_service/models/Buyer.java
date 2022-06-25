package com.eucossa.notification_service.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Saturday, 25/06/2022
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Buyer {

    private String username;
    private String email;
    private String city;
    private String zipCode;
    private String phoneNumber;

}

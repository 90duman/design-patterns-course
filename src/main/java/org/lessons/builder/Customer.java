package org.lessons.builder;

import lombok.*;

/**
 * Lombok descriptions
 * <p>
 *
 * @author axteel on 09.04.2021 : 23:38
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Customer {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String middleName;
}

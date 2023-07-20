package de.ait.minishop.models;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    private long id;
    private String title;
    boolean expired;
    int quantity;
}

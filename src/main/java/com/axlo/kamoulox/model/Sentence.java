package com.axlo.kamoulox.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of= {"verbe","action"})
@ToString(of= {"verbe","action"})
public class Sentence {
    String verbe;
    String action;

}

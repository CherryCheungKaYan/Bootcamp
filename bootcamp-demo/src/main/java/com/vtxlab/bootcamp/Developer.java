package com.vtxlab.bootcamp;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor // name? age?
@NoArgsConstructor
@ToString(callSuper = true) // name? age?
@EqualsAndHashCode // name ? age?
@Builder // name? age?
public class Developer extends Staff {

  private List<String> skills;

  public static void main(String[] args) {
    Developer developer = new Developer();
    developer.setSkills(null);
    System.out.println(developer.getSkills());

    Developer developer2 =
        new Developer(new ArrayList<>(List.of("coding", "testing")));

    // Developer(super=Staff(id=0, name=null), skills=[coding, testing])
    System.out.println(developer2.toString());

  }

}

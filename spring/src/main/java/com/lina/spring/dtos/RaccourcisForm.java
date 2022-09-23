package com.lina.spring.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RaccourcisForm {
  private String id;
  private String nameSite;
  private String urlSite;
  private String nomUtilisateur;
}

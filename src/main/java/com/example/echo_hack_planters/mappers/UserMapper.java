package com.example.echo_hack_planters.mappers;

import com.example.echo_hack_planters.model.User;
import com.example.echo_hack_planters.model.UserApi;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface UserMapper  {
  @Mapping(target = "password", ignore = true)
  @Mapping(target = "name", source = "name")
  User intoEntity(UserApi user);

  @Mapping(target = "name", source = "name")
  UserApi fromEntity(User entity);


}

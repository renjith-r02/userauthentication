package com.dzone.demo.userauthentication.login;

import org.springframework.data.repository.CrudRepository;

  interface LoginRepository extends CrudRepository<LoginEntity,String> {
}

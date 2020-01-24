package com.pizzeria.pedro.template.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
/**
 * Clase dao del que deben extender todos los daos para que permitan 
 * specifications y la definicion solo con el nombre del metodo
 * @author ruben
 *
 */
@NoRepositoryBean
public interface TemplateDao<T, Id extends Serializable> extends JpaRepository<T, Id>, JpaSpecificationExecutor<T>{

}

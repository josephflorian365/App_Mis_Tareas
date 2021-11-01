package com.vallegrande.tareas.repo;

import com.vallegrande.tareas.model.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TareaRepository extends MongoRepository<Tarea, String> {


}

package com.harington.upskilling.privateSchool.application.ports.in;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CrudUseCase;

public interface ClasseUseCase extends CrudUseCase<Classe, CreateClasseRequest, UpdateClasseRequest> {}
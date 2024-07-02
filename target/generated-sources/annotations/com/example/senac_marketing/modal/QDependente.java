package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDependente is a Querydsl query type for Dependente
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDependente extends EntityPathBase<Dependente> {

    private static final long serialVersionUID = -1309572287L;

    public static final QDependente dependente = new QDependente("dependente");

    public final QEntiyId _super = new QEntiyId(this);

    public final DatePath<java.time.LocalDate> DataNascimento = createDate("DataNascimento", java.time.LocalDate.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public QDependente(String variable) {
        super(Dependente.class, forVariable(variable));
    }

    public QDependente(Path<? extends Dependente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDependente(PathMetadata metadata) {
        super(Dependente.class, metadata);
    }

}


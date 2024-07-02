package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCargo is a Querydsl query type for Cargo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCargo extends EntityPathBase<Cargo> {

    private static final long serialVersionUID = -589158175L;

    public static final QCargo cargo = new QCargo("cargo");

    public final QEntiyId _super = new QEntiyId(this);

    public final BooleanPath comissionado = createBoolean("comissionado");

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nivel = createString("nivel");

    public QCargo(String variable) {
        super(Cargo.class, forVariable(variable));
    }

    public QCargo(Path<? extends Cargo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCargo(PathMetadata metadata) {
        super(Cargo.class, metadata);
    }

}


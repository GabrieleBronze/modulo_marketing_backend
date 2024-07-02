package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExpAnterior is a Querydsl query type for ExpAnterior
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QExpAnterior extends EntityPathBase<ExpAnterior> {

    private static final long serialVersionUID = -1036263078L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExpAnterior expAnterior = new QExpAnterior("expAnterior");

    public final QEntiyId _super = new QEntiyId(this);

    public final QCargo cargo;

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DatePath<java.time.LocalDate> periodoFim = createDate("periodoFim", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> periodoInicio = createDate("periodoInicio", java.time.LocalDate.class);

    public QExpAnterior(String variable) {
        this(ExpAnterior.class, forVariable(variable), INITS);
    }

    public QExpAnterior(Path<? extends ExpAnterior> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExpAnterior(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExpAnterior(PathMetadata metadata, PathInits inits) {
        this(ExpAnterior.class, metadata, inits);
    }

    public QExpAnterior(Class<? extends ExpAnterior> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargo = inits.isInitialized("cargo") ? new QCargo(forProperty("cargo")) : null;
    }

}


package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntiyId is a Querydsl query type for EntiyId
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QEntiyId extends EntityPathBase<EntiyId> {

    private static final long serialVersionUID = -1391185477L;

    public static final QEntiyId entiyId = new QEntiyId("entiyId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QEntiyId(String variable) {
        super(EntiyId.class, forVariable(variable));
    }

    public QEntiyId(Path<? extends EntiyId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntiyId(PathMetadata metadata) {
        super(EntiyId.class, metadata);
    }

}


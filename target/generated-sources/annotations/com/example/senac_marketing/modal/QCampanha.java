package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCampanha is a Querydsl query type for Campanha
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCampanha extends EntityPathBase<Campanha> {

    private static final long serialVersionUID = 1785005218L;

    public static final QCampanha campanha = new QCampanha("campanha");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath conteudo = createString("conteudo");

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final DatePath<java.time.LocalDate> periodoFim = createDate("periodoFim", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> periodoInicio = createDate("periodoInicio", java.time.LocalDate.class);

    public final NumberPath<Double> valor = createNumber("valor", Double.class);

    public QCampanha(String variable) {
        super(Campanha.class, forVariable(variable));
    }

    public QCampanha(Path<? extends Campanha> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCampanha(PathMetadata metadata) {
        super(Campanha.class, metadata);
    }

}


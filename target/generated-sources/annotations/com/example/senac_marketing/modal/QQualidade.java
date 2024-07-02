package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QQualidade is a Querydsl query type for Qualidade
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQualidade extends EntityPathBase<Qualidade> {

    private static final long serialVersionUID = -1705045923L;

    public static final QQualidade qualidade = new QQualidade("qualidade");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final DatePath<java.time.LocalDate> periodoFim = createDate("periodoFim", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> periodoInicio = createDate("periodoInicio", java.time.LocalDate.class);

    public final StringPath setor = createString("setor");

    public QQualidade(String variable) {
        super(Qualidade.class, forVariable(variable));
    }

    public QQualidade(Path<? extends Qualidade> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQualidade(PathMetadata metadata) {
        super(Qualidade.class, metadata);
    }

}


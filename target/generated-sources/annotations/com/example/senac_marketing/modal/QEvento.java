package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEvento is a Querydsl query type for Evento
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEvento extends EntityPathBase<Evento> {

    private static final long serialVersionUID = -1007762288L;

    public static final QEvento evento = new QEvento("evento");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath conteudo = createString("conteudo");

    public final NumberPath<Float> custo = createNumber("custo", Float.class);

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath local = createString("local");

    public final StringPath nome = createString("nome");

    public final DatePath<java.time.LocalDate> periodoFim = createDate("periodoFim", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> periodoInicio = createDate("periodoInicio", java.time.LocalDate.class);

    public final NumberPath<Float> valor = createNumber("valor", Float.class);

    public QEvento(String variable) {
        super(Evento.class, forVariable(variable));
    }

    public QEvento(Path<? extends Evento> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEvento(PathMetadata metadata) {
        super(Evento.class, metadata);
    }

}


package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QIndicador is a Querydsl query type for Indicador
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIndicador extends EntityPathBase<Indicador> {

    private static final long serialVersionUID = -1169053532L;

    public static final QIndicador indicador = new QIndicador("indicador");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final StringPath setor = createString("setor");

    public QIndicador(String variable) {
        super(Indicador.class, forVariable(variable));
    }

    public QIndicador(Path<? extends Indicador> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIndicador(PathMetadata metadata) {
        super(Indicador.class, metadata);
    }

}


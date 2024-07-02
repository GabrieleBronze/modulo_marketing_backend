package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFiliacao is a Querydsl query type for Filiacao
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFiliacao extends EntityPathBase<Filiacao> {

    private static final long serialVersionUID = 1193459211L;

    public static final QFiliacao filiacao = new QFiliacao("filiacao");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath FoneMae = createString("FoneMae");

    public final StringPath FonePai = createString("FonePai");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath NomeMae = createString("NomeMae");

    public final StringPath NomePai = createString("NomePai");

    public QFiliacao(String variable) {
        super(Filiacao.class, forVariable(variable));
    }

    public QFiliacao(Path<? extends Filiacao> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFiliacao(PathMetadata metadata) {
        super(Filiacao.class, metadata);
    }

}


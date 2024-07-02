package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDadoBancario is a Querydsl query type for DadoBancario
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDadoBancario extends EntityPathBase<DadoBancario> {

    private static final long serialVersionUID = -1801993618L;

    public static final QDadoBancario dadoBancario = new QDadoBancario("dadoBancario");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath agencia = createString("agencia");

    public final StringPath banco = createString("banco");

    public final StringPath conta = createString("conta");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QDadoBancario(String variable) {
        super(DadoBancario.class, forVariable(variable));
    }

    public QDadoBancario(Path<? extends DadoBancario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDadoBancario(PathMetadata metadata) {
        super(DadoBancario.class, metadata);
    }

}


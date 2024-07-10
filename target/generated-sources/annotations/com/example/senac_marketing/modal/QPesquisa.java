package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPesquisa is a Querydsl query type for Pesquisa
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPesquisa extends EntityPathBase<Pesquisa> {

    private static final long serialVersionUID = -1899926992L;

    public static final QPesquisa pesquisa = new QPesquisa("pesquisa");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final DatePath<java.time.LocalDate> periodoFim = createDate("periodoFim", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> periodoInicio = createDate("periodoInicio", java.time.LocalDate.class);

    public final StringPath setor = createString("setor");

    public QPesquisa(String variable) {
        super(Pesquisa.class, forVariable(variable));
    }

    public QPesquisa(Path<? extends Pesquisa> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPesquisa(PathMetadata metadata) {
        super(Pesquisa.class, metadata);
    }

}


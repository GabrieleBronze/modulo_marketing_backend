package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCertificacao is a Querydsl query type for Certificacao
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCertificacao extends EntityPathBase<Certificacao> {

    private static final long serialVersionUID = -182989658L;

    public static final QCertificacao certificacao = new QCertificacao("certificacao");

    public final QEntiyId _super = new QEntiyId(this);

    public final NumberPath<Double> cargaHoraria = createNumber("cargaHoraria", Double.class);

    public final DatePath<java.time.LocalDate> dataEmissao = createDate("dataEmissao", java.time.LocalDate.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public QCertificacao(String variable) {
        super(Certificacao.class, forVariable(variable));
    }

    public QCertificacao(Path<? extends Certificacao> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCertificacao(PathMetadata metadata) {
        super(Certificacao.class, metadata);
    }

}


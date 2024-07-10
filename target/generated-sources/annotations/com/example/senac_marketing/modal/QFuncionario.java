package com.example.senac_marketing.modal;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFuncionario is a Querydsl query type for Funcionario
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFuncionario extends EntityPathBase<Funcionario> {

    private static final long serialVersionUID = 219361088L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFuncionario funcionario = new QFuncionario("funcionario");

    public final QEntiyId _super = new QEntiyId(this);

    public final StringPath atuacao = createString("atuacao");

    public final StringPath cadastroReservista = createString("cadastroReservista");

    public final NumberPath<Integer> cargaHoraria = createNumber("cargaHoraria", Integer.class);

    public final QCargo cargo;

    public final QCertificacao certificacao;

    public final StringPath CNH = createString("CNH");

    public final StringPath CPF = createString("CPF");

    public final StringPath CTPS = createString("CTPS");

    public final QDadoBancario dadoBancario;

    public final DatePath<java.time.LocalDate> dataAdmissao = createDate("dataAdmissao", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> dataNascimento = createDate("dataNascimento", java.time.LocalDate.class);

    public final QDependente dependente;

    public final BooleanPath doadorDeSangue = createBoolean("doadorDeSangue");

    public final StringPath email = createString("email");

    public final StringPath endereco = createString("endereco");

    public final EnumPath<Escolaridade> escolaridade = createEnum("escolaridade", Escolaridade.class);

    public final EnumPath<EstadoCivil> estadoCivil = createEnum("estadoCivil", EstadoCivil.class);

    public final QExpAnterior expAnterior;

    public final QFiliacao filiacao;

    public final EnumPath<Genero> genero = createEnum("genero", Genero.class);

    public final TimePath<java.time.LocalTime> horaEntrada = createTime("horaEntrada", java.time.LocalTime.class);

    public final NumberPath<Integer> horaExtra = createNumber("horaExtra", Integer.class);

    public final TimePath<java.time.LocalTime> horaSaida = createTime("horaSaida", java.time.LocalTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idioma = createString("idioma");

    public final StringPath matricula = createString("matricula");

    public final EnumPath<ModalidadeContratual> modalidadeContratual = createEnum("modalidadeContratual", ModalidadeContratual.class);

    public final StringPath nacionalidade = createString("nacionalidade");

    public final StringPath nome = createString("nome");

    public final StringPath PIS = createString("PIS");

    public final StringPath racaCor = createString("racaCor");

    public final StringPath redeSocial = createString("redeSocial");

    public final StringPath registroProficional = createString("registroProficional");

    public final StringPath religiao = createString("religiao");

    public final StringPath RG = createString("RG");

    public final NumberPath<Double> salario = createNumber("salario", Double.class);

    public final StringPath setor = createString("setor");

    public final StringPath sindicato = createString("sindicato");

    public final EnumPath<Status> status = createEnum("status", Status.class);

    public final StringPath telefone = createString("telefone");

    public final EnumPath<TipoConta> tipoConta = createEnum("tipoConta", TipoConta.class);

    public final EnumPath<TipoSanguineo> tipoSanguineo = createEnum("tipoSanguineo", TipoSanguineo.class);

    public final StringPath tituloEleitor = createString("tituloEleitor");

    public final EnumPath<Turno> turno = createEnum("turno", Turno.class);

    public QFuncionario(String variable) {
        this(Funcionario.class, forVariable(variable), INITS);
    }

    public QFuncionario(Path<? extends Funcionario> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFuncionario(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFuncionario(PathMetadata metadata, PathInits inits) {
        this(Funcionario.class, metadata, inits);
    }

    public QFuncionario(Class<? extends Funcionario> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargo = inits.isInitialized("cargo") ? new QCargo(forProperty("cargo")) : null;
        this.certificacao = inits.isInitialized("certificacao") ? new QCertificacao(forProperty("certificacao")) : null;
        this.dadoBancario = inits.isInitialized("dadoBancario") ? new QDadoBancario(forProperty("dadoBancario")) : null;
        this.dependente = inits.isInitialized("dependente") ? new QDependente(forProperty("dependente")) : null;
        this.expAnterior = inits.isInitialized("expAnterior") ? new QExpAnterior(forProperty("expAnterior"), inits.get("expAnterior")) : null;
        this.filiacao = inits.isInitialized("filiacao") ? new QFiliacao(forProperty("filiacao")) : null;
    }

}


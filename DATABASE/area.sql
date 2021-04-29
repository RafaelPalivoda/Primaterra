CREATE TABLE IF NOT EXISTS Area(
    IdArea SERIAL PRIMARY KEY NOT NULL,
    ValorGasto real,
    quantidadeLotes int,
    ObservacaoArea text,
    porcentagemPermuta int,
    quantidadePermuta int,
    valorPermuta real,
    IdTipoProjeto int,
    IdAreaInicial int,
    IdAreaAproveitada int,
    IdEntidade int,
    FOREIGN KEY (IdTipoProjeto) REFERENCES TipoProjeto (IdTipoProjeto),
    FOREIGN KEY (IdAreaInicial) REFERENCES AreaInicial (IdAreaInicial),
    FOREIGN KEY (IdAreaAproveitada) REFERENCES AreaAproveitada (IdAreaAproveitada)
    FOREIGN KEY (IdEntidade) REFERENCES Entidade (IdEntidade)
);
CREATE TABLE IF NOT EXISTS TipoProjeto(
    IdTipoProjeto SERIAL PRIMARY KEY NOT NULL,
    tipoProjeto varchar(100)
);
CREATE TABLE IF NOT EXISTS AreaInicial(
    IdAreaInicial SERIAL PRIMARY KEY NOT NULL,
    metragemInicial real,
    valorMetroInicial real
);
CREATE TABLE IF NOT EXISTS AreaFinal(
    IdAreaFinal SERIAL PRIMARY KEY NOT NULL,
    metragemFinal real,
    valorMetroFinal real
);
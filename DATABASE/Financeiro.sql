CREATE TABLE IF NOT EXISTS PlanoContas(
    IdPlanoContas SERIAL PRIMARY KEY NOT NULL,
    nomePlano varchar(50),
    IdEntrada int,
    IdSaida int,
    FOREIGN KEY (IdReceita) REFERENCES Receitas (IdReceita),
    FOREIGN KEY (IdDespesa) REFERENCES Despesas (IdDespesa),
);
CREATE TABLE IF NOT EXISTS CentroCusto(
    IdCentroCusto SERIAL PRIMARY KEY NOT NULL,
    nomeCentro varchar (100),
    IdTipoCusto int,
    IdEtapa int,
    FOREIGN KEY (IdCentroCusto) REFERENCES TipoCentro (IdTipoCentro)
    FOREIGN KEY (IdEtapa) REFERENCES Etapa (IdEtapa)
);
//Etapa vai servir para tabela Empreendimento e Centro de Custo
CREATE TABLE IF NOT EXISTS Etapa(
    IdEtapa SERIAL PRIMARY KEY NOT NULL,
    nomeEtapa varchar(100)
);
CREATE TABLE IF NOT EXISTS TipoCentro(
    IdTipoCentro SERIAL PRIMARY KEY NOT NULL,
    tipoCentro varchar(100)
);
CREATE TABLE IF NOT EXISTS Receitas(
    IdReceita SERIAL PRIMARY KEY NOT NULL,
    descricaoReceita varchar(100),
    valorEntrada real
);
CREATE TABLE IF NOT EXISTS Despesas(
    IdDespesa SERIAL PRIMARY KEY NOT NULL,
    descricaoDespesa varchar(100),
    valorSaida real
);
CREATE TABLE IF NOT EXISTS ContasPagar(
    <Identificador_Contas_Pagar> IdNota SERIAL PRIMARY KEY NOT NULL,
    nomeContasPagar varchar(100),
    numeroNf int,
    valorNota real,
    dtVencimento date,
    IdEmpreendimento int,
    IdPlanoContas int,
    IdCentroCusto int,
    IdIncorporadora int,
    rateio smallint,
    IdEntidade int,
    valorRateio real,
    dtAporte,
    FOREIGN KEY (IdEmpreendimento) REFERENCES Empreendimento (IdEmpreendimento),
    FOREIGN KEY (IdPlanoContas) REFERENCES PlanoContas (IdPlanoContas),
    FOREIGN KEY (IdCentroCusto) REFERENCES CentroCusto (IdCentroCusto),
    FOREIGN KEY (IdIncorporadora) REFERENCES Entidade (IdEntidade)
);
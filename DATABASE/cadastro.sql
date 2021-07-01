CREATE DATABASE Sistema;
CREATE TABLE IF NOT EXISTS Entidade(
    idEntidade SERIAL PRIMARY KEY NOT NULL ,
    codigoEntidade int,
    nome varchar(200),
    razaoSocial varchar(300),
    cnpjCpf int,
    rg int,
    dtFundacao int,
    isUsuario int,
    isTerreneiro int,
    isIncorporadora int,
    isPrestadorServiço int,
    isFornecedor int,
    isInvestidor int,
    sexo char,
    cargo varchar(50),
    dtCadastro date,
    codigoContato int,
    codigoEnquad int,
    codigoEndereco int,
    codigoContribuinte int,
    codigoIE int,
    idUsuario int,
    FOREIGN KEY (codigoContato) REFERENCES Contato (codigoContato),
    FOREIGN KEY (codigoEnquad) REFERENCES enquadFiscal(codigoEnquad),
    FOREIGN KEY (codigoEndereco) REFERENCES Endereco (codigoEndereco),
    FOREIGN KEY (codigoContribuinte) REFERENCES TipoContribuinte (codigoContribuinte),
    FOREIGN KEY (codigoIE) REFERENCES InscricaoEstadual (codigoIE),
    FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
);
CREATE TABLE IF NOT EXISTS Telefone(
    codigoTelefone SERIAL PRIMARY KEY NOT NULL ,
    ddd int,
    fixo int,
    celular int
);
CREATE TABLE IF NOT EXISTS enquadFiscal(
    codigoEnquad SERIAL PRIMARY KEY NOT NULL ,
    nomeEnquad varchar(200)
);
CREATE TABLE IF NOT EXISTS email(
    codigoEmail SERIAL PRIMARY KEY NOT NULL ,
    emailPrincipal varchar(300),
    emailSecundario varchar(300)
);
CREATE TABLE IF NOT EXISTS Contato(
    codigoContato SERIAL PRIMARY KEY NOT NULL ,
    codigoemail int,
    codigotelefone int,
    codigoemail int,
    codigotelefone int,
    FOREIGN KEY (codigoemail) REFERENCES email (codigoemail),
    FOREIGN KEY (codigotelefone) REFERENCES telefone (codigotelefone)
);
CREATE TABLE IF NOT EXISTS TipoContribuinte(
    codigoContribuinte SERIAL PRIMARY KEY NOT NULL ,
    tipoContribuinte varchar(100)
);
CREATE TABLE IF NOT EXISTS Endereco(
    codigoEndereco SERIAL PRIMARY KEY NOT NULL ,
    cep int,
    logradouro varchar(200),
    numero int,
    bairro varchar(200),
    cidade varchar(200),
    estado varchar(200),
    pais varchar(200),
    complemento varchar(50),
    codigotipoendereco int,
    FOREIGN KEY (codigoTipoEndereco) REFERENCES TipoEndereco (codigoTipoEndereco)
);
CREATE TABLE IF NOT EXISTS TipoEndereco(
    codigoTipoEndereco SERIAL PRIMARY KEY NOT NULL ,
    TipoEndereco varchar(100) 
);
CREATE TABLE IF NOT EXISTS InscricaoEstadual(
    codigoIE SERIAL PRIMARY KEY NOT NULL ,
    Inscricao int,
    codigoIes int,
    FOREIGN KEY (codigoIeS) REFERENCES InscricaoSubstituta (codigoIeS)
);
CREATE TABLE IF NOT EXISTS InscricaoSubstituta(
    codigoIeS SERIAL PRIMARY KEY NOT NULL ,
    InscricaoSubstituta int
);
CREATE TABLE IF NOT EXISTS Usuario(
    IdUsuario SERIAL PRIMARY KEY NOT NULL ,
    usuario NOT NULL UNIQUE varchar(50),
    senha varchar(50),
);
CREATE TABLE IF NOT EXISTS TipoProjeto(
    IdTipoProjeto SERIAL PRIMARY KEY NOT NULL ,
    TipoProjeto varchar(100)
);
CREATE TABLE IF NOT EXISTS TipoNegociacao(
    IdTipoNegociacao SERIAL PRIMARY KEY NOT NULL ,
    TipoNegociacao varchar(50)
);
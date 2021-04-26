CREATE DATABASE Sistema;
CREATE TABLE IF NOT EXISTS Entidade(
    idEntidade SERIAL primary key NOT NULL ,
    codigoEntidade int,
    nome varchar(200),
    razaoSocial varchar(300),
    cnpjCpf int,
    rg int,
    dtFundacao int,
    Usuario int,
    ProprietarioArea int,
    Incorporadora int,
    PrestadorServiço int,
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
    codigoTelefone SERIAL primary key NOT NULL ,
    ddd int,
    fixo int,
    celular int
);
CREATE TABLE IF NOT EXISTS enquadFiscal(
    codigoEnquad SERIAL primary key NOT NULL ,
    nomeEnquad varchar(200)
);
CREATE TABLE IF NOT EXISTS email(
    codigoEmail SERIAL primary key NOT NULL ,
    emailPrincipal varchar(300),
    emailSecundario varchar(300)
);
CREATE TABLE IF NOT EXISTS Contato(
    codigoContato SERIAL primary key NOT NULL ,
    codigoemail int,
    codigotelefone int,
    codigoemail int,
    codigotelefone int,
    FOREIGN KEY (codigoemail) REFERENCES email (codigoemail),
    FOREIGN KEY (codigotelefone) REFERENCES telefone (codigotelefone)
);
CREATE TABLE IF NOT EXISTS TipoContribuinte(
    codigoContribuinte SERIAL primary key NOT NULL ,
    tipoContribuinte varchar(100)
);
CREATE TABLE IF NOT EXISTS Endereco(
    codigoEndereco SERIAL primary key NOT NULL ,
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
    codigoTipoEndereco SERIAL primary key NOT NULL ,
    TipoEndereco varchar(100) 
);
CREATE TABLE IF NOT EXISTS InscricaoEstadual(
    codigoIE SERIAL primary key NOT NULL ,
    Inscricao int,
    codigoIes int,
    FOREIGN KEY (codigoIeS) REFERENCES InscricaoSubstituta (codigoIeS)
);
CREATE TABLE IF NOT EXISTS InscricaoSubstituta(
    codigoIeS SERIAL primary key NOT NULL ,
    InscricaoSubstituta int
);
CREATE TABLE IF NOT EXISTS Usuario(
    IdUsuario SERIAL primary key NOT NULL ,
    usuario NOT NULL UNIQUE varchar(50),
    senha varchar(50),
);
CREATE TABLE IF NOT EXISTS TipoProjeto(
    IdTipoProjeto SERIAL primary key NOT NULL ,
    TipoProjeto varchar(100)
);
CREATE TABLE IF NOT EXISTS TipoNegociacao(
    IdTipoNegociacao SERIAL primary key NOT NULL ,
    TipoNegociacao varchar(50)
);
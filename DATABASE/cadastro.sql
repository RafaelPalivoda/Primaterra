CREATE DATABASE Sistema;
CREATE TABLE IF NOT EXISTS Entidade(
    idEntidade int primary key NOT NULL AUTO_INCREMENT,
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
    FOREIGN KEY (codigoContato) REFERENCES (codigoContato),
    FOREIGN KEY (condigoEnquad) REFERENCES (codigoEnquad),
    FOREIGN KEY (codigoEndereco) REFERENCES (codigoEndereco),
    FOREIGN KEY (codigoContribuinte) REFERENCES (codigoContribuinte),
    FOREIGN KEY (codigoIE) REFERENCES (codigoIE),
    FOREIGN KEY (idUsuario) REFERENCES (idUsuario)
);
CREATE TABLE IF NOT EXISTS Telefone(
    codigoTelefone int primary key NOT NULL AUTO_INCREMENT,
    ddd int,
    fixo int,
    celular int
);
CREATE TABLE IF NOT EXISTS enquadFiscal(
    codigoEnquad int primary key NOT NULL AUTO_INCREMENT,
    nomeEnquad varchar(200)
);
CREATE TABLE IF NOT EXISTS email(
    codigoEmail int primary key NOT NULL AUTO_INCREMENT,
    emailPrincipal varchar(300),
    emailSecundario varchar(300)
);
CREATE TABLE IF NOT EXISTS Contato(
    codigoContato int primary key NOT NULL AUTO_INCREMENT,
    FOREIGN KEY (codigoEmail) REFERENCES (codigoEmail),
    FOREIGN KEY (codigoTelefone) REFERENCES (codigoTelefone)
);
CREATE TABLE IF NOT EXISTS TipoContribuinte(
    codigoContribuinte int primary key NOT NULL AUTO_INCREMENT,
    tipoContribuinte varchar(100)
);
CREATE TABLE IF NOT EXISTS Endereco(
    codigoEndereco int primary key NOT NULL AUTO_INCREMENT,
    cep int,
    logradouro varchar(200),
    numero int,
    bairro varchar(200),
    cidade varchar(200),
    estado varchar(200),
    pais varchar(200),
    complemento varchar(50),
    FOREIGN KEY (codigoTipoEndereco) REFERENCES (codigoTipoEndereco)
);
CREATE TABLE IF NOT EXISTS TipoEndereco(
    codigoTipoEndereco int primary key NOT NULL AUTO_INCREMENT,
    TipoEndereco varchar(100) 
);
CREATE TABLE IF NOT EXISTS InscricaoEstadual(
    codigoIE int primary key NOT NULL AUTO_INCREMENT,
    Inscricao int,
    FOREIGN KEY (codigoIeS) REFERENCES (codigoIeS)
);
CREATE TABLE IF NOT EXISTS InscricaoSubstituta(
    codigoIeS int primary key NOT NULL AUTO_INCREMENT,
    InscricaoSubstituta int,
);
CREATE TABLE IF NOT EXISTS Usuario(
    IdUsuario int primary key NOT NULL AUTO_INCREMENT,
    usuario NOT NULL UNIQUE varchar(50),
    senha varchar(50),
);
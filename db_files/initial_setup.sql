create database
  biblioteca;

use
  biblioteca;

create table
  cliente (
    id_cliente int not null unique auto_increment,
    nome varchar(100),
    data_nasc date,
    sexo ENUM("M", "F"),
    cpf varchar(11),
    endereco varchar(100),
    fone varchar(10),
    primary key (id_cliente)
  );

create table
  multa (
    id_multa int(10) not null auto_increment,
    id_cliente int(10),
    descricao varchar(60),
    valor decimal(6, 2),
    primary key (id_multa),
    foreign key (id_cliente) references cliente(id_cliente)
  );

create table
  livro (
    id_livro int(10) not null auto_increment,
    exemplar varchar(100),
    autor varchar(100),
    edicao tinyint(3),
    ano smallint(6),
    disponibilidade char(1),
    primary key(id_livro)
  );

create table
  emprestimo(
    id_emprestimo int(10) not null auto_increment,
    id_cliente int(10) not null,
    id_livro int(10) not null,
    data_emprestimo date,
    data_devolucao date,
    devolvido boolean default false,
    primary key (id_emprestimo),
    foreign key (id_cliente) references cliente(id_cliente),
    foreign key (id_livro) references livro(id_livro)
  );
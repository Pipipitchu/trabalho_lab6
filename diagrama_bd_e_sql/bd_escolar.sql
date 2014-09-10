drop schema public cascade;--reseta bd public perigo! matenha comentado
create schema public; --recria bd public

create sequence seq_user;
create table usuarios
(
	cod integer not null default nextval ('seq_user'),
	nome varchar(200) not null,
	senha varchar(15) not null,
	admin boolean,
	constraint pk_usuarios primary key(cod)
);

insert into usuarios(nome,senha,admin) values('admin','admin',true);
insert into usuarios(nome,senha,admin) values('neto','8',false);
insert into usuarios(nome,senha,admin) values('nicolas','1',false);
select * from usuarios;

create sequence seq_materia;
create table materia
(
	cod integer not null default nextval ('seq_materia'),
	nome varchar(200) not null,
	grade integer not null,--0=opcional,1=primeiro grau, 2=segundo grau,3=1 + 2 grau.
	constraint pk_materia primary key(cod)
);
insert into materia(nome,grade) values('Portugues',3);
insert into materia(nome,grade) values('Matematica',3);
insert into materia(nome,grade) values('Historia',3);
insert into materia(nome,grade) values('Geografia',3);
insert into materia(nome,grade) values('Fisica',2);
insert into materia(nome,grade) values('Quimica',2);
insert into materia(nome,grade) values('Ciencias',1);
insert into materia(nome,grade) values('Biologia',2);
insert into materia(nome,grade) values('Informatica',0);
insert into materia(nome,grade) values('Educacao Fisica',3);
insert into materia(nome,grade) values('Educacao Religiosa',0);
select * from materia;

create sequence seq_grade_1;
create table grade_1
(
	cod integer not null default nextval ('seq_grade_1'),
	nome varchar(200) not null,
	constraint pk_grade_1 primary key(cod)
);
insert into grade_1(nome) values('1º Ano');
insert into grade_1(nome) values('2º Ano');
insert into grade_1(nome) values('3º Ano');
insert into grade_1(nome) values('4º Ano');
insert into grade_1(nome) values('5º Ano');
insert into grade_1(nome) values('6º Ano');
insert into grade_1(nome) values('7º Ano');
insert into grade_1(nome) values('8º Ano');
insert into grade_1(nome) values('9º Ano');
--codigo para preencher a grade 3= obrigatório, 1=primeiro grau, 2=segundo grau, 0=opcional
select g.nome,m.cod,m.nome from grade_1 as g 
		join materia as m 
		on m.grade=3 or m.grade=1 or m.grade=0
where g.nome='1º Ano'
order by m.cod asc;

create sequence seq_grade_2;
create table grade_2
(
	cod integer not null default nextval ('seq_grade_2'),
	nome varchar(200) not null,
	constraint pk_grade_2 primary key(cod)
);
insert into grade_2(nome) values('1º Colegial');
insert into grade_2(nome) values('2º Colegial');
insert into grade_2(nome) values('3º Colegial');
select * from grade_2;

create sequence seq_prof;
create table professores(
	cod integer not null default nextval ('seq_prof'),
	nome varchar(200) not null,
	sexo varchar(15) not null,
	cidade varchar(200),
	estado varchar(20),
	pais varchar(30),
	estado_civil varchar(30),
	graduacao varchar(200),
	instituicao varchar(200),
	especializao varchar(400),
	area varchar(200),
	m_principal integer,
	m_secundaria integer,
	constraint pk_professores primary key(cod)
);

create sequence seq_mat;
create table materias_incl(
	cod integer not null default nextval ('seq_mat'),
	m1 integer,
	m2 integer,
	m3 integer,
	m4 integer,
	m5 integer,
	m6 integer,
	m7 integer,
	m8 integer,
	m9 integer,
	m10 integer,
	constraint pk_materia_incl primary key(cod)
);
create sequence seq_alu_1;
create table alunos(
	cod integer not null default nextval ('seq_alu_1'),
	nome varchar(200) not null,
	sexo varchar(15) not null,
	idade integer not null,
	n_mae varchar(200),
	cidade varchar(200),
	estado varchar(20),
	pais varchar(30),
	intercambio varchar(200),
	t_intercambio integer,
	ano integer,
	repetente varchar(5),
	qtd_rep integer,
	transferido varchar(5),
	bolsista varchar(5),
	fies varchar(5),
	pne varchar(5),
	grade integer,
	constraint pk_alunos primary key(cod),
	constraint fk_alunos foreign key(grade)
		references materias_incl(cod)
);
create sequence seq_notas_1;
create table notas_1(
	cod integer not null default nextval ('seq_notas_1'),
	bimestre integer not null,
	ano integer not null,
	aluno integer not null,
	materia integer not null,
	n1 integer,
	n2 integer,
	n3 integer,
	n4 integer,
	constraint pk_notas_1 primary key(cod,bimestre,ano,aluno,materia),
	constraint fk_aluno_1 foreign key(aluno)
		references alunos(cod),
	constraint fk_materia foreign key(materia)
		references materias_incl(cod)
);
--create sequence seq_alu_2;
--create table alunos_2g(
--	cod integer not null default nextval ('seq_alu_1'),
--	nome varchar(200) not null,
--	sexo varchar(15) not null,
--	idade integer not null,
--	n_mae varchar(200),
--	cidade varchar(200),
--	estado varchar(20),
--	pais varchar(30),
--	intercambio varchar(200),
--	t_intercambio int,
--	ano integer,
--	repetente varchar(5),
--	qtd_rep integer,
--	transferido varchar(5),
--	bolsista varchar(5),
--	fies varchar(5),
--	pne varchar(5),
--	constraint pk_alunos primary key(cod),
--	grade integer,
--	constraint pk_alunos primary key(cod),
--	constraint fk_alunos_2g foreign key(grade)
--		references materias_incl(cod)
--);


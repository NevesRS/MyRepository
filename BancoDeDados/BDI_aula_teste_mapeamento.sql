-- Banco de Dados II
-- Por Duncan Ruiz
--
-- Este arquivo contem script para testar o mapeamento desde UML ate SQL
--

-- tabela HISTORICO_ESCOLAR
Create table HISTORICO_ESCOLAR(
Curso char(4),
Nome_Curso varchar(60),
Disciplina char(8),
Denominacao varchar(60),
Turma char(3),
Ano_sem char(6),
Professor varchar(60),
Matricula numeric(8),
Nome varchar(60),
Sexo char(1),
Idade numeric(3),
Nota numeric(3,1));

-- carga de dados em cursos, DISCIPLINAS e ALUNOS
Insert into CURSOS values('98AJ','Ciencia da Computacao');
Insert into CURSOS values('98AH','Ciencia de Dados e Inteligencia Artificial');
Insert into CURSOS values('98AK','Engenharia da Computacao');
Insert into CURSOS values('98AL','Engenharia de Software');
Insert into CURSOS values('98AM','Sistemas de Informacao');

Insert into DISCIPLINAS values('4611C-06','Fundamentos de Programacao', 1 ,'98AJ');
Insert into DISCIPLINAS values('98H03-04','Introducao a Ciencia de Dados', 1 ,'98AH');
Insert into DISCIPLINAS values('95300-04','Calculo I', 1 ,'98AJ');
Insert into DISCIPLINAS values('98705-02','Introducao a Computacao', 1 ,'98AJ');
Insert into DISCIPLINAS values('95303-04','Matematica Discreta', 1 ,'98AJ');
Insert into DISCIPLINAS values('98707-02','Metodologia Cientifica', 1 ,'98AJ');
Insert into DISCIPLINAS values('1501A-04','Etica e Cidadania', 1 ,'98AJ');

Insert into DISCIPLINAS values('95301-04','Calculo II', 2 ,'98AJ');
Insert into DISCIPLINAS values('4646B-04','Fundamentos de Sistemas Digitais', 2 ,'98AJ');
Insert into DISCIPLINAS values('4611E-04','Logica para Computacao', 2 ,'98AJ');
Insert into DISCIPLINAS values('4645G-04','Algoritmos e Estrutura de Dados I', 2 ,'98AJ');
Insert into DISCIPLINAS values('4611F-04','Programacao Orientada a Objetos', 2 ,'98AJ');
Insert into DISCIPLINAS values('98901-04','Banco de Dados I', 2 ,'98AJ');
Insert into DISCIPLINAS values('98800-04','Fundamentos de Sistemas Computacionais', 2 ,'98AH');
Insert into DISCIPLINAS values('98H04-06','Programacao Orientada a Dadps', 2 ,'98AH');
Insert into DISCIPLINAS values('95304-04','Probabilidade e Estatística', 2 ,'98AH');


Insert into DISCIPLINAS values('4645H-04','Algoritmos e Estruturas de Dados II', 3 ,'98AJ');
Insert into DISCIPLINAS values('98902-02','Banco de Dados II', 3 ,'98AJ');
Insert into DISCIPLINAS values('46515-04','Linguagens, Automatos e Computacao', 3 ,'98AJ');
Insert into DISCIPLINAS values('98G03-04','Organizacao e Arquitetura de Processadores', 3 ,'98AJ');
Insert into DISCIPLINAS values('98701-04','Programacao de Baixo Nivel', 3 ,'98AJ');
Insert into DISCIPLINAS values('98702-04','Pratica em Pesquisa', 3 ,'98AJ');
Insert into DISCIPLINAS values('98H01-04','Coleta, Preparacao e Analise de Dados', 3 ,'98AH');
Insert into DISCIPLINAS values('98F29-04','Inferencia Comparada', 3 ,'98AJ');
Insert into DISCIPLINAS values('98F33-04','Algebra Linear e Matricial', 3 ,'98AJ');

Insert into DISCIPLINAS values('98716-04','Computacao Grafica', 4 ,'98AJ');
Insert into DISCIPLINAS values('98801-04','Engenharia de Software I', 4 ,'98AJ');
Insert into DISCIPLINAS values('4636H-04','Fundamentos de Desenvolvimento de Software', 4 ,'98AJ');
Insert into DISCIPLINAS values('98713-04','Fundamentos de Processamento Paralelo e Distribuido', 4 ,'98AJ');
Insert into DISCIPLINAS values('98H00-04','Infraestrutura para Gestao de Dados', 4 ,'98AH');
Insert into DISCIPLINAS values('98703-02','Programacao Funcional', 4 ,'98AJ');
Insert into DISCIPLINAS values('95302-04','Algebra Linear e Geometria Analitica', 4 ,'98AJ');
Insert into DISCIPLINAS values('98F30-04','Analise Multivariada', 4 ,'98AH');
Insert into DISCIPLINAS values('98H05-04','Aprendizado Supervisionado', 4 ,'98AH');
Insert into DISCIPLINAS values('4117D-04','Calculo III', 4 ,'98AH');
Insert into DISCIPLINAS values('98708-04','Inteligencia Artificial', 4 ,'98AH');

Insert into DISCIPLINAS values('11521-04','Humanismo e Cultura Religiosa', 8 ,'98AJ');

Insert into ALUNOS values(13106842,'Jovana da Silva','F',26,'98AH');
Insert into ALUNOS values(14103839,'Eduardo da Silva','M',22,'98AJ');
Insert into ALUNOS values(14108293,'Marcelo da Silva','M',22,'98AJ');
Insert into ALUNOS values(14112046,'Tiago da Silva','M',22,'98AJ');
Insert into ALUNOS values(14112192,'Vanessa da Silva','F',23,'98AJ');
Insert into ALUNOS values(14201018,'Carla da Silva','F',21,'98AJ');
Insert into ALUNOS values(14206067,'Rogerio da Silva','M',22,'98AJ');
Insert into ALUNOS values(15280018,'Solange da Silva','F',26,'98AJ');
Insert into ALUNOS values(15280023,'Marcelo da Silva','M',23,'98AJ');
Insert into ALUNOS values(15280027,'Katia da Silva','F',20,'98AJ');
Insert into ALUNOS values(16104543,'Marcos da Silva','M',26,'98AH');

-- 
Insert into PROFESSORES values('98705-02','010','2021/2','Ana Paula',1);
Insert into PROFESSORES values('98705-02','010','2022/1','Ana Paula',1);
Insert into PROFESSORES values('98705-02','010','2022/2','Ana Paula',1);
Insert into PROFESSORES values('98705-02','010','2023/1','Ana Paula',1);
Insert into PROFESSORES values('98705-02','010','2023/2','Ana Paula',1);
Insert into PROFESSORES values('98705-02','012','2022/2','Ana Paula',1);
Insert into PROFESSORES values('98705-02','012','2023/2','Ana Paula',1);
Insert into PROFESSORES values('4611C-06','010','2021/2','Yamaguti',1);
Insert into PROFESSORES values('4611C-06','010','2022/1','Yamaguti',1);
Insert into PROFESSORES values('4611C-06','010','2023/1','Bastos',1);
Insert into PROFESSORES values('4611C-06','010','2023/2','Bastos',1);
Insert into PROFESSORES values('4611C-06','012','2021/2','Afonso',1);
Insert into PROFESSORES values('4611C-06','012','2023/1','Yamaguti',1);
Insert into PROFESSORES values('4611C-06','012','2023/2','Yamaguti',1);
Insert into PROFESSORES values('98H04-06','010','2022/2','Afonso',1);
Insert into PROFESSORES values('98H04-06','010','2023/1','Afonso',1);
Insert into PROFESSORES values('98H04-06','010','2023/2','Afonso',1);
Insert into PROFESSORES values('98H03-04','010','2021/2','Karin',1);
Insert into PROFESSORES values('98H03-04','010','2022/1','Karin',1);
Insert into PROFESSORES values('98H03-04','010','2022/2','Karin',1);
Insert into PROFESSORES values('98H03-04','010','2023/1','Karin',1);
Insert into PROFESSORES values('98H03-04','010','2023/2','Karin',1);
Insert into PROFESSORES values('98H03-04','012','2022/2','Duncan',1);
Insert into PROFESSORES values('98H03-04','012','2023/1','Duncan',1);
Insert into PROFESSORES values('98H03-04','012','2023/2','Duncan',1);
Insert into PROFESSORES values('4645H-04','010','2022/2','Arruda',1);
Insert into PROFESSORES values('4645H-04','010','2023/1','Arruda',1);
Insert into PROFESSORES values('4645H-04','010','2023/2','Arruda',1);
Insert into PROFESSORES values('4645G-04','010','2022/1','Hubert',1);
Insert into PROFESSORES values('4645G-04','010','2022/2','Hubert',1);
Insert into PROFESSORES values('4645G-04','010','2023/2','Hubert',1);
Insert into PROFESSORES values('98901-04','010','2023/1','Egidio',1);
Insert into PROFESSORES values('98901-04','010','2023/2','Arruda',1);
Insert into PROFESSORES values('98801-04','010','2023/1','Arruda',1);

-- 
-- carga de dados em HISTORICO
Insert into HISTORICO values(14108293,'98705-02','010','2021/2',6);
Insert into HISTORICO values(14112046,'98705-02','010','2021/2',6);
Insert into HISTORICO values(14112192,'98705-02','010','2021/2',8);
Insert into HISTORICO values(14103839,'98705-02','010','2021/2',9);
Insert into HISTORICO values(15280023,'98705-02','010','2021/2',9);
Insert into HISTORICO values(13106842,'98705-02','010','2022/1',8);
Insert into HISTORICO values(14206067,'98705-02','010','2022/1',9);
Insert into HISTORICO values(14201018,'98705-02','010','2022/2',8);
Insert into HISTORICO values(15280018,'98705-02','012','2022/2',9);
Insert into HISTORICO values(15280027,'98705-02','010','2022/2',4);
Insert into HISTORICO values(15280027,'98705-02','010','2023/1',7);
Insert into HISTORICO values(14108293,'4611C-06','012','2021/2',6);
Insert into HISTORICO values(14112046,'4611C-06','010','2021/2',5);
Insert into HISTORICO values(14112192,'4611C-06','010','2021/2',7);
Insert into HISTORICO values(14103839,'4611C-06','010','2022/1',6);
Insert into HISTORICO values(14201018,'4611C-06','010','2023/1',8);
Insert into HISTORICO values(14206067,'4611C-06','012','2023/1',8);
Insert into HISTORICO values(14108293,'98H04-06','010','2022/2',9);
Insert into HISTORICO values(14112046,'98H04-06','010','2023/1',9);
Insert into HISTORICO values(14112192,'98H04-06','010','2023/1',8);
Insert into HISTORICO values(14108293,'98H03-04','010','2021/2',8);
Insert into HISTORICO values(14112046,'98H03-04','010','2021/2',8);
Insert into HISTORICO values(14112192,'98H03-04','010','2021/2',3);
Insert into HISTORICO values(14103839,'98H03-04','010','2022/1',5);
Insert into HISTORICO values(14112192,'98H03-04','010','2022/1',7);
Insert into HISTORICO values(13106842,'98H03-04','012','2022/2',7);
Insert into HISTORICO values(14206067,'98H03-04','012','2022/2',9);
Insert into HISTORICO values(15280023,'98H03-04','010','2022/2',7);
Insert into HISTORICO values(14201018,'98H03-04','012','2023/1',8);
Insert into HISTORICO values(15280018,'98H03-04','010','2023/1',8);
Insert into HISTORICO values(14108293,'4645H-04','010','2022/2',7);
Insert into HISTORICO values(14112046,'4645H-04','010','2022/2',9);
Insert into HISTORICO values(14112192,'4645H-04','010','2023/1',6);
Insert into HISTORICO values(14108293,'4645G-04','010','2022/1',8);
Insert into HISTORICO values(14112046,'4645G-04','010','2022/1',7);
Insert into HISTORICO values(14103839,'4645G-04','010','2022/2',7);
Insert into HISTORICO values(14112192,'4645G-04','010','2022/2',5);
Insert into HISTORICO values(14108293,'98901-04','010','2023/1',7);
Insert into HISTORICO values(14112046,'98901-04','010','2023/1',6);
Insert into HISTORICO values(14108293,'98801-04','010','2023/1',8);

-- 
insert into HISTORICO_ESCOLAR
select CURSOS.Curso, Nome_Curso, Disciplina, Denominacao, Turma, Ano_Sem, Professor, 
        Matricula, Nome, Sexo, Idade, Nota
from CURSOS join Disciplinas on CURSOS.Curso = DISCIPLINAS.Curso
join Professores using(Disciplina)
join Historico using (Disciplina, Turma, Ano_Sem)
join Alunos using (Matricula);

insert into HISTORICO_ESCOLAR (Curso, Nome_Curso, Matricula, Nome, Sexo, Idade)
select Curso, Nome_Curso, Matricula, Nome, Sexo, Idade
from CURSOS join Alunos using(Curso)
where matricula not in
(select matricula from HISTORICO_ESCOLAR
 where matricula is not null);

insert into HISTORICO_ESCOLAR (Curso, Nome_Curso, Disciplina, Denominacao, Turma, Ano_sem, Professor)
select Curso, Nome_Curso, Disciplina, Denominacao, Turma, Ano_sem, Professor
from CURSOS join Disciplinas using(Curso)
join PROFESSORES using(Disciplina)
where (Disciplina, Turma, Ano_sem, Professor) not in
(select Disciplina, Turma, Ano_sem, Professor from HISTORICO_ESCOLAR
 where Disciplina is not null or Turma is not null or Ano_Sem is not null);

insert into HISTORICO_escolar (Curso, Nome_Curso, Disciplina, Denominacao)
select Curso, Nome_Curso, Disciplina, Denominacao
from CURSOS join Disciplinas using(Curso)
where Disciplina not in
(select Disciplina from HISTORICO_ESCOLAR
 where Disciplina is not null);

commit;
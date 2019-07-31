create database carrinho;

use carrinho;

create table tabProduto (
  id int not null AUTO_INCREMENT,
  nome varchar(100),
  descricao varchar(200),
  preco decimal(6,2),
  imagem varchar(100),
  primary key(id)
);
	
insert into tabProduto(id, nome, descricao, preco, imagem) 
  values (1, 'Mitsubish Eclipse', 'Mitsubish Eclipse Ano 2001 em otimo estado de conservacao', 40000.00, 'imagens/figId1.jpg');
insert into tabProduto(id, nome, descricao, preco, imagem) 
  values (2, 'Ferrari GST05', 'Ferrari GST05 Ano 1999 pintura metalica vermelho', 35000.00, 'imagens/figId2.jpg');
insert into tabProduto(id, nome, descricao, preco, imagem) 
  values (3, 'Eclipse S2', 'Eclipse S2 Ano 1998, 45326 Km, Unico Dono', 29000.00, 'imagens/figId3.jpg');
insert into tabProduto(id, nome, descricao, preco, imagem) 
  values (4, 'Ferrari F50', 'Ferrari F50 Ano 2004, 0 Km, pagto a Vista', 95000.00, 'imagens/figId4.jpg');
insert into tabProduto(id, nome, descricao, preco, imagem) 
  values (5, 'Ferarri', 'Ferrari Ano 2004, novo modelo, otimo desempenho', 29000.00, 'imagens/figId3.jpg');

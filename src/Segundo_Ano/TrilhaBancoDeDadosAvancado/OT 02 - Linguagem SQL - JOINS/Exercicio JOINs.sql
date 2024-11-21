-- Selecione todos campos das vendas, onde o produto “Escova dental” tenha sido vendido;

SELECT v.idvenda, v.data_venda FROM vendas v JOIN vendas_has_produto vp ON v.idvenda=vp.idvenda JOIN produto p ON p.idproduto=vp.idproduto WHERE p.descricao='Escova dental';

-- Selecione a data das vendas onde o produto “Creme dental” tenha sido vendido

SELECT v.data_venda FROM vendas v JOIN vendas_has_produto vp ON v.idvenda=vp.idvenda JOIN produto p ON vp.idproduto=p.idproduto WHERE descricao='Creme dental';

-- Selecione somente a descrição dos produtos da venda que ocorreu no dia “23/01”

SELECT p.descricao, v.data_venda FROM produto p JOIN vendas_has_produto vp ON p.idproduto=vp.idproduto JOIN vendas v ON vp.idvenda=v.idvenda WHERE v.data_venda='2021-01-23';

-- Selecione a descrição todas as categorias de produtos que foram vendidos

SELECT DISTINCT c.descricao FROM categoria c JOIN produto p ON p.idcategoria=c.idcategoria JOIN vendas_has_produto vp ON vp.idproduto=p.idproduto WHERE p.idcategoria=c.idcategoria;

-- Selecione todas as vendas que não sejam da categoria “Higiene pessoal’

SELECT v.idvenda,v.data_venda FROM vendas v JOIN vendas_has_produto vp ON vp.idvenda=v.idvenda JOIN produto p ON p.idproduto=vp.idproduto JOIN categoria c ON c.idcategoria=p.idcategoria WHERE c.idcategoria!=1;






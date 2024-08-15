use bdcoldigo ;
create database if not exists bdcoldigo default character set utf8;
create table if not exists marcas ( id int unsigned not null auto_increment, nome varchar(45) not null, primary key (id));
CREATE TABLE IF NOT EXISTS produtos (id INT(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, categoria TINYINT(1) UNSIGNED NOT NULL, modelo VARCHAR(45) NOT NULL, capacidade INT(4) UNSIGNED NOT NULL, valor DECIMAL(7,2) UNSIGNED NOT NULL, marcas_id INT UNSIGNED NOT NULL, PRIMARY KEY (id), INDEX fk_produtos_marcas_idx (marcas_id ASC), CONSTRAINT fk_produtos_marcas FOREIGN KEY (marcas_id) REFERENCES marcas(id));
INSERT INTO marcas VALUES (1, "Electrolux"),(2, "Samsung"), (3,"LG"); 

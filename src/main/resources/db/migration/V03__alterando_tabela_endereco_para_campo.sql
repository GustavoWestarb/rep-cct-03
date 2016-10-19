ALTER TABLE tb_pessoa DROP FOREIGN KEY fk_TB_Pessoa_TB_Endereco1;
ALTER TABLE tb_pessoa DROP COLUMN end_id;
DROP TABLE tb_endereco;
ALTER TABLE tb_pessoa ADD COLUMN pes_endereco VARCHAR(450);
ALTER TABLE tb_pessoa DROP FOREIGN KEY fk_TB_Pessoa_TB_Endereco1;
DROP TABLE tb_endereco;
ALTER TABLE tb_pessoa ADD COLUMN pes_endereco VARCHAR(450);
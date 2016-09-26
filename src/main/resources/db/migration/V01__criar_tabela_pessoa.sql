CREATE TABLE tb_pessoa (
	pes_id BIGINT(40) PRIMARY KEY AUTO_INCREMENT,
	pes_nome VARCHAR(70) NOT NULL,
	pes_nomeSoc VARCHAR(70),
	pes_dataNasc DATE NOT NULL,
	pes_isAluno INT,
	pes_isProfessor INT,
	pes_isCoordenador INT,
	pes_isSecretaria INT

) ENGINE=InnoDB DEFAULT CHARSET=utf8;
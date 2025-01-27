CREATE TABLE credenciais (
    id BIGSERIAL PRIMARY KEY,
    nomeUsuario VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    uri VARCHAR(100),
    descricao VARCHAR(100),
    ativo BOOLEAN DEFAULT true
);
CREATE TABLE products (
    id          BIGSERIAL       NOT NULL,
    product_id  UUID            NOT NULL,
    name        VARCHAR(128)    NOT NULL,
    description TEXT            NULL,
    price       NUMERIC         NULL,

    PRIMARY KEY (id)
);

CREATE INDEX product_id ON products (name);
CREATE INDEX idx_name ON products (name);
CREATE TABLE products (
    product_id  UUID            NOT NULL,
    name        VARCHAR(128)    NOT NULL,
    description TEXT            NULL,
    price       NUMERIC         NULL,

    PRIMARY KEY (product_id)
);

CREATE INDEX idx_name ON products (name);
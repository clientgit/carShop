# --- First database schema

# --- !Ups
CREATE TABLE brand
(
    name character varying(50) NOT NULL,
    country character varying(50) NOT NULL,
    PRIMARY KEY (name)
);

CREATE TABLE model
(
    name character varying(50) NOT NULL,
    yearStart integer NOT NULL,
    yearEnd integer NOT NULL,
    PRIMARY KEY (name)
);

CREATE TABLE store
(
    brand_name character varying(50) NOT NULL REFERENCES brand,
    model_name character varying(50) NOT NULL REFERENCES model,
    year_created integer NOT NULL,
    milage integer NOT NULL,
    price integer NOT NULL,
    PRIMARY KEY (brand_name, model_name)
);


# --- !Downs
DROP TABLE IF EXISTS brand;
DROP TABLE IF EXISTS model;
DROP TABLE IF EXISTS store;
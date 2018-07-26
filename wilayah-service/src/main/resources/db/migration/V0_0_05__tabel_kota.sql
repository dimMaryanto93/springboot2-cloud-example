create table m_kota_kab (
  id          bigint not null primary key auto_increment,
  id_propinsi bigint,
  nama        varchar(75)
)
  engine = InnoDB;

alter table m_kota_kab
  add constraint fk_provinsi_id foreign key (id_propinsi)
references m_provinsi (id);
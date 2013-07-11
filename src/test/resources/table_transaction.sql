create table if not exists transaction (
  id int(11) NOT NULL,
  accountNumber varchar(100) NOT NULL,
  timeStamp float NOT NULL,
  amount float DEFAULT NULL,
  description varchar(10) DEFAULT NULL,
  PRIMARY KEY (id)
)

  CREATE KEYSPACE oter
  WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

  create table service(
      numberId text,
      provider text,
      service text,
      data text,
      created timestamp,
      lastChanged timestamp,
      PRIMARY KEY (numberId, provider, service)
  	);

insert into oter.service(fonr,provider,service,data,created,lastChanged) values (10049047105,'kartverket','hentEiendom','<xml>somexml</xml>',dateof(now()),dateof(now()));

o
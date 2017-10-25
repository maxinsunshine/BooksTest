prompt PL/SQL Developer import file
prompt Created on 2016��12��7�� by 52605
set feedback off
set define off
prompt Creating BOOKINFO...
create table BOOKINFO
(
  id         NUMBER not null,
  booktypeid NUMBER,
  bookname   VARCHAR2(30),
  author     VARCHAR2(30),
  price      NUMBER(6,2)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table BOOKINFO
  add constraint PR_ID primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating BOOKTYPEINFO...
create table BOOKTYPEINFO
(
  id           NUMBER not null,
  booktypename VARCHAR2(30)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table BOOKTYPEINFO
  add constraint BOOKTYPE_ID primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Loading BOOKINFO...
insert into BOOKINFO (id, booktypeid, bookname, author, price)
values (2, 5, '����è', '���Ӳ�����', 35.5);
insert into BOOKINFO (id, booktypeid, bookname, author, price)
values (3, 2, 'Сʱ��2', '������', 20.5);
insert into BOOKINFO (id, booktypeid, bookname, author, price)
values (23, 2, 'Сʱ��1', '������', 20.5);
insert into BOOKINFO (id, booktypeid, bookname, author, price)
values (41, 2, '˭���ഺ����ã', '��ͬ', 42);
insert into BOOKINFO (id, booktypeid, bookname, author, price)
values (43, 5, '����è', '���Ӳ�����3', 35.5);
commit;
prompt 5 records loaded
prompt Loading BOOKTYPEINFO...
insert into BOOKTYPEINFO (id, booktypename)
values (1, '���');
insert into BOOKTYPEINFO (id, booktypename)
values (2, '��ѧ');
insert into BOOKTYPEINFO (id, booktypename)
values (3, '��ѧ');
insert into BOOKTYPEINFO (id, booktypename)
values (4, '����');
insert into BOOKTYPEINFO (id, booktypename)
values (5, '����');
commit;
prompt 5 records loaded
set feedback on
set define on
prompt Done.

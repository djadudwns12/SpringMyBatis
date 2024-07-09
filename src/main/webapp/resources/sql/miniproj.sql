use dev_tk;

-- 회원테이블 생성
CREATE TABLE `dev_tk`.`member` (
  `userid` VARCHAR(8) NOT NULL,
  `userPwd` VARCHAR(200) NOT NULL,
  `userName` VARCHAR(12) NULL,
  `mobile` VARCHAR(13) NULL,
  `email` VARCHAR(50) NULL,
  `registerDate` DATETIME NULL DEFAULT now(),
  `userImgmember` VARCHAR(50) NULL DEFAULT 'avatar.png',
  PRIMARY KEY (`userid`),
  UNIQUE INDEX `mobie_UNIQUE` (`mobile` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
COMMENT = '회원테이블';

-- 회원테이블 수정(회원포인트 컬럼 추가 수정)
ALTER TABLE `dev_tk`.`member` 
ADD COLUMN `userPoint` INT NULL DEFAULT 100 AFTER `userImg`;

-- DB서버에 현재날짜와 현재 시간을 출력하는 쿼리문
select now();


-- member 테이블에 회원을 insert하는 쿼리문
insert into member(userid,userPwd,userName,mobile,email) values(?,sha1(md5(?)),?,?,?);


select md5('1234');
select sha('1234');

select sha1(md5('1234'));

-- userid로 해당 유저의 정보를 검색하는 쿼리문
select * from member Where userid = ?;

-- member테이블의 모든 회원정보를 검색하는쿼리문
select * from member;


-- update dooly 회원의 이메일을 수정하는 쿼리문alter
update member set email = 'dooly@aaaaa.com' where userid = 'dooly';

-- dooly 회원의 전화번호를을 수정하는 쿼리문
update member set mobile = '010-3456-7777' where userid = 'dooly';




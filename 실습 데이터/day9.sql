SELECT *
FROM member a, cart b, prod c
WHERE a.mem_id = b.cart_member(+)
AND b.cart_prod = c.prod_id(+)
order by 6 desc;

/*위에꺼 ANSI OUTER JOIN*/
SELECT *
FROM member a
LEFT OUTER JOIN cart b
ON(a.mem_id = b.cart_member)
LEFT OUTER JOIN prod c
ON(b.cart_prod = c.prod_id);

CREATE TABLE exp_goods_asia (
       country VARCHAR2(10),
       seq     NUMBER,
       goods   VARCHAR2(80));

INSERT INTO exp_goods_asia VALUES ('한국', 1, '원유제외 석유류');
INSERT INTO exp_goods_asia VALUES ('한국', 2, '자동차');
INSERT INTO exp_goods_asia VALUES ('한국', 3, '전자집적회로');
INSERT INTO exp_goods_asia VALUES ('한국', 4, '선박');
INSERT INTO exp_goods_asia VALUES ('한국', 5,  'LCD');
INSERT INTO exp_goods_asia VALUES ('한국', 6,  '자동차부품');
INSERT INTO exp_goods_asia VALUES ('한국', 7,  '휴대전화');
INSERT INTO exp_goods_asia VALUES ('한국', 8,  '환식탄화수소');
INSERT INTO exp_goods_asia VALUES ('한국', 9,  '무선송신기 디스플레이 부속품');
INSERT INTO exp_goods_asia VALUES ('한국', 10,  '철 또는 비합금강');

INSERT INTO exp_goods_asia VALUES ('일본', 1, '자동차');
INSERT INTO exp_goods_asia VALUES ('일본', 2, '자동차부품');
INSERT INTO exp_goods_asia VALUES ('일본', 3, '전자집적회로');
INSERT INTO exp_goods_asia VALUES ('일본', 4, '선박');
INSERT INTO exp_goods_asia VALUES ('일본', 5, '반도체웨이퍼');
INSERT INTO exp_goods_asia VALUES ('일본', 6, '화물차');
INSERT INTO exp_goods_asia VALUES ('일본', 7, '원유제외 석유류');
INSERT INTO exp_goods_asia VALUES ('일본', 8, '건설기계');
INSERT INTO exp_goods_asia VALUES ('일본', 9, '다이오드, 트랜지스터');
INSERT INTO exp_goods_asia VALUES ('일본', 10, '기계류');

COMMIT;

SELECT goods
FROM exp_goods_asia
where country = '한국'
union  --합 집합(합쳐지면서 중복을 제거함)
SELECT goods
FROM exp_goods_asia
where country = '일본';

SELECT seq, goods
FROM exp_goods_asia
where country = '한국'
union  --합 집합(합쳐지면서 중복을 제거함)
SELECT seq, goods
FROM exp_goods_asia
where country = '일본'
union  --행을  이렇게 그냥 붙일수도있음
select 10, '컴퓨터'
FROM dual;

SELECT goods
FROM exp_goods_asia
where country = '한국'
union ALL  --전체를 다 더해줌(중복 제거는안됨)
SELECT goods
FROM exp_goods_asia
where country = '일본';

SELECT goods
FROM exp_goods_asia
where country = '한국'
INTERSECT  --교집함(공통된 애들만 나타냄)
SELECT goods
FROM exp_goods_asia
where country = '일본';

SELECT goods
FROM exp_goods_asia
where country = '한국'
except --차집합(위에꺼에서 아래꺼 뺌)
SELECT goods
FROM exp_goods_asia
where country = '일본';

-- 합집합 예시
-- oracle 집합은 출력 컬럼의 수와 타입이 같아야함.
-- 정령은 마지막 select문에만 사용
SELECT To_CHAR(department_id) as 부서
      , COUNT(*) 부서별직원수
FROM employees
GROUP BY department_id
UNION
SELECT '전체'
    ,COUNT(*) AS 전체직원수
    FROM employees;
 
-- EXISTS로 존재하는지 않하는지 알 수 있게 한다. 
-- 세미 조인이라고도 함.
-- job_history 테이블에 존재하는 부서출력
SELECT a.department_id
 , a.department_name
 FROM departments a
 WHERE EXISTS (SELECT * --select는 의미없음 where의 내용에 해당되는 데이터가 존재하는지만 체크
                FROM job_history b
                WHERE a.department_id = b.department_id);

-- job_history 테이블에 존재하는 않는 부서 출력
SELECT a.department_id
 , a.department_name
 FROM departments a
 WHERE  NOT EXISTS (SELECT * --select는 의미없음 where의 내용에 해당되는 데이터가 존재하는지만 체크
                FROM job_history b
                WHERE a.department_id = b.department_id);
                
-- 수강내역이 없는 학생조회
SELECT *
FROM 학생 a
WHERE NOT EXISTS (SELECT *
                    FROM 수강내역 b
                    WHERE b.학번 = a.학번);

/* 정규 표현식 '검색', '치환' 하는 과정을 간편하게 처리 할 수 있도록 하는수단.
    oracle은 10g부터 사용
    (JAVA, python, JS 다 정규표현식 사용가능) 조금씩 다름
    .(dot) or []은 모두 문자 1글자를 의미함
    ^ <-- 시작을 의미함 ^[0-9] <-- 숫자로 시작하는 ^q <-q로 시작하는
    [^0-9] <-- 대괄호 안의 ^ <-- not을 의미함
*/
--REGEXP_LIKE : 정규식 패턴을 검색
SELECT *
FROM member
WHERE  REGEXP_LIKE(mem_comtel, '^..-');

--영문자 3번 출현 후 @패턴(abc@gmail.com)
SELECT *
FROM member
WHERE  REGEXP_LIKE(mem_mail ,'^[a-zA-Z]{3}@');

/* 반복시퀀스
 * : 0개이상
 + : 1개이상
 ? : 0,1개
 {n} : n번
 {n,} : n번 이상
 {n,m} : n번이상 m번이하
 */
 SELECT *
FROM member
WHERE  REGEXP_LIKE(mem_mail ,'^[a-zA-Z]{3,5}@');

-- mem_add2 문자띄어쓰기문자 패턴의 데이터를 출력하시오
SELECT mem_name
    , mem_add2
FROM member
WHERE REGEXP_LIKE(mem_add2,'. .'); --어느 문자든 

SELECT mem_name
    , mem_add2
FROM member
WHERE REGEXP_LIKE(mem_add2,'[가-힣] [0-9]'); --한글

SELECT mem_name
    , mem_add2
FROM member
WHERE REGEXP_LIKE(mem_add2,'[가-힣]$'); --한글 끝나는 $ -> q$ -> q로끝나는

--한글만 있는 주소검색
SELECT mem_name
    , mem_add2
FROM member
WHERE REGEXP_LIKE(mem_add2,'^[가-힣]+$');

--한글이 없는 주소검색
SELECT mem_name
    , mem_add2
FROM member
WHERE REGEXP_LIKE(mem_add2,'^[^가-힣]+$');

-- | <--또는
-- () <-- 패턴그룹
-- J로시작하며, 세번째 문자가 M또는 N인 직원이름 조회
SELECT emp_name
FROM employees
WHERE REGEXP_LIKE(emp_name, '^J.(n|m)');

--REGEXP_SUBSTR 정규표현식 패턴을 일치하는 문자열 반환
-- 이메일 @를 기준으로 앞과 뒤를 출력하시오
                                --패턴, 시작위치, 매칭순번
SELECT REGEXP_SUBSTR(mem_mail, '[^@]+',1,1) as mem_id
    , REGEXP_SUBSTR(mem_mail, '[^@]+',1,2) as mem_domain
FROM member;
--예시
SELECT REGEXP_SUBSTR('A-B-C', '[^-]+', 1, 1) AS a
    , REGEXP_SUBSTR('A-B-C', '[^-]+', 1, 2) AS b
    ,REGEXP_SUBSTR('A-B-C', '[^-]+', 1, 3) AS c
from dual;
SELECT REGEXP_SUBSTR('pang su hi 1234','[0-9]') --default 1,1
    ,REGEXP_SUBSTR('pang su hi 1234','[^0-9]')
    ,REGEXP_SUBSTR('pang su hi 1234','[^0-9]+')
FROM dual;

--띄어쓰기를 기준으로 2번째 출현하는 주소를 출력하시오
--한글 기준으로 2번재 출현하는 주소를 출력하시오
select REGEXP_SUBSTR(mem_add1,'[^ ]+',1,2) AS 중간
    ,REGEXP_SUBSTR(mem_add1,'[가-힝]+',1,2) AS 중간2
from member;

--  8~ 14 사이 텍스트 만족하는 데이터 출력
SELECT*
FROM(
    SELECT 'abcd1234' as id FROM dual
    UNION
    SELECT 'Abcd123456' as id FROM dual
    UNION
    SELECT 'A1234' as id FROM dual
    UNION
    SELECT 'A123456789cdefg' as id FROM dual
)
where REGEXP_LIKE(id,'^[a-zA-Z0-9]{8,14}$');


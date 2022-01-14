-- 그룹함수
-- count(): 데이터 수
select count(ename), count(comm), count(deptno) from emp;
select * from emp;
-- 10번부서의 사원수
select count(ename) from emp where deptno=10;
--담당업무가 'MANAGER'이거나 'SALESMAN'인 사원의 수
select count(ename) from emp where job='MANAGER' or job='SALESMAN';
--사원중 1981년도 입사한 사원중 급여가 2000불 이상인 사원의 수
select count(ename) from emp where to_char(hiredate, 'YY')=81 and sal>=2000;
select count(ename) from emp where hiredate like '81%' and sal>=2000;

-- max : 제일 큰 값
-- min : 제일 작은 값
select max(sal), min(sal) from emp;
select max(ename), min(ename) from emp;

-- 20번 부서의 사원수와 최고급여, 최저급여를 구하라.
--          5           3000        800
select count(ename), max(sal), min(sal) from emp where deptno=20;

-- sum : 합계
-- AVG : 평균
--      29025       2073            550일리가 없다
select sum(sal), floor(avg(sal)), avg(comm) from emp;
--      29025       2073            157
select sum(sal), floor(avg(sal)), floor(avg(nvl(comm,0))) from emp;
-- STDDEV : 표준편차
select round(stddev(sal),3) from emp where deptno=20 order by deptno;

-- GROUP BY : 
-- 사원수
select count(ename) from emp;
select deptno, count(ename) from emp group by deptno;
-- 담당업무(job)별 급여합계, 평균, 사원수를 구하라
select job, sum(sal) 급여합계, round(avg(sal),1) 급여평균, count(ename) from emp group by job order by job;

-- Having절 : group by에 대한 조건절 그룹함수의 결과를 이용하여 조건식을 세울때
-- 사원수가 3명 이상인 담당업무(job)만 통계를 구하라.
-- 업무별 사원수, 급여의 평균, 보너스의 평균을 출력
select job, count(empno), round(avg(sal),1) "급여의 평균", round(avg(nvl(comm,0)),1) "보너스 평균" 
from emp 
group by job 
having count(empno)>=3;

select * from emp;
-- 입사일기준 년도별 사원수, 최고급여, 급여의 합계, 급여의 평균을 
-- 년도를 오름차순으로 정렬하여 출력하라.
-- 사원이 2명 이상 입사한 년도만 출력
select to_char(hiredate,'YYYY') 입사년도, count(ename) 사원수, max(sal) 최고급여, sum(sal) "급여의 합계", avg(sal) "급여의 평균"
from emp
group by to_char(hiredate, 'YYYY') 
having count(ename)>=2 
order by to_char(hiredate, 'YYYY');

-- Rollup : group by절에 표시하며 전체의 통계를 구한다.            1
select job, sum(sal), round(avg(sal), 1),  count(empno), grouping(job) from emp group by rollup(job);
-- 부서별(deptno), 담당업무별 급여 합계를 구하라.
select deptno, job, sum(sal), count(empno) from emp group by rollup(deptno, job);--웽 
select deptno, job, sum(sal), count(empno), grouping(deptno), grouping(job) from emp
group by rollup(deptno, job) order by deptno asc;

-- cube 
-- 1차 deptno별로 통계, 2차 job별로 통계
select deptno, job, sum(sal), count(empno) from emp group by cube(deptno, job) order by deptno asc;

-- Grouping()
select deptno, job, sum(sal), grouping(deptno), grouping(job)
from emp
group by cube(deptno, job) order by deptno asc;


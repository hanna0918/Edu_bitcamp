-- �׷��Լ�
-- count(): ������ ��
select count(ename), count(comm), count(deptno) from emp;
select * from emp;
-- 10���μ��� �����
select count(ename) from emp where deptno=10;
--�������� 'MANAGER'�̰ų� 'SALESMAN'�� ����� ��
select count(ename) from emp where job='MANAGER' or job='SALESMAN';
--����� 1981�⵵ �Ի��� ����� �޿��� 2000�� �̻��� ����� ��
select count(ename) from emp where to_char(hiredate, 'YY')=81 and sal>=2000;
select count(ename) from emp where hiredate like '81%' and sal>=2000;

-- max : ���� ū ��
-- min : ���� ���� ��
select max(sal), min(sal) from emp;
select max(ename), min(ename) from emp;

-- 20�� �μ��� ������� �ְ�޿�, �����޿��� ���϶�.
--          5           3000        800
select count(ename), max(sal), min(sal) from emp where deptno=20;

-- sum : �հ�
-- AVG : ���
--      29025       2073            550�ϸ��� ����
select sum(sal), floor(avg(sal)), avg(comm) from emp;
--      29025       2073            157
select sum(sal), floor(avg(sal)), floor(avg(nvl(comm,0))) from emp;
-- STDDEV : ǥ������
select round(stddev(sal),3) from emp where deptno=20 order by deptno;

-- GROUP BY : 
-- �����
select count(ename) from emp;
select deptno, count(ename) from emp group by deptno;
-- ������(job)�� �޿��հ�, ���, ������� ���϶�
select job, sum(sal) �޿��հ�, round(avg(sal),1) �޿����, count(ename) from emp group by job order by job;

-- Having�� : group by�� ���� ������ �׷��Լ��� ����� �̿��Ͽ� ���ǽ��� ���ﶧ
-- ������� 3�� �̻��� ������(job)�� ��踦 ���϶�.
-- ������ �����, �޿��� ���, ���ʽ��� ����� ���
select job, count(empno), round(avg(sal),1) "�޿��� ���", round(avg(nvl(comm,0)),1) "���ʽ� ���" 
from emp 
group by job 
having count(empno)>=3;

select * from emp;
-- �Ի��ϱ��� �⵵�� �����, �ְ�޿�, �޿��� �հ�, �޿��� ����� 
-- �⵵�� ������������ �����Ͽ� ����϶�.
-- ����� 2�� �̻� �Ի��� �⵵�� ���
select to_char(hiredate,'YYYY') �Ի�⵵, count(ename) �����, max(sal) �ְ�޿�, sum(sal) "�޿��� �հ�", avg(sal) "�޿��� ���"
from emp
group by to_char(hiredate, 'YYYY') 
having count(ename)>=2 
order by to_char(hiredate, 'YYYY');

-- Rollup : group by���� ǥ���ϸ� ��ü�� ��踦 ���Ѵ�.            1
select job, sum(sal), round(avg(sal), 1),  count(empno), grouping(job) from emp group by rollup(job);
-- �μ���(deptno), �������� �޿� �հ踦 ���϶�.
select deptno, job, sum(sal), count(empno) from emp group by rollup(deptno, job);--�� 
select deptno, job, sum(sal), count(empno), grouping(deptno), grouping(job) from emp
group by rollup(deptno, job) order by deptno asc;

-- cube 
-- 1�� deptno���� ���, 2�� job���� ���
select deptno, job, sum(sal), count(empno) from emp group by cube(deptno, job) order by deptno asc;

-- Grouping()
select deptno, job, sum(sal), grouping(deptno), grouping(job)
from emp
group by cube(deptno, job) order by deptno asc;


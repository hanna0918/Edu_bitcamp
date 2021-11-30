import java.util.Scanner;
public class ArrayScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//데이터받기
		System.out.print("학생수=");
		int cnt = Integer.parseInt(scan.nextLine());
		
		String[] name = new String[cnt];	//학생 이름을 저장할 배열	
		int [][] jumsu = new int[cnt+2][6];	//학생 점수를 저장할 배열
		
		//이름, 점수 입력받아 배열에 저장		
		String title[] = {"국어", "영어", "수학"};
		for(int i=0; i<cnt; i++) {//3-> 0,1,2	행번호	
			System.out.print("이름=");
			name[i] = scan.nextLine();
			for(int j=0; j<title.length; j++) {// 0,1,2		열번호
				System.out.print(title[j]+"=");
				jumsu[i][j] = Integer.parseInt(scan.nextLine());
			}			
		}
		//개인별 총점, 평균
		//과목별 총점, 평균
		for(int i=00; i<cnt; i++) {//0,1,2
			for(int j=0; j<3; j++) {//0,1,2
				jumsu[i][3] += jumsu[i][j];//개인별 총점
				jumsu[cnt][j] += jumsu[i][j];//과목별 총점
			}
			//개인별 평균
			jumsu[i][4] = jumsu[i][3]/3;
		}
		//과목별 평균
		for(int i=0; i<3; i++) {
			jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
		}
		//석차구하기
		for(int i=0; i<cnt; i++) {//0,1,2
			//i가 본인점수 위치
			for(int j=0; j<cnt; j++) {
				//		내점수 		상대방점수
				if(jumsu[i][3] < jumsu[j][3]) {
					jumsu[i][5]++;
				}
			}
			jumsu[i][5]++;
		}
		
		//석차순으로 정렬
		for(int i=0; i<cnt-1; i++) {//3명 ->0,1
			//				3-1-0
			for(int j=0; j<cnt-1-i; j++) {//3명 ->0,1
				if(jumsu[j][5]>jumsu[j+1][5]) {
					//교환
					//이름바꾸기
					String nameTemp = name[j];
					name[j] = name[j+1];
					name[j+1] = nameTemp;
					
					for(int k=0; k<jumsu[j].length; k++) {//0,1,2,3,4,5
						int temp = jumsu[j][k];
						jumsu[j][k] = jumsu[j+1][k];
						jumsu[j+1][k] = temp;
					}
				}
			}
		}
		
		
		//=============================출력
		
		System.out.println("===================================================");
		System.out.println("이름	국어	영어	수학	총점	평균	석차");
		System.out.println("===================================================");
		
		for(int i=0; i<cnt; i++) {//i=0
			//이름출력
			System.out.print(name[i]+"\t");
			
			//점수출력 국어, 영어, 수학, 총점, 평균
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
				
			}
			System.out.println();
		}
		//과목별 총점
		System.out.print("총점\t");
		for(int i=0; i<3; i++) {//0,1,2		3 이유->과목수
			System.out.print(jumsu[cnt][i]+"\t");
		}
		System.out.println();
		//과목별 평균
		System.out.print("평균\t");
		for(int i=0; i<3; i++) {
			System.out.print(jumsu[cnt+1][i]+"\t");
		}
		System.out.println();		
		
	}

}
/*
학생수를 입력받아 이름과, 세과목의 점수를 입력받은 후 
각 학생의 총점, 평균, 석차, 과목별 총점, 평균을 구하여
석차순으로 출력하라.

실행
학생수=3
이름=
국어=
영어=
수학=
이름=
:
:
이름=
:
:
수학=
===================================================
이름		국어		영어		수학		총점		평균		석차
===================================================
홍		80		98		70		248		82.6	
이		70		70		80		220				
박		
과목별총점	-		-		-		
과목별평균	-		-		-	


*/
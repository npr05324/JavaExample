import java.util.*;


public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,num,cho;
a=0;
b=0;
Scanner star =new Scanner(System.in); // 스캐너 클래스 객체생성
Scanner form=new Scanner(System.in);


 System.out.printf("모양선택 1: 정직각사각형 2:역직각사각형 \n");
 System.out.printf("값:");
 cho=form.nextInt();
 System.out.printf("몇줄??\n");
 System.out.printf("값:");
 num=star.nextInt();

switch(cho){
case 1:
	while(a<=num){
		while(b<a){
			System.out.printf("*");
			b++;
			
			}
		b=0;
		System.out.printf("\n");
		a++;}
break;

case 2:
	a=num;
	while(a>=0){
		while(b<a){
			System.out.printf("*");
			b++;
			
			
			
		}
		b=0;
		System.out.printf("\n");
		a--;
		
	}break;

}

}




		
	}



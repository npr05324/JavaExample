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
Scanner star =new Scanner(System.in); // ��ĳ�� Ŭ���� ��ü����
Scanner form=new Scanner(System.in);


 System.out.printf("��缱�� 1: �������簢�� 2:�������簢�� \n");
 System.out.printf("��:");
 cho=form.nextInt();
 System.out.printf("����??\n");
 System.out.printf("��:");
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



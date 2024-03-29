# 최한솔 학번 : 202130235

## 3월 29일 강의
타입 변환 - 변수나 상수 혹은 리터럴을 다른 타입으로 변환하는 것을 말한다.  
O 자동 타입 변환  - 치환문(=)이나 수식 내에서 타입이 일치하지 않을 때, 컴파일러는 작은 타입을 큰 타입으로 자동 변환한다.  
O 강제 타입 변환  - 캐스팅(casting)이라고 부름.  
강제 타입 변환의 에시 int n = 300; byte b = n;(X) byte b = (byte)n; (o)  

자바의 키 입력
O System.in - 표준 입력 스트림 객체,키 값을 바이트 정보로 바꾸어 제공하는 저수준 스트림 객체  
O Scanner를 이용한 키 입력  
o scanner 객체 생성 - Scanner scanner = new Scanner(System.in);
O import문 필요 - scanner를 사용하기 위해서는 프로그램의 맨 앞줄에 import문이 필요함  
예시 - import java.util.Scanner;  
O Scanner 스트림 닫기 - scanner.close();
  
연산자 - 주어진 식을 계산하여 결과를 얻어내는 과정을 연산이라고 한다.  
O 산술 연산 - 더하기,빼기,곱하기,나누기,나머지 5개이며 /는 몫을 구하며 %는 나머지를 구한다.  
O 증감 연산 - ++,-- 두 가지이며, 피연산자의 앞 또는 뒤에 붙어 값을 1 증가시키거나 1 감소시킨다.  
O 대입 연산 - 오른쪽 식의 결과를 왼쪽에 있는 변수에 대입한다.  
대입 연산의 예 int a = 1,b = 3;  a = b; a += b;  a=6 , b는 3 그대로  
O 비교연산 - 두 개의 피연산자를 비교하여 true 또는 false의 논리 결과를 내는 연산자  
O 조건연산 - 세 개의 피연산자로 구성되어 삼항(ternary) 연산자 라고 불리며 condition ? opr2 : opr3 
condition이 true 이면 opr2의 값이, false 이면 opr3의 값이 된다.  
O 비트 연산,시프트 연산 - 비트연산은 비트끼리 AND, OR, XOR, NOT 연산을 하는 비트논리연산, 비트를 오른쪽 왼쪽으로 이동시키는 비트 시프트 연산이 있다.  
시프트 연산 역시 각 비트들을 대상으로 연산이 이루어지며 3개의 연산자가 있으며 float, double, boolean데이터는 시프트 연산을 할 수 없다.

조건문   
O 단순 IF문 - 조건식은 비교연산이나 논리 연산의 혼합된 식으로 구성되며 결과는 불린 값이다. 조건식이 참이면 IF 내부의 실행 문장이 실행되며ㅡ 거짓이면 IF문을 벗어난다.  
O if-else 문 - if의 조건식이 참인 경우와 거짓인 경우에 실행할 문장을 각각 지시한다. 조건식이 true이면 실행문장 1을 행한 후 if-else문을 벗어나고, false이면 실행문장 2를 실행한 후 if-else문을 벗어난다.  
(다중 if-else문은 if-else가 연속되는 것이다.)  
O 중첩 if-else문 - if문이나 if-else문, 혹은 else문의 '실행 문장'에 if문이나 if-else문을 내포할 수 있다.   
O switch 문 - 값에 따라 여러 방향으로 분기하는 경우, if 문보다 switch 문을 사용하면 가독성이 높은 좋은 코드를 작성할 수 있다. 

반복문
O for 문 - 작업문은 for문이 반복되는 동안 매번 실행되며, 작업문이 하나의 문장인 경우 중괄호({})가 필요 없다. 초기문에서는 대개 for문의 조건식에서 사용하는 변수를 초기화한다. 조건식에는 논리 변수나 논리 연산을 사용하며, 조건식의 결과가 true인 경우에 반복이 계속되고 false가 되면 for문을 벗어난다.  
O while 문 - 조건식은 for문과 동일하다. true인 경우 반복이 게속되며, false인 경우 while문을 벗어난다. for문과 달리 조건식이 없으면 컴파일 오류가 발생한다.  
O do-while 문 - 조건식은 while문과 동일하며, 조건식이 없으면 컴파일 오류가 발생. 다른 반복문과 달리 작업문 실행 후 반복 조건을 따지므로 작업문이 최초 한번은 반드시 실행된다.  
O 중첩 반복 - 반복문 안에 다른 반복문을 만들 수 있다. for문 안에 for문 이나 while 문을 만들 수도 있고,while 문 안에 for,while,do - while 문을 둘 수 있다.
O continue 문과 break 문 - 반복문과 함께 사용되면서 반복의 흐름을 바꾸거나, 반복에서 벗어나게 하는 중요한 기능을 한다. continue 문은 반복문을 빠져나가지 않으면서 즉시 다음 반복으로 넘어가고자할 때 사용됨 break문은 하나의 반복문을 즉시 벗어날 때 사용함.

배열  - 인덱스와 인덱스에 대응하는 일련의 데이터들로 이루어진 연속적인 자료구조로서, 배열에는 같은 종류의 데이터들이 순차적으로 저장된다. 10개의 정수 값을 합할 때, 10개의 변수를 사용한 경우와 자바 배열을 사용한 경우를 대조하여 보여준다.  
배열 선언 및 생성 - 자바에서 배열을 생성하는 방법은 C/C++와 달리 래퍼런스 변수 선언과 배열 생성의 단계가 필요하며, 5개의 정수 배열을 만드는 과정을 보여줌.   
배열 선언문 - int intArray[];  
O 배열 생성 - 배열 공간을 할당받는 과정. 반드시 new연산자를 이용하여 배열을 생성하며 []안에 생성할 원소 개수를 지정한다. int intArray = new int[5]; 다음과 같이 배열 선언과 생성을 동시에 할 수도 있다.  
O 배열 초기화 - '{}' 사이에 원소를 나열하여 초기화된 배열을 만들 수 있다.
O 배열 인덱스와 배열 원소 접근 - 배열의 인덱스는 정수만 가능하며, 인덱스는 0부터 시작하고 마지막 원소의 인덱스는 [배열 크기-1] 이다. 
O 래퍼런스 치환과 배열 공유 - 배열 공간과 레퍼런스 변수가 분리되어 있기 때문에 생성된 배열에 대한 공유가 쉽게 이루어진다. 즉 생성된 배열을 다수의 래퍼런스가 참조 할 수 있다.  
O 배열의 크기, length필드 - 자바는 배열을 객체로 다룬다. 배열이 생성되면 배열 공간과 함께 배열의 크기 값을 가진 length필드가 배열 객체 내에 생성된다. length 필드를 이용하면 프로그램에서 배열의 크기를 따로 관리할 필요가 없다.  
O 배열과 for-each문 - for 문을 변형한 for-each문은 배열이나 나열의 크기만큼 루프를 돌면서, 각 원소를 순차적으로 접근하는데 매우 유용하다.



## 3월 22일 강의
자바 프로젝트 및 클래스 생성 하는 방법 그리고 소스 편집 컴파일 및 실행 하는 방법을 배웠다.  

자바 응용프로그램의 종류 - 데스크톱 응용프로그램,자바 서블릿 응용프로그램 등이 있으며 모바일 응용프로그램이 있다  

자바의 특징 - 플랫폼 독립성 , 객체지향 , 클래스로 캡슐화 , 소스와 클래스 파일 , 실행코드배포 , 패키지 , 멀티스레드 등등이 있다.  

자바프로그램의 구조 - 클래스, 주석문, 메소드, main()메소드, 메소드호출, 변수, 화면출력 으로 구성되어 있다.  

식별자 - 클래스, 변수, 상수, 메소드에 붙이는 이름을 말한다.  
        식별자로 한글을 사용할 수 있으며, 첫번째 문자는 숫자를 사용할 수 없고 대소문자를 구별한다.  


## 3월 15일 강의
10:00 ~ 11:50 깃 허브 주소를 복사하여 vscode에 붙여넣기 하고 깃허브를 활용하는 방법을 배웠다.
              SOURCE CONTROL 에서 내용을 넣고 commit을 누르고 업로드를 하면 나의 깃허브 주소에 내가 
              vs code에서 작성한 내용이 올라가게 되는 방식이다.

12:00 ~ 12:50 java 개발 환경 구축   
              openJDK 설치 - 설치가 오래 걸려 설치 하다가 끝남
              Eclips 설치 - 설치하였으나 교수님께서는 VSCODE를 사용하여 수업을 진행하심.  
              Eclips에 openJDK 연결 - Eclips와 JDK를 연결하여 eclips를 통해 테스트 완료  
              자바 프로젝트 생성 - 자바에서 텍스트를 출력하는 방법을 간단하게 배웠다.

